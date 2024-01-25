package com.tb.ddd.demo.infrastructure.mysql.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * <h1>One po corresponds to one table in database.</h1>
 */
@Data
@TableName("xxx")
public class XXXPo {
    @TableId(value = "blog_id",type = IdType.INPUT)
    private Long blogId;

    private String title;

    private String description;

    @TableField("create_date")
    private Date createDate;

    @TableField("update_date")
    private Date updateDate;

    @TableField("user_id")
    private Long userId;

    @TableField("book_id")
    private Long bookId;

    @TableField("comment_counts")
    private Integer commentCounts;

    @Version
    @TableField("view_counts")
    private Integer viewCounts;
}
