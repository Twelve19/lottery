package com.lottery.service.result.dto.value.pool.base;

import com.lottery.service.result.dto.value.pool.prizelevel.PrizeLevelDTO;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * def
 *
 * @author lw
 * @date 2023/10/31 16:04
 **/
@Data
@ToString
public class PoolDrawBaseDTO {

    private String lotteryDrawNum;

    private String lotteryDrawResult;

    private String lotteryDrawTime;

    private String lotteryGameName;

    private String lotteryGameNum;

    private String poolBalanceAfterdraw;

    private List<PrizeLevelDTO> prizeLevelList;
}
