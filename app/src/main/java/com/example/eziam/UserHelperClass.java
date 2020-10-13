package com.example.eziam;

public class UserHelperClass {

    String name, idNo, phoneNo, tenantN, houseNo, time;

    public UserHelperClass() {
    }

    public UserHelperClass(String name, String idNo, String phoneNo, String tenantN, String houseNo, String time) {
        this.name = name;
        this.idNo = idNo;
        this.phoneNo = phoneNo;
        this.tenantN = tenantN;
        this.houseNo = houseNo;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getTenantN() {
        return tenantN;
    }

    public void setTenantN(String tenantN) {
        this.tenantN = tenantN;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
