package com.minam.space.board.free.entity;

import com.minam.space.member.entity.Member;
import lombok.*;
import org.springframework.context.annotation.Description;

import javax.persistence.*;
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
@Table(name="BOARD_FREE")
@Description("게시판 - 자유")
public class Free {

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    private Member writer;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}