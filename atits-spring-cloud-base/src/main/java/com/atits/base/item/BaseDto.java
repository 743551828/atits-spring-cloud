package com.atits.base.item;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * 基本Dto
 *
 * @author zhangys
 * @date 2020-10-16 13:59
 **/
@Data
@ToString
public class BaseDto implements Serializable {

    private String code;

    /**
     * 创建人code
     */
    @ApiModelProperty("创建人code")
    private String creatorCode;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Long createdTime;

    /**
     * 最后操作人code
     */
    @ApiModelProperty("最后操作人code")
    private String lastOperatorCode;

    /**
     * 最后操作人code
     */
    @ApiModelProperty("最后操作人")
    private String lastOperator;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Long updateTime;

    /**
     * 排序数字
     */
    @ApiModelProperty("排序数字")
    private Integer sortNum;

    /**
     * 状态值
     */
    @ApiModelProperty("状态值")
    private Integer status;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    public void init(String creator, String lastOperator) {
        this.creator = creator;
        this.lastOperator = lastOperator;
    }
}
