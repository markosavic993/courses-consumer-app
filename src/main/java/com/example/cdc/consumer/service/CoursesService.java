package com.example.cdc.consumer.service;

import com.example.cdc.consumer.dto.CourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoursesService {

    private static final String COURSES_ENDPOINT = "http://localhost:5000/courses";

    private final RestTemplate client;

    @Autowired
    public CoursesService(@Qualifier("coursesRestClient") RestTemplate client) {
        this.client = client;
    }

    public CourseDto[] getAllCourses() {
        return client.getForObject(COURSES_ENDPOINT, CourseDto[].class);
    }

}
