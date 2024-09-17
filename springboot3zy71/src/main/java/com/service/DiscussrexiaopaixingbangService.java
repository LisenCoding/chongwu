package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrexiaopaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrexiaopaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrexiaopaixingbangView;


/**
 * 热销排行榜评论表
 *
 * @author 
 * @email 
 * @date 2023-01-22 08:24:48
 */
public interface DiscussrexiaopaixingbangService extends IService<DiscussrexiaopaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrexiaopaixingbangVO> selectListVO(Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
   	
   	DiscussrexiaopaixingbangVO selectVO(@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
   	
   	List<DiscussrexiaopaixingbangView> selectListView(Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
   	
   	DiscussrexiaopaixingbangView selectView(@Param("ew") Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrexiaopaixingbangEntity> wrapper);
   	

}

