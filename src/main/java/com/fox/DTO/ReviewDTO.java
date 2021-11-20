package com.fox.DTO;

import com.fox.domain.Pot;
import com.fox.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDTO {
    private Integer id;
    private String text;
    private Integer rate;
    private User userByUserId;
    private Pot potByPotId;
}
