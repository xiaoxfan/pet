package com.pet.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Comment {
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;
    @Column(nullable = false)
    private String postId;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false,length = 200)
    private String comment;
    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;
}
