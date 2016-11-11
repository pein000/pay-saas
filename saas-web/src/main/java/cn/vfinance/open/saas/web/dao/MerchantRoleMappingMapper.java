package cn.vfinance.open.saas.web.dao;

import cn.vfinance.open.saas.web.model.MerchantRoleMapping;

public interface MerchantRoleMappingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_merchant_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    int deleteByMerchantId(Integer merchantId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_merchant_role
     *
     * @mbggenerated
     */
    int insert(MerchantRoleMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_merchant_role
     *
     * @mbggenerated
     */
    int insertSelective(MerchantRoleMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_merchant_role
     *
     * @mbggenerated
     */
    MerchantRoleMapping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_merchant_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MerchantRoleMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_merchant_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MerchantRoleMapping record);
}