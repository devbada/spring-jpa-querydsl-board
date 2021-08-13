package com.minam.space.member.entity;

import lombok.*;
import org.springframework.context.annotation.Description;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @since       2021.08.13
 * @author      minam
 * @description member
 **********************************************************************************************************************/
 @Entity
 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder(toBuilder=true)
 @Description("멤버")
 @Table(name="MEMBER")
public class Member {

    @Id @GeneratedValue
    private Integer id;

    private String name;
    private String nickName;

    private LocalDateTime lastLoginAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}