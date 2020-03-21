package com.qin.entity;

import java.util.Date;

public class User1 {

	private int id ;//主键ID
	private String userCode;//用户编码
	private String  userName;//用户名称
	private String  userPassword;//用户密码
	private   int gender;//性别（1:女、 2:男）
	private Date birthday;//出生日期
	private String phone;//手机号码
	private String  address;//地址
	private   int userRole;// 用户角色（取自角色表-角色id）
	private   int createdBy;//创建者（userId）
	private Date creationDate;//创建时间
	private   int modifyBybig;//更新者（userId）
	private   Date modifyDate;//更新时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBybig() {
		return modifyBybig;
	}
	public void setModifyBybig(int modifyBybig) {
		this.modifyBybig = modifyBybig;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}


}
