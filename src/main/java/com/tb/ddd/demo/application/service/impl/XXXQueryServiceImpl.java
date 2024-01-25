package com.tb.ddd.demo.application.service.impl;

import com.tb.ddd.demo.application.service.XXXQueryService;
import com.tb.ddd.demo.domain.bbb.model.entity.XXXEntity;
import com.tb.ddd.demo.infrastructure.mysql.repository.XXXRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * QueryService can call infrastructure directly.
 */
@Service
public class XXXQueryServiceImpl implements XXXQueryService {
    @Autowired
    XXXRepository xxxRepository;

    public XXXEntity selectXXXById(Long id){
        //1. get object
        XXXEntity entity = xxxRepository.byId(id);

        //2. do check
        entity.check();

        //3. do compute
        entity.updatePrice();

        //4. rpc, bind field
        entity.bindBrand(xxxFeignService.getBrandById(entity.getId()));
        //5. return
        return entity;
    }

}
