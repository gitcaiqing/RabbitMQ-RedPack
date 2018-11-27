package com.sc.mapper;

import com.sc.entity.UserRedpack;

public interface UserRedpackMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(UserRedpack record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(UserRedpack record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    UserRedpack selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(UserRedpack record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(UserRedpack record);
}