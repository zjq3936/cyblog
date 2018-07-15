package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.Ips;

public interface IpsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ips record);

    int insertSelective(Ips record);

    Ips selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ips record);

    int updateByPrimaryKey(Ips record);
}