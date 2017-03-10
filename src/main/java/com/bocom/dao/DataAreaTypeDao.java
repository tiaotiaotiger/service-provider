package com.bocom.dao;

import java.util.List;
import java.util.Map;

import com.bocom.entity.DataAreaType;

public interface DataAreaTypeDao {
	public List<DataAreaType> listDataByParam(Map<String,Object> param);
	
}
