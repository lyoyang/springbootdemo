package com.lyoyang.springsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author caobotao
 * @create 2019/6/13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsResponseDto implements Serializable {
    private Integer userId;

    private String userName;

    private String userEmail;

    private byte enable;

    private String loginToken;

    private List<String> roleIds;

    private List<String> allAuthority;
}
