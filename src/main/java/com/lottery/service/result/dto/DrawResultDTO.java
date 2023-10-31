package com.lottery.service.result.dto;

import com.lottery.service.result.dto.value.DrawResultValueDTO;
import lombok.Data;
import lombok.ToString;

/**
 * 开奖结果dto
 *
 * @author lw
 * @date 2023/10/31 13:59
 **/
@Data
@ToString
public class DrawResultDTO {

    /**
     * 数据来源
     */
    private String dataFrom;

    /**
     * 空标志
     */
    private Boolean emptyFlag;

    /**
     * 错误代码
     */
    private String errorCode;

    /**
     * 错误消息
     */
    private String errorMessage;

    /**
     * 成功状态
     */
    private Boolean success;

    /**
     * 结果
     */
    private DrawResultValueDTO value;
}
