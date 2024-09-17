package com.entity.vo;

import com.entity.ChongwujiyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物寄养
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-22 08:24:47
 */
public class ChongwujiyangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物分类
	 */
	
	private String chongwufenlei;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 是否进食
	 */
	
	private String shifoujinshi;
		
	/**
	 * 宠物状态
	 */
	
	private String chongwuzhuangtai;
		
	/**
	 * 是否饮水
	 */
	
	private String shifouyinshui;
		
	/**
	 * 寄养原因
	 */
	
	private String jiyangyuanyin;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 宠物详情
	 */
	
	private String chongwuxiangqing;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：宠物分类
	 */
	 
	public void setChongwufenlei(String chongwufenlei) {
		this.chongwufenlei = chongwufenlei;
	}
	
	/**
	 * 获取：宠物分类
	 */
	public String getChongwufenlei() {
		return chongwufenlei;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：是否进食
	 */
	 
	public void setShifoujinshi(String shifoujinshi) {
		this.shifoujinshi = shifoujinshi;
	}
	
	/**
	 * 获取：是否进食
	 */
	public String getShifoujinshi() {
		return shifoujinshi;
	}
				
	
	/**
	 * 设置：宠物状态
	 */
	 
	public void setChongwuzhuangtai(String chongwuzhuangtai) {
		this.chongwuzhuangtai = chongwuzhuangtai;
	}
	
	/**
	 * 获取：宠物状态
	 */
	public String getChongwuzhuangtai() {
		return chongwuzhuangtai;
	}
				
	
	/**
	 * 设置：是否饮水
	 */
	 
	public void setShifouyinshui(String shifouyinshui) {
		this.shifouyinshui = shifouyinshui;
	}
	
	/**
	 * 获取：是否饮水
	 */
	public String getShifouyinshui() {
		return shifouyinshui;
	}
				
	
	/**
	 * 设置：寄养原因
	 */
	 
	public void setJiyangyuanyin(String jiyangyuanyin) {
		this.jiyangyuanyin = jiyangyuanyin;
	}
	
	/**
	 * 获取：寄养原因
	 */
	public String getJiyangyuanyin() {
		return jiyangyuanyin;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
				
	
	/**
	 * 设置：宠物详情
	 */
	 
	public void setChongwuxiangqing(String chongwuxiangqing) {
		this.chongwuxiangqing = chongwuxiangqing;
	}
	
	/**
	 * 获取：宠物详情
	 */
	public String getChongwuxiangqing() {
		return chongwuxiangqing;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
