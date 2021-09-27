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
* 
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_content_tag")
@ApiModel(value = "ContentTag对象", description = "")
public class ContentTag extends Model<ContentTag> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标签名称
     */
    @ApiModelProperty(value = "标签名称")
    @TableField("tag")
    private String tag;

    /**
     * 状态 1:启用 0:禁用
     */
    @ApiModelProperty(value = "状态 1:启用 0:禁用")
    @TableField("status")
    private Integer status;

    /**
     * 删除标志：1删除，0未删除
     */
    @ApiModelProperty(value = "删除标志：1删除，0未删除")
    @TableField("del_flag")
    private Integer delFlag;

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
    @TableField("updater")
    private String updater;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}