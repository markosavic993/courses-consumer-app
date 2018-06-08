package com.example.cdc.consumer.controller;

import com.example.cdc.consumer.dto.CourseDto;
import com.example.cdc.consumer.service.CoursesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CoursesController {

    private static final Logger logger = LoggerFactory.getLogger(CoursesController.class);


    @Autowired
    private CoursesService coursesService;

    @GetMapping("/find-courses")
    public CourseDto[] findCourses() {
        CourseDto[] courses = coursesService.getAllCourses();
        Arrays.stream(courses).forEach(course -> logger.info(course.toString()));
        return courses;
    }
}
