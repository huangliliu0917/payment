package com.payment.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shenxinran
 * @Date: 2019/6/4 09:46
 * @Description: 机构结算表输出实体
 */
@Data
@ApiModel(value = "机构结算表输出实体", description = "机构结算表输出实体")
public class SettleOrderVO {

    @ApiModelProperty(hidden = true)
    public String id;

    @ApiModelProperty(value = "创建时间")
    public Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建者")
    private String creator;

    @ApiModelProperty(value = "更改者")
    private String modifier;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "机构编号")
    private String institutionCode;

    @ApiModelProperty(value = "机构名称")
    private String institutionName;

    @ApiModelProperty(value = "交易币种")
    private String txncurrency;

    @ApiModelProperty(value = "交易金额")
    private BigDecimal txnamount;

    @ApiModelProperty(value = "结算账户")
    private String accountCode;

    @ApiModelProperty(value = "账户名")
    private String accountName;

    @ApiModelProperty(value = "银行名称")
    private String bankName;

    @ApiModelProperty(value = "Swift Code")
    private String swiftCode;

    @ApiModelProperty(value = "Iban")
    private String iban;

    @ApiModelProperty(value = "bank code")
    private String bankCode;

    @ApiModelProperty(value = "结算币种")
    private String bankCurrency;

    @ApiModelProperty(value = "交易状态")//交易状态：1-结算中 2-结算成功 3-结算失败
    private Byte tradeStatus;

    @ApiModelProperty(value = "交易手续费")
    private BigDecimal tradeFee;

    @ApiModelProperty(value = "手续费币种")
    private String feeCurrency;

    @ApiModelProperty(value = "交易汇率")
    private BigDecimal rate;

    @ApiModelProperty(value = "结算金额")//结算金额=交易金额*交易汇率-交易手续费
    private BigDecimal settleAmount;
}
