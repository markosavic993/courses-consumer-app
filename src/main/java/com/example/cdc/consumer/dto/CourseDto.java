package com.example.cdc.consumer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseDto {

    @JsonProperty("id")
    private long courseId;
    private String name;
    private String description;
    private AttendeeDto[] attendees;

    public CourseDto() {
    }

    public long getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public AttendeeDto[] getAttendees() {
        return attendees;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", attendees=" + Arrays.toString(attendees) +
                '}';
    }
}
