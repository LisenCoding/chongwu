package com.entity.vo;

import com.entity.EmailregistercodeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 邮箱验证码
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-22 08:24:48
 */
public class EmailregistercodeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 角色
	 */
	
	private String role;
		
	/**
	 * 验证码
	 */
	
	private String code;
				
	
	/**
	 * 设置：角色
	 */
	 
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * 获取：角色
	 */
	public String getRole() {
		return role;
	}
				
	
	/**
	 * 设置：验证码
	 */
	 
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * 获取：验证码
	 */
	public String getCode() {
		return code;
	}
			
}
