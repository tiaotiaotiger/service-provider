package com.bocom.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bocom.entity.DataAreaType;
import com.bocom.service.DataAreaTypeService;
import com.bocom.util.ResponseUtil;

/**
 * ClassName:DataAreaTypeController
 * Function: 区域管理
 * Date:     2017年3月9日 上午9:59:35
 * @author   chenzz
 * @since    JDK 1.7
 */
@RestController
@SuppressWarnings("all")
public class DataAreaTypeController {
	private static Logger LOG = LoggerFactory
			.getLogger(DataAreaTypeController.class);

	@Autowired
	private DataAreaTypeService service;

	@RequestMapping(value = "/listDataByGet", method = RequestMethod.GET)
	public String listDataByGet(String areaName) {
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		LOG.info("Enter Method {}, param [areaName] is {}", methodName,
				areaName);
		List<DataAreaType> list = null;
		try {
			HashMap<String, Object> param = new HashMap<String, Object>();
			param.put("areaName", areaName);
			list = service.listDataByParam(param);
		} catch (Exception e) {
			LOG.error("Handle Method {} error", methodName, e);
			return ResponseUtil.fail(e.getMessage());
		}
		LOG.info("Exit Method {} success.", methodName);
		return ResponseUtil.success(list);
	}

	@RequestMapping(value = "/listDataByPost", method = RequestMethod.POST)
	public String listDataByPost(String areaName) {
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		LOG.info("Enter Method {}, param [areaName] is {}", methodName,
				areaName);
		List<DataAreaType> list = null;
		try {
			HashMap<String, Object> param = new HashMap<String, Object>();
			param.put("areaName", areaName);
			list = service.listDataByParam(param);
		} catch (Exception e) {
			LOG.error("Handle Method {} error", methodName, e);
			return ResponseUtil.fail(e.getMessage());
		}
		LOG.info("Exit Method {} success.", methodName);
		return ResponseUtil.success(list);
	}
}
