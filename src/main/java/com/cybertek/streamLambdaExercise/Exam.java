package com.cybertek.streamLambdaExercise;

import com.cybertek.streamLambdaExercise.model.CourseAssigned;
import com.cybertek.streamLambdaExercise.model.CourseStatus;
import com.cybertek.streamLambdaExercise.model.User;
import com.cybertek.streamLambdaExercise.model.UserState;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam {

    /**
     * Read all manager users.
     *
     * @return
     */
    public static List<User> readAllManagers() {
        // Write your stream code here to read all manager users.
        return DataGenerator.fillUsers().stream().filter(user -> user.getRole().getId()==2).collect(Collectors.toList());

    }

    /**
     * Read all SUSPENDED users.
     *
     * @return
     */
    public static List<User> readAllSuspendedUsers() {
        //Write your stream code to read all users that have SUSPENDED status.
        return DataGenerator.fillUsers().stream().filter(user -> user.getState().equals(UserState.SUSPENDED)).collect(Collectors.toList());
    }

    /**
     * Count all courses.
     *
     * @return
     */
    public static Integer countCourses() {
        // Write your code for how many courses do we have?.
        return (int)DataGenerator.fillCourses().stream().count();

    }


    /**
     * Group by and count courses by status.
     */
    public static Map<CourseStatus, Long> countCoursesByStatus() {
        //Write your code..
        Map<CourseStatus,Long> countCourses = new HashMap<>();
        //DataGenerator.fillCoursesAssigned().stream().map(courseAssigned -> countCourses.put(courseAssigned.getStatus(),))
        return null;
    }

    /**
     * Sum all duration for all records.
     *
     * @return sum of duration.
     */
    public static Integer sumDurationForAllData() {
        return null;
    }

    /**
     * Find Courses attended by a specific user.
     *
     * @return
     */
    public static List<CourseAssigned> findCoursesByUser() {
        User specificUser = DataGenerator.findUserById(6);
        //Write your code to return all courses by specific user...;
        return null;
    }

    /**
     * Read all finished courses.
     * Modify response to show only course name, course duration, (user firstName + user lastName)
     */
    public static List<Map<String, Object>> modifyObject() {
        return null;
    }

    /**
     * Duration of course that is in hours return to week that specific user finished courses.
     * One week has 40 hours working time. divider parameter should be 40.
     *
     * @return converted duration to week. {@link BigDecimal}
     */
    public static BigDecimal divideToWeek() {
        User specificUser = DataGenerator.findUserById(6);
        BigDecimal divideToWeek = new BigDecimal(40);
        return null;
    }

}