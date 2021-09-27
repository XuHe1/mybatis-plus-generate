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
* 荣誉资质
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_honor")
@ApiModel(value = "Honor对象", description = "荣誉资质")
public class Honor extends Model<Honor> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 荣誉类型(1:公司资质;2:社会职务;3:社会荣誉;4:社会责任;5:团建活动)
     */
    @ApiModelProperty(value = "荣誉类型(1:公司资质;2:社会职务;3:社会荣誉;4:社会责任;5:团建活动)")
    @TableField("honor_type")
    private Integer honorType;

    /**
     * 荣誉类型描述
     */
    @ApiModelProperty(value = "荣誉类型描述")
    @TableField("honor_type_name")
    private String honorTypeName;

    /**
     * 荣誉名称
     */
    @ApiModelProperty(value = "荣誉名称")
    @TableField("honor_name")
    private String honorName;

    /**
     * 荣誉时间
     */
    @ApiModelProperty(value = "荣誉时间")
    @TableField("honor_time")
    private Date honorTime;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

    /**
     * 排序序列(越小越靠前)
     */
    @ApiModelProperty(value = "排序序列(越小越靠前)")
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

    /**
     * 图片ID
     */
    @ApiModelProperty(value = "图片ID")
    @TableField("pic_id")
    private Long picId;

    /**
     * 图片类型
     */
    @ApiModelProperty(value = "图片类型")
    @TableField("pic_type")
    private String picType;

    /**
     * 图片名称
     */
    @ApiModelProperty(value = "图片名称")
    @TableField("pic_name")
    private String picName;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址")
    @TableField("pic_addr")
    private String picAddr;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}