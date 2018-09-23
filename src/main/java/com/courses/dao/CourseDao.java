package com.courses.dao;

import com.courses.exc.DaoException;
import com.courses.model.Course;
import org.sql2o.Query;

import java.util.List;

public interface CourseDao {
    void add(Course course) throws DaoException;

    List<Course> findALl();

    Course findById(int id);
}
