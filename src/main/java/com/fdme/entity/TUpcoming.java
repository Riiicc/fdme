package com.fdme.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ric
 * @since 2019-09-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TUpcoming implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 待办内容表主键
     */
    private Long id;

    private Long userId;

    /**
     * 内容
     */
    private String content;

    /**
     * 标记类型
     */
    private Integer markType;

    /**
     * 排序
     */
    private Integer orderNum;

    private LocalDateTime createTime;


}
