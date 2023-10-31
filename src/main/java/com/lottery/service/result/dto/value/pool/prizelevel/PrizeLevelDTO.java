package com.lottery.service.result.dto.value.pool.prizelevel;

import lombok.Data;
import lombok.ToString;

/**
 * def
 *
 * @author lw
 * @date 2023/10/31 16:07
 **/
@Data
@ToString
public class PrizeLevelDTO {

    private Integer awardType;

    private String group;

    private String lotteryCondition;

    private String prizeLevel;

    private Integer sort;

    private String stakeAmount;

    private String stakeAmountFormat;

    private String stakeCount;

    private String totalPrizeamount;
}
