package com.bocom.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bocom.dao.DataAreaTypeDao;
import com.bocom.entity.DataAreaType;
import com.bocom.service.DataAreaTypeService;

@Service
public class DataAreaTypeServiceImpl implements DataAreaTypeService {
	@Autowired
	private DataAreaTypeDao dataAreaTypeDao;

	@Override
	public List<DataAreaType> listDataByParam(Map<String,Object> param) {
		return dataAreaTypeDao.listDataByParam(param);
	}

}
