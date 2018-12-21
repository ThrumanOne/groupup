package com.thruman.java.common.util.temp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartException;

@ControllerAdvice
@Order(1)
public class BusinessExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(BusinessExceptionHandler.class);

    public BusinessExceptionHandler() {
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public RestResult handleException(Exception exception) {
        BusinessException businessException = new BusinessException(ResultCodeEnum.SYSTEM_EXCEPTION.getCode(), exception);
        LOG.error(businessException.getMessage(), exception);
        RestResult baseResult = new RestResult();
        baseResult.code(businessException.getExCode()).message(businessException.getExDesc());
        return baseResult;
    }


    @ExceptionHandler({HttpMediaTypeNotSupportedException.class, HttpMediaTypeNotAcceptableException.class, HttpRequestMethodNotSupportedException.class})
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public RestResult handleHttpMediaTypeNotSupportedException(Exception ex) {
        BusinessException businessException = new BusinessException(ResultCodeEnum.BAD_REQUEST_MEDIA_TYPE.getCode(), ex);
        RestResult baseResult = new RestResult();
        baseResult.code(businessException.getExCode()).message(businessException.getExDesc());
        LOG.error(ex.getMessage(), ex);
        return baseResult;
    }

    @ExceptionHandler({MultipartException.class})
    @ResponseBody
    public RestResult handleMultipartException(Exception ex) {
        BusinessException businessException = new BusinessException(ResultCodeEnum.PARAM_BIND_EXCEPTION.getCode(), ex);
        RestResult baseResult = new RestResult();
        baseResult.code(businessException.getExCode()).message(businessException.getExDesc());
        return baseResult;
    }


    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    public RestResult handleBusinessException(BusinessException ex) {
        if (ex.getExCode() == ResultCodeEnum.SYSTEM_EXCEPTION.getCode()) {
            LOG.error(ex.getMessage(), ex);
        } else {
            LOG.warn(ex.getMessage());
        }

        RestResult baseResult = new RestResult();
        baseResult.code(ex.getExCode()).message(ex.getExDesc());
        return baseResult;
    }


}