package com.pet.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String userId;
    @Column(length = 2000)
    private String content;
    private Integer category; /* 分类 */
    @Column(length = 64)
    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;
}
