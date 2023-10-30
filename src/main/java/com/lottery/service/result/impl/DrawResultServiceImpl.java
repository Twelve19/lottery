package com.lottery.service.result.impl;

import cn.hutool.http.HttpUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lottery.framework.model.result.DrawResultDO;
import com.lottery.mapper.result.DrawResultMapper;
import com.lottery.service.result.DrawResultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class DrawResultServiceImpl extends ServiceImpl<DrawResultMapper, DrawResultDO> implements DrawResultService {

    @Resource
    private DrawResultMapper drawResultMapper;

    @Value("${lottery.data.url}")
    private String url;

    @Override
    public boolean push() {
        log.info("================拉取数据开始================");
        String result = HttpUtil.get(url);
        log.info(result);
        log.info("================拉取数据结束================");
        return false;
    }
}
