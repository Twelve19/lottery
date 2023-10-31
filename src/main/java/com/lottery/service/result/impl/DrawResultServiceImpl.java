package com.lottery.service.result.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lottery.framework.model.result.DrawResultDO;
import com.lottery.mapper.result.DrawResultMapper;
import com.lottery.service.result.DrawResultService;
import com.lottery.service.result.dto.DrawResultDTO;
import com.lottery.service.result.dto.value.pool.PoolDrawDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class DrawResultServiceImpl extends ServiceImpl<DrawResultMapper, DrawResultDO> implements DrawResultService {

    @Resource
    private DrawResultMapper drawResultMapper;

    @Value("${lottery.data.url}")
    private String url;

    @Override
    public boolean push() {
        // 请求api接口
        String resultJson = HttpUtil.get(url);
        // json转换对象
        DrawResultDTO drawResultDTO = JSONObject.parseObject(resultJson, DrawResultDTO.class);
        List<PoolDrawDTO> poolDrawDTOS = drawResultDTO.getValue().getList();
        for (PoolDrawDTO poolDrawDTO : poolDrawDTOS) {

            // 保存结果
            DrawResultDO drawResultDO = this.getDrawResultDO(poolDrawDTO);
            DrawResultDO dbDrawResultDO = drawResultMapper.selectDrawResult(poolDrawDTO.getLotteryDrawNum());
            if (Objects.nonNull(dbDrawResultDO)) {
                drawResultDO.setId(dbDrawResultDO.getId());
                drawResultMapper.updateById(drawResultDO);
            } else {
                drawResultMapper.insert(drawResultDO);
            }

        }

        return true;
    }

    private DrawResultDO getDrawResultDO(PoolDrawDTO poolDrawDTO) {
        String result = poolDrawDTO.getLotteryDrawResult();
        String[] resultArr = result.split(StrUtil.SPACE);
        DrawResultDO drawResultDO = new DrawResultDO();
        drawResultDO.setR1(resultArr[0]);
        drawResultDO.setR2(resultArr[1]);
        drawResultDO.setR3(resultArr[2]);
        drawResultDO.setR4(resultArr[3]);
        drawResultDO.setR5(resultArr[4]);
        drawResultDO.setB1(resultArr[5]);
        drawResultDO.setB2(resultArr[6]);
        drawResultDO.setIssue(poolDrawDTO.getLotteryDrawNum());
        drawResultDO.setDrawTime(poolDrawDTO.getLotteryDrawTime());
        return drawResultDO;
    }
}
