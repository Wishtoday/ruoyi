package com.ruoyi.campus.domain;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 校园网信息表 campus
 * 
 * @author ruoyi
 */
public class Campus extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 校园网信息ID */
    private Long campusId;

    /** 身份证号*/
    private String idNo;

    /** 证件类型*/
    private String idType;

    /** 学号 */
    private String studentId;

    /** 学生姓名 */
    private String name;

    /** 联系电话 */
    private String mobilePhone;

    /** 办网手机号 */
    private String networkMobilePhone;

    /** 宿舍区域 */
    private String dormitoryArea;

    /** 宿舍号 */
    private String dormitoryNo;

    /** 院系 */
    private String department;

    /** 网络运行商类型（移动、联通、电信） */
    private String networkType;

    /** 套餐方式 */
    private String setMeal;

    /** 申请状态（1审批中 2审批通过 3审批拒绝） */
    private String status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCampusId() {
        return campusId;
    }

    public Campus setCampusId(Long campusId) {
        this.campusId = campusId;
        return this;
    }

    public String getIdNo() {
        return idNo;
    }

    public Campus setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }

    public String getIdType() {
        return idType;
    }

    public Campus setIdType(String idType) {
        this.idType = idType;
        return this;
    }

    public String getStudentId() {
        return studentId;
    }

    public Campus setStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Campus setName(String name) {
        this.name = name;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public Campus setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getNetworkMobilePhone() {
        return networkMobilePhone;
    }

    public Campus setNetworkMobilePhone(String networkMobilePhone) {
        this.networkMobilePhone = networkMobilePhone;
        return this;
    }

    public String getDormitoryArea() {
        return dormitoryArea;
    }

    public Campus setDormitoryArea(String dormitoryArea) {
        this.dormitoryArea = dormitoryArea;
        return this;
    }

    public String getDormitoryNo() {
        return dormitoryNo;
    }

    public Campus setDormitoryNo(String dormitoryNo) {
        this.dormitoryNo = dormitoryNo;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Campus setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getNetworkType() {
        return networkType;
    }

    public Campus setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    public String getSetMeal() {
        return setMeal;
    }

    public Campus setSetMeal(String setMeal) {
        this.setMeal = setMeal;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Campus setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "campusId=" + campusId +
                ", idNo='" + idNo + '\'' +
                ", idType='" + idType + '\'' +
                ", studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", networkMobilePhone='" + networkMobilePhone + '\'' +
                ", dormitoryArea='" + dormitoryArea + '\'' +
                ", dormitoryNo='" + dormitoryNo + '\'' +
                ", department='" + department + '\'' +
                ", networkType='" + networkType + '\'' +
                ", setMeal='" + setMeal + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
