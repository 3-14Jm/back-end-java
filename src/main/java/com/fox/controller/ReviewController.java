package com.fox.controller;

import com.fox.DTO.ReviewDTO;
import com.fox.domain.Review;
import com.fox.mapper.AbstractMapper;
import com.fox.mapper.ReviewMapper;
import com.fox.service.AbstractService;
import com.fox.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/reviews")
@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
public class ReviewController extends AbstractController<Review, ReviewDTO, Integer> {
    private final ReviewService reviewService;
    private final ReviewMapper reviewMapper;


    @Override
    protected AbstractService<Review, Integer> getService() {
        return reviewService;
    }

    @Override
    protected AbstractMapper<Review, ReviewDTO> getMapper() {
        return reviewMapper;
    }
}