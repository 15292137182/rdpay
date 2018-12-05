package com.rdpay.mgr.modules.operate.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rdpay.mgr.common.utils.PageUtils;
import com.rdpay.mgr.common.utils.Query;
import com.rdpay.mgr.modules.operate.dao.NoticeDao;
import com.rdpay.mgr.modules.operate.entity.NoticeEntity;
import com.rdpay.mgr.modules.operate.service.NoticeService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("noticeService")
public class NoticeServiceImpl extends ServiceImpl<NoticeDao, NoticeEntity> implements NoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NoticeEntity> page = this.selectPage(
                new Query<NoticeEntity>(params).getPage(),
                new EntityWrapper<NoticeEntity>()
        );

        return new PageUtils(page);
    }

}
