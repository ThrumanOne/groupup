package com.thruman.dao.master;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * 类说明
 * <p>
 *
 * @author niexiang
 * @version 1.0.0
 * @date 2018/12/7
 */
@Repository
public interface MAddressMapper {

    @Insert("")
    Object insert();

}
