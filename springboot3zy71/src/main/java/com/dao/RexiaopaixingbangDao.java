package com.dao;

import com.entity.RexiaopaixingbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RexiaopaixingbangVO;
import com.entity.view.RexiaopaixingbangView;


/**
 * 热销排行榜
 * 
 * @author 
 * @email 
 * @date 2023-01-22 08:24:47
 */
public interface RexiaopaixingbangDao extends BaseMapper<RexiaopaixingbangEntity> {
	
	List<RexiaopaixingbangVO> selectListVO(@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);
	
	RexiaopaixingbangVO selectVO(@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);
	
	List<RexiaopaixingbangView> selectListView(@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);

	List<RexiaopaixingbangView> selectListView(Pagination page,@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);
	
	RexiaopaixingbangView selectView(@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);
	

}
