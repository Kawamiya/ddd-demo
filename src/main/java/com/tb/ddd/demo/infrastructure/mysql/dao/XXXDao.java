package com.tb.ddd.demo.infrastructure.mysql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tb.ddd.demo.infrastructure.mysql.po.XXXPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface XXXDao extends BaseMapper<XXXPo> {

}
