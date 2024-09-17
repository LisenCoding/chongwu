package com.dao;

import com.entity.DiscussrexiaopaixingbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrexiaopaixingbangVO;
import com.entity.view.DiscussrexiaopaixingbangView;


/**
 * 热销排行榜评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-22 08:24:48
 */
public interface DiscussrexiaopaixingbangDao extends BaseMapper<DiscussrexiaopaixingbangEntity> {
	
	List<DiscussrexiaopaixingbangVO> selectListVO(@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
	
	DiscussrexiaopaixingbangVO selectVO(@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
	
	List<DiscussrexiaopaixingbangView> selectListView(@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);

	List<DiscussrexiaopaixingbangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
	
	DiscussrexiaopaixingbangView selectView(@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
	

}
