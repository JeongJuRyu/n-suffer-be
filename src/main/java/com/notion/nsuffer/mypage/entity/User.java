package com.notion.nsuffer.mypage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class User {
    @Id @GeneratedValue
    private Long Id;

    private String name;

    @Temporal(value = TemporalType.DATE)
    private Date userBirthday;


}
