package com.minam.space.board.free.entity;

import lombok.*;
import org.springframework.context.annotation.Description;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free
 **********************************************************************************************************************/
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder=true)
@Description("게시판 - 자유")
public class Free {

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}