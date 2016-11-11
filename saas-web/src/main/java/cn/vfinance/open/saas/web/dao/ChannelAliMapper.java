package cn.vfinance.open.saas.web.dao;

import cn.vfinance.open.saas.web.model.ChannelAli;

public interface ChannelAliMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_ali
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_ali
     *
     * @mbggenerated
     */
    int insert(ChannelAli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_ali
     *
     * @mbggenerated
     */
    int insertSelective(ChannelAli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_ali
     *
     * @mbggenerated
     */
    ChannelAli selectByPrimaryKey(Integer id);

    ChannelAli selectByMerchantIdAndCode(ChannelAli channelAli);

    ChannelAli selectByPidAndCode(ChannelAli channelAli);

    ChannelAli selectBySelective(ChannelAli channelAli);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_ali
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChannelAli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_ali
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChannelAli record);

    int updateStatusByAppAndCode(ChannelAli channelAli);
}