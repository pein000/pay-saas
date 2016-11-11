package cn.vfinance.open.saas.web.dao;

import cn.vfinance.open.saas.web.model.ChannelUnion;

public interface ChannelUnionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_union
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_union
     *
     * @mbggenerated
     */
    int insert(ChannelUnion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_union
     *
     * @mbggenerated
     */
    int insertSelective(ChannelUnion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_union
     *
     * @mbggenerated
     */
    ChannelUnion selectByPrimaryKey(Integer id);

    ChannelUnion selectByMerchantIdAndCode(ChannelUnion channelUnion);

    ChannelUnion selectBySelective(ChannelUnion channelUnion);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_union
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChannelUnion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_union
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChannelUnion record);

    int updateStatusByAppAndCode(ChannelUnion channelUnion);
}