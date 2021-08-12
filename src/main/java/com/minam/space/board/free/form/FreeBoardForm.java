package com.minam.space.board.free.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free board form
 **********************************************************************************************************************/
public class FreeBoardForm {

    public static class Request {

        @Getter
        @Setter
        @Builder
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Find {

            @ApiModelProperty("게시글 ID")
            private Long id;

        }

        @Getter
        @Setter
        @Builder
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Add {
            private String title;
            private String content;
            private String writer;

            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
            private LocalDateTime createdAt;

        }

        @Getter
        @Setter
        @Builder
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Modify {
            private String title;
            private String content;

            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
            private LocalDateTime updatedAt;
        }
    }
    public static class Response {

        @Data
        public static class FindAll {
            private String title;
            private String writer;

        }

        @Data
        public static class FindOne {
            private String title;
            private String writer;
            private LocalDateTime createdAt;
            private LocalDateTime updatedAt;
        }
    }
}