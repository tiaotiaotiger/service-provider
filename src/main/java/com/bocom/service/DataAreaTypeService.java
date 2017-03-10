package com.bocom.service;

import java.util.List;
import java.util.Map;

import com.bocom.entity.DataAreaType;

/**
 * 隶属区域接口
 * 
 * @author chenzz
 */
public interface DataAreaTypeService {
	/**
	 * 查询列表
	 */
	public List<DataAreaType> listDataByParam(Map<String,Object> param);
}
