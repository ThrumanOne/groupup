package com.thruman.dao.cluster;

import com.thruman.pojo.ProductEntity;
import org.apache.ibatis.annotations.Select;
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
public interface CAddressMapper {

    @Select("select * from product where id = 1")
    ProductEntity select();
}
