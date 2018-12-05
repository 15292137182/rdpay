package com.rdpay.mgr.modules.sys.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rdpay.mgr.common.utils.PageUtils;
import com.rdpay.mgr.common.utils.Query;
import com.rdpay.mgr.modules.sys.dao.SysDataDictDao;
import com.rdpay.mgr.modules.sys.entity.SysDataDictEntity;
import com.rdpay.mgr.modules.sys.service.SysDataDictService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysDataDictService")
public class SysDataDictServiceImpl extends ServiceImpl<SysDataDictDao, SysDataDictEntity> implements SysDataDictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SysDataDictEntity> page = this.selectPage(
                new Query<SysDataDictEntity>(params).getPage(),
                new EntityWrapper<SysDataDictEntity>()
        );

        return new PageUtils(page);
    }

}
