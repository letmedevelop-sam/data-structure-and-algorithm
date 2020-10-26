package com.cybertek.streamLambdaExercise.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseAssigned {
    private Course course;
    private User user;
    private CourseStatus status;
}
