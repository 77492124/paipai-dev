package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CollectMapper;
import com.woniuxy.domain.Collect;
import com.woniuxy.service.ICollectService;




@Service
@Transactional
public class CollectServiceImpl  implements ICollectService{
	
	
	@Autowired
	private CollectMapper mapper;

	@Override
	public void save(Collect collect) {
		
		mapper.insert(collect);
		
		
	}

	@Override
	public void delete(Integer clid) {
		mapper.deleteByPrimaryKey(clid);
	}

	@Override
	public void update(Collect collect) {
		mapper.updateByPrimaryKey(collect);
	}

	@Override
	public Collect findOne(Integer clid) {
		Collect collect = mapper.selectByPrimaryKey(clid);
		return collect;
	}

	@Override
	public List<Collect> find() {
		List<Collect> list = mapper.selectByExample(null);
		return list;
	}

}
