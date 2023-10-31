package com.lottery.service.result.dto.value;

import com.lottery.service.result.dto.value.pool.PoolDrawDTO;
import com.lottery.service.result.dto.value.pool.base.PoolDrawBaseDTO;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * def
 *
 * @author lw
 * @date 2023/10/31 15:59
 **/
@Data
@ToString
public class DrawResultValueDTO {

    private PoolDrawBaseDTO lastPoolDraw;

    private List<PoolDrawDTO> list;

    private Integer pageNo;

    private Integer pageSize;

    private Integer pages;

    private Integer total;


}
