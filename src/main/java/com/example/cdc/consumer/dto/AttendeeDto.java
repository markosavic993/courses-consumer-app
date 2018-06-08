package com.example.cdc.consumer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendeeDto {

    private long attendeeId;
    private String firstName;
    private String lastName;
    private String email;

    public AttendeeDto() {
    }

    public long getAttendeeId() {
        return attendeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "AttendeeDto{" +
                "attendeeId=" + attendeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
