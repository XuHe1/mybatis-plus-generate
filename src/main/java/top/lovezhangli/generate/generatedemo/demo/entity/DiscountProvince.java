package top.lovezhangli.generate.generatedemo.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* <p>
* 折扣省份
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_discount_province")
@ApiModel(value = "DiscountProvince对象", description = "折扣省份")
public class DiscountProvince extends Model<DiscountProvince> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 卡种id
     */
    @ApiModelProperty(value = "卡种id")
    @TableField("card_id")
    private Long cardId;

    /**
     * 区域
     */
    @ApiModelProperty(value = "区域")
    @TableField("area")
    private String area;

    /**
     * 折扣
     */
    @ApiModelProperty(value = "折扣")
    @TableField("discount")
    private Integer discount;

    /**
     * 折扣单位(1:折,2:折起)
     */
    @ApiModelProperty(value = "折扣单位(1:折,2:折起)")
    @TableField("discount_unit")
    private String discountUnit;

    /**
     * 折扣条件
     */
    @ApiModelProperty(value = "折扣条件")
    @TableField("discount_condition")
    private String discountCondition;

    /**
     * 排序序列(越大越靠前)
     */
    @ApiModelProperty(value = "排序序列(越大越靠前)")
    @TableField("sort_no")
    private Integer sortNo;

    /**
     * 状态 1:启用 2:禁用
     */
    @ApiModelProperty(value = "状态 1:启用 2:禁用")
    @TableField("status")
    private Integer status;

    /**
     * 创建人ID
     */
    @ApiModelProperty(value = "创建人ID")
    @TableField("create_id")
    private Long createId;

    /**
     * 创建人姓名
     */
    @ApiModelProperty(value = "创建人姓名")
    @TableField("creator")
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新人ID
     */
    @ApiModelProperty(value = "更新人ID")
    @TableField("update_id")
    private Long updateId;

    /**
     * 更新人姓名
     */
    @ApiModelProperty(value = "更新人姓名")
    @TableField("updator")
    private String updator;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    /**
     * 删除标识（1.未删除 2.已删除）
     */
    @ApiModelProperty(value = "删除标识（1.未删除 2.已删除）")
    @TableField("del_flag")
    private Integer delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}