package com.lyoyang.springbootstart.properties;

import com.lyoyang.springbootstart.entity.User;
import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.List;

@Data
@SpringBootConfiguration
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    List<User> userList;
}
