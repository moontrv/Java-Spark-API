package com.courses.dao;

import com.courses.exc.DaoException;
import com.courses.model.Review;

import java.util.List;

public interface ReviewDao {
    void add(Review review) throws DaoException;
    List<Review> findAll();
    List<Review> findByCourseId(int courseId);

}
