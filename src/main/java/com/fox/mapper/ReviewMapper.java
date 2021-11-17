package com.fox.mapper;

import com.fox.DTO.ReviewDTO;
import com.fox.domain.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper extends AbstractMapper<Review, ReviewDTO> {
    @Override
    public ReviewDTO mapObjectToDto(Review review) {
        if (review == null) return null;

        ReviewDTO.ReviewDTOBuilder reviewDTOBuilder = ReviewDTO.builder();
        reviewDTOBuilder.id(review.getId());
        reviewDTOBuilder.text(review.getText());
        reviewDTOBuilder.rate(review.getRate());
        reviewDTOBuilder.potByPotId(review.getPotByPotId());
        reviewDTOBuilder.userByUserId(review.getUserByUserId());

        return reviewDTOBuilder.build();
    }
}
