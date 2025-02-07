package com.example.simpleboard.reply.model;

import com.example.simpleboard.post.db.PostEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReplyDto {

    private Long id;

    private Long postId; //post => _id => post_id

    private String userName;

    private String password;

    private String status;

    private String title;

    private String content;

    private LocalDateTime repliedAt;
}
