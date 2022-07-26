package com.demoProject.Project.services;

import com.demoProject.Project.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long parseLong);
}
