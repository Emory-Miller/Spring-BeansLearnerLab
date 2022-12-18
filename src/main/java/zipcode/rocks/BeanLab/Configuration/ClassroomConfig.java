package zipcode.rocks.BeanLab.Configuration;

import org.springframework.context.annotation.Configuration;
import zipcode.rocks.BeanLab.Repository.Classroom;
import zipcode.rocks.BeanLab.Repository.Instructors;
import zipcode.rocks.BeanLab.Repository.Students;

@Configuration
public class ClassroomConfig {

//    @Bean
//    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

//    @Bean
//    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }

}
