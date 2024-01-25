package com.tb.ddd.demo.infrastructure.mysql.converter;

import com.tb.ddd.demo.infrastructure.mysql.po.XXXPo;
import org.springframework.beans.BeanUtils;

/**
 * <h1>Convert the po into entity or entity into po.</h1>
 */
public class XXXConverter {
    //    PO转Entity
    public static XXX deserialize(XXXPo blogPO) {
        //...
        return null;
    }

    //    Entity转PO
    public static BlogPO serialize(BlogEntity blogEntity){
        //...
        return null;
    }
}
