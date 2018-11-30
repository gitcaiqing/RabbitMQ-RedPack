package com.sc.mapper;

import com.sc.entity.UserRedpack;

public interface UserRedpackMapper {
    int deleteByPrimaryKey(Integer id);
    
    int insert(UserRedpack record);
    
    int insertSelective(UserRedpack record);
    
    UserRedpack selectByPrimaryKey(Integer id);
    
    int updateByPrimaryKeySelective(UserRedpack record);
    
    int updateByPrimaryKey(UserRedpack record);
}