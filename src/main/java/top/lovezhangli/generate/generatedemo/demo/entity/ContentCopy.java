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
@TableName("tb_content_copy")
@ApiModel(value = "ContentCopy对象", description = "")
public class ContentCopy extends Model<ContentCopy> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    @TableField("title")
    private String title;

    /**
     * 内容类型
     */
    @ApiModelProperty(value = "内容类型")
    @TableField("content_type")
    private String contentType;

    /**
     * 所属标签
     */
    @ApiModelProperty(value = "所属标签")
    @TableField("tag")
    private String tag;

    /**
     * 来源
     */
    @ApiModelProperty(value = "来源")
    @TableField("source_from")
    private String sourceFrom;

    /**
     * 作者
     */
    @ApiModelProperty(value = "作者")
    @TableField("author")
    private String author;

    /**
     * 简介
     */
    @ApiModelProperty(value = "简介")
    @TableField("introduction")
    private String introduction;

    /**
     * 封面图片
     */
    @ApiModelProperty(value = "封面图片")
    @TableField("cover_img")
    private String coverImg;

    /**
     * 正文
     */
    @ApiModelProperty(value = "正文")
    @TableField("content")
    private String content;

    /**
     * 是否首页
     */
    @ApiModelProperty(value = "是否首页")
    @TableField("home_flag")
    private Integer homeFlag;

    /**
     * 是否推荐
     */
    @ApiModelProperty(value = "是否推荐")
    @TableField("recommended")
    private Integer recommended;

    /**
     * 顺序
     */
    @ApiModelProperty(value = "顺序")
    @TableField("seq_no")
    private Integer seqNo;

    /**
     * 状态 1:启用 2:禁用
     */
    @ApiModelProperty(value = "状态 1:启用 2:禁用")
    @TableField("status")
    private Integer status;

    /**
     * 删除标志：1删除，0未删除
     */
    @ApiModelProperty(value = "删除标志：1删除，0未删除")
    @TableField("del_flag")
    private Integer delFlag;

    /**
     * 浏览量
     */
    @ApiModelProperty(value = "浏览量")
    @TableField("view_count")
    private Long viewCount;

    /**
     * 点赞数
     */
    @ApiModelProperty(value = "点赞数")
    @TableField("likes")
    private Long likes;

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