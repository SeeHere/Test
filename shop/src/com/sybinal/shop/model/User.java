package com.sybinal.shop.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_name
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.pwd
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String pwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.nickname
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.email
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.enabled
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private Integer enabled;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.open_id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String openId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.oauth_type
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String oauthType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.image
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String image;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.last_login_time
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private Date lastLoginTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.register_time
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private Date registerTime;
	
	
	private String lastLoginTimeFrom;
	
	private String lastLoginTimeTo;

	private String registerTimeFrom;
	
	private String registerTimeTo;
	
	private String fromAPI;
	
	private String role;
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLastLoginTimeFrom() {
		return lastLoginTimeFrom;
	}

	public void setLastLoginTimeFrom(String lastLoginTimeFrom) {
		this.lastLoginTimeFrom = lastLoginTimeFrom;
	}

	public String getLastLoginTimeTo() {
		return lastLoginTimeTo;
	}

	public void setLastLoginTimeTo(String lastLoginTimeTo) {
		this.lastLoginTimeTo = lastLoginTimeTo;
	}

	public String getRegisterTimeFrom() {
		return registerTimeFrom;
	}

	public void setRegisterTimeFrom(String registerTimeFrom) {
		this.registerTimeFrom = registerTimeFrom;
	}

	public String getRegisterTimeTo() {
		return registerTimeTo;
	}

	public void setRegisterTimeTo(String registerTimeTo) {
		this.registerTimeTo = registerTimeTo;
	}

	public String getFromAPI() {
		return fromAPI;
	}

	public void setFromAPI(String fromAPI) {
		this.fromAPI = fromAPI;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_name
	 * @return  the value of user.user_name
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_name
	 * @param userName  the value for user.user_name
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.pwd
	 * @return  the value of user.pwd
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.pwd
	 * @param pwd  the value for user.pwd
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.nickname
	 * @return  the value of user.nickname
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.nickname
	 * @param nickname  the value for user.nickname
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.email
	 * @return  the value of user.email
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.email
	 * @param email  the value for user.email
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.enabled
	 * @return  the value of user.enabled
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.enabled
	 * @param enabled  the value for user.enabled
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.open_id
	 * @return  the value of user.open_id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.open_id
	 * @param openId  the value for user.open_id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.oauth_type
	 * @return  the value of user.oauth_type
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getOauthType() {
		return oauthType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.oauth_type
	 * @param oauthType  the value for user.oauth_type
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setOauthType(String oauthType) {
		this.oauthType = oauthType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.image
	 * @return  the value of user.image
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.image
	 * @param image  the value for user.image
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.last_login_time
	 * @return  the value of user.last_login_time
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")  
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.last_login_time
	 * @param lastLoginTime  the value for user.last_login_time
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.register_time
	 * @return  the value of user.register_time
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	public Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.register_time
	 * @param registerTime  the value for user.register_time
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
}