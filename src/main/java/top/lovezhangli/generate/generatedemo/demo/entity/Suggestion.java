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
* 意见建议
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_suggestion")
@ApiModel(value = "Suggestion对象", description = "意见建议")
public class Suggestion extends Model<Suggestion> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 称呼
     */
    @ApiModelProperty(value = "称呼")
    @TableField("name")
    private String name;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    @TableField("mobile_tel")
    private String mobileTel;

    /**
     * 建议内容
     */
    @ApiModelProperty(value = "建议内容")
    @TableField("content")
    private String content;

    /**
     * 是否处理(1:未处理,2:已处理)
     */
    @ApiModelProperty(value = "是否处理(1:未处理,2:已处理)")
    @TableField("solve_flag")
    private Integer solveFlag;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

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
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    @TableField("email")
    private String email;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}