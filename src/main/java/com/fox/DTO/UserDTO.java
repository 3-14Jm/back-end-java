package com.fox.DTO;

import com.fox.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Integer id;
    private String surname;
    private String name;
    private String email;
    private String gender;
    private Date birthday;
    private String login;
    private String password;
    private Collection<Review> reviewsById;
}
