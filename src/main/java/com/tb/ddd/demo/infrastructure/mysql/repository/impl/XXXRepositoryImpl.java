package com.tb.ddd.demo.infrastructure.mysql.repository.impl;

import com.tb.ddd.demo.infrastructure.mysql.dao.XXXDao;
import com.tb.ddd.demo.infrastructure.mysql.repository.XXXRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implement Repository by using mybatis or jpa.
 */
@Service
public class XXXRepositoryImpl implements XXXRepository {
    @Autowired
    XXXDao xxxDao;

}
