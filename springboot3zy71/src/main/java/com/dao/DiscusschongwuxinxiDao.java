package com.dao;

import com.entity.DiscusschongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuxinxiVO;
import com.entity.view.DiscusschongwuxinxiView;


/**
 * 宠物信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-22 08:24:48
 */
public interface DiscusschongwuxinxiDao extends BaseMapper<DiscusschongwuxinxiEntity> {
	
	List<DiscusschongwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
	
	DiscusschongwuxinxiVO selectVO(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
	
	List<DiscusschongwuxinxiView> selectListView(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);

	List<DiscusschongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
	
	DiscusschongwuxinxiView selectView(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
	

}
