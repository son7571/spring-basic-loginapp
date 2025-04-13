package com.example.loginapp.board;

import com.example.loginapp.user.User;
import lombok.Data;


public class BoardRequest {

    @Data
    public static class SaveDTO {
        public String title;
        public String content;
        public String isPublic;

        public Board toEntity(User user) {
            return Board.builder()
                    .title(title)
                    .content(content)
                    .isPublic(isPublic == null ? true : false)
                    .user(user) // user객체 필요
                    .build();
        }
    }
}