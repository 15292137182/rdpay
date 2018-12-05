package com.rdpay.mgr.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.rdpay.mgr.common.utils.PageUtils;
import com.rdpay.mgr.modules.sys.entity.SysDataDictEntity;

import java.util.Map;

/**
 * 数据字典
 *
 * @author tiehu
 * @email tiehuwen@163.com
 * @date 2018-07-09 10:17:08
 */
public interface SysDataDictService extends IService<SysDataDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

