package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 微信登录实体类
 *
 */
/*
CREATE TABLE `tb_wechat_auth` (
	`wechat_auth_id` INT (10) NOT NULL AUTO_INCREMENT,
	`user_id` INT (10) NOT NULL,
	`open_id` VARCHAR (80) NOT NULL DEFAULT '',
	`create_time` datetime DEFAULT NULL,
	PRIMARY KEY (`wechat_auth_id`),
	UNIQUE KEY `open_id` (`open_id`),
	KEY `fk_wechatauth_profile` (`user_id`),
	CONSTRAINT `fk_wechatauth_profile` FOREIGN KEY (`user_id`) REFERENCES `tb_person_info` (`user_id`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;
 */
public class WechatAuth {
	// 主键ID
	private Long wechatAuthId;
	// 微信获取用户信息的凭证，对于某个公众号具有唯一性
	private String openId;
	// 创建时间
	private Date createTime;
	// 用户信息
	private PersonInfo personInfo;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
