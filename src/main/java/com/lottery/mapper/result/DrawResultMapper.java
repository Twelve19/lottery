package com.lottery.mapper.result;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lottery.framework.model.result.DrawResultDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DrawResultMapper extends BaseMapper<DrawResultDO> {

    /**
     * 根据期号获取结果
     *
     * @param issue 期号
     * @return 结果
     */
    default DrawResultDO selectDrawResult(String issue) {
        LambdaQueryWrapper<DrawResultDO> wrapper = new LambdaQueryWrapper<DrawResultDO>();
        wrapper.eq(DrawResultDO::getIssue, issue);
        return this.selectOne(wrapper);
    }
}
