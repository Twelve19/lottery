package com.lottery.framework.model.result;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * 大乐透开奖结果表
 */
@TableName("draw_result")
@Data
@ToString
public class DrawResultDO {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 红球1
     */
    @TableField(value = "r1")
    private String r1;

    /**
     * 红球2
     */
    @TableField(value = "r2")
    private String r2;

    /**
     * 红球3
     */
    @TableField(value = "r3")
    private String r3;

    /**
     * 红球4
     */
    @TableField(value = "r4")
    private String r4;

    /**
     * 红球5
     */
    @TableField(value = "r5")
    private String r5;

    /**
     * 篮球1
     */
    @TableField(value = "b1")
    private String b1;

    /**
     * 篮球2
     */
    @TableField(value = "b2")
    private String b2;

    /**
     * 期号
     */
    @TableField(value = "issue")
    private String issue;

    /**
     * 开奖时间
     */
    @TableField(value = "draw_time")
    private String drawTime;
}
