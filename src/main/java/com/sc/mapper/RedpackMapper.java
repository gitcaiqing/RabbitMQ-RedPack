package com.sc.mapper;

import com.sc.entity.Redpack;

public interface RedpackMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(Redpack record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(Redpack record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    Redpack selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(Redpack record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(Redpack record);
    
    /**
     * 查询红包剩余个数
     * @param id
     * @return
     */
    int selectRemainByPrimaryKey(Integer id);

    /**
     * 扣减红包剩余个数
     * @param id
     * @return
     */
	int updateRemainRedPack(Integer id);
}