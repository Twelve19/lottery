package com.lottery.service.result.dto.value.pool;

import com.lottery.service.result.dto.value.pool.base.PoolDrawBaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * def
 *
 * @author lw
 * @date 2023/10/31 16:25
 **/
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PoolDrawDTO extends PoolDrawBaseDTO {

    private String drawFlowFund;

    private String drawFlowFundRj;

    private String drawPdfUrl;

    private String estimateDrawTime;

    private Integer isGetKjpdf;

    private Integer isGetXlpdf;

    private Integer lotteryDrawStatus;

    private String lotteryDrawStatusNo;

    private Integer lotteryEquipmentCount;

    private Integer lotteryNotice;

    private Integer lotteryNoticeShowFlag;

    private String lotteryPaidBeginTime;

    private String lotteryPaidEndTime;

    private Integer lotteryPromotionFlag;

    private Integer lotteryPromotionFlagRj;

    private String lotterySaleBeginTime;

    private Integer lotterySaleEndTimeUnix;

    private String lotterySaleEndtime;

    private Integer lotterySuspendedFlag;

    private String lotteryUnsortDrawresult;

    private List<Object> matchList;

    private Integer pdfType;

    private String poolBalanceAfterdrawRj;

    private List<Object> prizeLevelListRj;

    private Integer ruleType;

    private String surplusAmount;

    private String surplusAmountRj;

    private List<Object> termList;

    private List<Object> termResultList;

    private String totalSaleAmount;

    private String totalSaleAmountRj;

    private Integer verify;

    private Object vtoolsConfig;
}
