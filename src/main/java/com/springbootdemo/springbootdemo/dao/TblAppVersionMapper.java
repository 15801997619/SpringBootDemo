package com.springbootdemo.springbootdemo.dao;

import com.springbootdemo.springbootdemo.model.TblAppVersion;

public interface TblAppVersionMapper {
    int deleteByPrimaryKey(String id);

    int insert(TblAppVersion record);

    int insertSelective(TblAppVersion record);

    TblAppVersion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblAppVersion record);

    int updateByPrimaryKey(TblAppVersion record);
}