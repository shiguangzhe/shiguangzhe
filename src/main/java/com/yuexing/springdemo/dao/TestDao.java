package com.yuexing.springdemo.dao;

import com.yuexing.springdemo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    TestEntity getById(Integer id);
}
