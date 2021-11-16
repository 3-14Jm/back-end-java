package com.fox.service;

import com.fox.domain.Review;
import com.fox.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReviewService extends AbstractService<Review, Integer> {
    public ReviewRepository reviewRepository;

    @Override
    protected JpaRepository<Review, Integer> getRepository() {
        return reviewRepository;
    }
}
