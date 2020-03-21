package entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private int id;//bigint(20) NOT NULL主键ID
	private String userCode;//varchar(15) NULL用户编码
	private String userName;//varchar(15) NULL用户名称
	private String userPwd;//varchar(15) NULL用户密码
	private int gender;//int(10) NULL性别（1:女、 2:男）
	private Date birthday;//date NULL出生日期
	private String phonevar;//char(15) NULL手机
	//private List<Address> address;//varchar(30) NULL地址
	private Role userRole;//bigint(20) NULL用户角色（取自角色表-角色id）
	private int createdBy;//bigint(20) NULL创建者（userId）
	private Date creationDate;//datetime NULL创建时间
	private int modifyBy;//bigint(20) NULL更新者（userId）
	private Date modifyDate;//datetime NULL更新时间
	
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
		return userPwd;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPwd = userPassword;
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
	
	public String getPhonevar() {
		return phonevar;
	}
	
	public void setPhonevar(String phonevar) {
		this.phonevar = phonevar;
	}
	
	/**public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public List<Address> getAddress() {
		return address;
	}*/
	
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	
	public Role getUserRole() {
		return userRole;
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
	
	public int getModifyBy() {
		return modifyBy;
	}
	
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	
	public Date getModifyDate() {
		return modifyDate;
	}
	
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
