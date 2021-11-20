package com.fox.DTO;

import com.fox.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PotDTO {
    private Integer id;
    private String name;
    private String description;
    private Collection<Review> reviewsById;
}
