package com.tb.ddd.demo.domain.bbb.model.entity;

import com.tb.ddd.demo.infrastructure.mysql.repository.XXXRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <h1>One entity corresponds to one po.</h1>
 * <p>
 *     Entity can contain some methods such as valid, hash, convert vo...
 * </p>
 * <p>
 *     Entity can use enum to replace the int field of po object.
 * </p>
 */
@Data
public class XXXEntity {
    @Autowired
    XXXRepository xxxRepository;

    public static void save(XXXEntity entity){
        xxxRepository.save(entity);
    }

}
