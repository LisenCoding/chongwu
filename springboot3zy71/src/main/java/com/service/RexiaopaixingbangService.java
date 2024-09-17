package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RexiaopaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RexiaopaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RexiaopaixingbangView;


/**
 * 热销排行榜
 *
 * @author 
 * @email 
 * @date 2023-01-22 08:24:47
 */
public interface RexiaopaixingbangService extends IService<RexiaopaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RexiaopaixingbangVO> selectListVO(Wrapper<RexiaopaixingbangEntity> wrapper);
   	
   	RexiaopaixingbangVO selectVO(@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);
   	
   	List<RexiaopaixingbangView> selectListView(Wrapper<RexiaopaixingbangEntity> wrapper);
   	
   	RexiaopaixingbangView selectView(@Param("ew") Wrapper<RexiaopaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RexiaopaixingbangEntity> wrapper);
   	

}

