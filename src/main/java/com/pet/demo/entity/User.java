package com.pet.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户表
 */
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;
    @Column(nullable = false,unique = true,length = 64)
    private String username;
    @Column(unique = true,length = 13)
    private String mobile;
    @Column(length = 64)
    private String email;
    private String password;
    private Integer role; /* 1 管理员 0 普通用户 */
    private String salt; /* 密码盐 */
    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;
}
