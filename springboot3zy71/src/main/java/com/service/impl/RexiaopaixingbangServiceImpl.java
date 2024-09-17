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


import com.dao.RexiaopaixingbangDao;
import com.entity.RexiaopaixingbangEntity;
import com.service.RexiaopaixingbangService;
import com.entity.vo.RexiaopaixingbangVO;
import com.entity.view.RexiaopaixingbangView;

@Service("rexiaopaixingbangService")
public class RexiaopaixingbangServiceImpl extends ServiceImpl<RexiaopaixingbangDao, RexiaopaixingbangEntity> implements RexiaopaixingbangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RexiaopaixingbangEntity> page = this.selectPage(
                new Query<RexiaopaixingbangEntity>(params).getPage(),
                new EntityWrapper<RexiaopaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RexiaopaixingbangEntity> wrapper) {
		  Page<RexiaopaixingbangView> page =new Query<RexiaopaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RexiaopaixingbangVO> selectListVO(Wrapper<RexiaopaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RexiaopaixingbangVO selectVO(Wrapper<RexiaopaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RexiaopaixingbangView> selectListView(Wrapper<RexiaopaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RexiaopaixingbangView selectView(Wrapper<RexiaopaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
