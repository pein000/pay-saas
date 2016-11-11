package cn.vfinance.open.saas.web.model;

import java.util.Date;
import java.util.List;

public class MerchantRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_channel_role.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_channel_role.ROLE_CODE
     *
     * @mbggenerated
     */
    private String roleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_channel_role.ROLE_NAME
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_channel_role.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    private List<MerchantPriviledgeGroup> priviledgeGroupList;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_channel_role.ID
     *
     * @return the value of auth_channel_role.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_channel_role.ID
     *
     * @param id the value for auth_channel_role.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_channel_role.ROLE_CODE
     *
     * @return the value of auth_channel_role.ROLE_CODE
     *
     * @mbggenerated
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_channel_role.ROLE_CODE
     *
     * @param roleCode the value for auth_channel_role.ROLE_CODE
     *
     * @mbggenerated
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_channel_role.ROLE_NAME
     *
     * @return the value of auth_channel_role.ROLE_NAME
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_channel_role.ROLE_NAME
     *
     * @param roleName the value for auth_channel_role.ROLE_NAME
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_channel_role.CREATE_TIME
     *
     * @return the value of auth_channel_role.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_channel_role.CREATE_TIME
     *
     * @param createTime the value for auth_channel_role.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<MerchantPriviledgeGroup> getPriviledgeGroupList() {
        return priviledgeGroupList;
    }

    public void setPriviledgeGroupList(List<MerchantPriviledgeGroup> priviledgeGroupList) {
        this.priviledgeGroupList = priviledgeGroupList;
    }
}