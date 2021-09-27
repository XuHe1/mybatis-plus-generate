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
* 产品表
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_product")
@ApiModel(value = "Product对象", description = "产品表")
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 产品名称
     */
    @ApiModelProperty(value = "产品名称")
    @TableField("name")
    private String name;

    /**
     * 简介
     */
    @ApiModelProperty(value = "简介")
    @TableField("summary")
    private String summary;

    /**
     * 状态 1:启用 2:禁用
     */
    @ApiModelProperty(value = "状态 1:启用 2:禁用")
    @TableField("status")
    private Integer status;

    /**
     * 介绍
     */
    @ApiModelProperty(value = "介绍")
    @TableField("introduction")
    private String introduction;

    /**
     * 办理地址
     */
    @ApiModelProperty(value = "办理地址")
    @TableField("process_url")
    private String processUrl;

    /**
     * 排序序列(越小越靠前)
     */
    @ApiModelProperty(value = "排序序列(越小越靠前)")
    @TableField("sort_no")
    private Integer sortNo;

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