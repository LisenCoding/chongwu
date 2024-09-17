package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussrexiaopaixingbangDao;
import com.entity.DiscussrexiaopaixingbangEntity;
import com.service.DiscussrexiaopaixingbangService;
import com.entity.vo.DiscussrexiaopaixingbangVO;
import com.entity.view.DiscussrexiaopaixingbangView;

@Service("discussrexiaopaixingbangService")
public class DiscussrexiaopaixingbangServiceImpl extends ServiceImpl<DiscussrexiaopaixingbangDao, DiscussrexiaopaixingbangEntity> implements DiscussrexiaopaixingbangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrexiaopaixingbangEntity> page = this.selectPage(
                new Query<DiscussrexiaopaixingbangEntity>(params).getPage(),
                new EntityWrapper<DiscussrexiaopaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrexiaopaixingbangEntity> wrapper) {
		  Page<DiscussrexiaopaixingbangView> page =new Query<DiscussrexiaopaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrexiaopaixingbangVO> selectListVO(Wrapper<DiscussrexiaopaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrexiaopaixingbangVO selectVO(Wrapper<DiscussrexiaopaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrexiaopaixingbangView> selectListView(Wrapper<DiscussrexiaopaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrexiaopaixingbangView selectView(Wrapper<DiscussrexiaopaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
