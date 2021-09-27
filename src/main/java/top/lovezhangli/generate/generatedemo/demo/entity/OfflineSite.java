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
* 线下网点
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_offline_site")
@ApiModel(value = "OfflineSite对象", description = "线下网点")
public class OfflineSite extends Model<OfflineSite> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 省份代码
     */
    @ApiModelProperty(value = "省份代码")
    @TableField("province_code")
    private String provinceCode;

    /**
     * 省份名称
     */
    @ApiModelProperty(value = "省份名称")
    @TableField("province_name")
    private String provinceName;

    /**
     * 网点名称
     */
    @ApiModelProperty(value = "网点名称")
    @TableField("site_name")
    private String siteName;

    /**
     * 网点地址
     */
    @ApiModelProperty(value = "网点地址")
    @TableField("address")
    private String address;

    /**
     * 电话微信
     */
    @ApiModelProperty(value = "电话微信")
    @TableField("mobile_tel")
    private String mobileTel;

    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间")
    @TableField("start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间")
    @TableField("end_time")
    private Date endTime;

    /**
     * 开始周
     */
    @ApiModelProperty(value = "开始周")
    @TableField("start_week")
    private String startWeek;

    /**
     * 结束周
     */
    @ApiModelProperty(value = "结束周")
    @TableField("end_week")
    private String endWeek;

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


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}