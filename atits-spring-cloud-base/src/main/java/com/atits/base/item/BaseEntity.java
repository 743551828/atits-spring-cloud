package com.atits.base.item;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @description: 基本实体类
 * @author: zhangys
 * @create: 2020-10-10 15:40
 **/
@Data
@ToString
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String code;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private String creator;

    /**
     * 创建人code
     */
    @Column(name = "creator_Code")
    @ApiModelProperty("创建人code")
    private String creatorCode;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    @ApiModelProperty("创建时间")
    private Long createdTime;

    /**
     * 最后操作人
     */
    @Column(name = "last_operator")
    @ApiModelProperty("最近操作人")
    private String lastOperator;

    /**
     * 最后操作人code
     */
    @Column(name = "last_operator_Code")
    @ApiModelProperty("最后操作人code")
    private String lastOperatorCode;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty("更新时间")
    private Long updateTime;

    /**
     * 排序数字
     */
    @Column(name = "sort_num")
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

}
