package zipcode.rocks.BeanLab.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipcode.rocks.BeanLab.Model.Instructor;
import zipcode.rocks.BeanLab.Model.Student;
import zipcode.rocks.BeanLab.Repository.Classroom;
import zipcode.rocks.BeanLab.Repository.Instructors;
import zipcode.rocks.BeanLab.Repository.Students;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    public Classroom currentCohort() {

        Students currentStudents = new Students();
        currentStudents.add(new Student(1, "Carol"));
        currentStudents.add(new Student(2, "Tim"));
        currentStudents.add(new Student(3, "Scrooge"));

        Instructors currentInstructors = new Instructors();
        currentInstructors.add(new Instructor(1, "Bob"));
        currentInstructors.add(new Instructor(2, "Cratchit"));
        currentInstructors.add(new Instructor(3, "Charles"));

        return new Classroom(currentInstructors, currentStudents);
    }

    //    @Bean
//    @DependsOn({"instructors", "students"})
    @Bean(name = "previousCohort")
    public Classroom previousCohort() {

        Students previousStudents = new Students();
        previousStudents.add(new Student(1, "Bill"));
        previousStudents.add(new Student(2, "Murray"));
        previousStudents.add(new Student(3, "Scrooge"));

        Instructors previousInstructors = new Instructors();
        previousInstructors.add(new Instructor(1, "Rudolph"));
        previousInstructors.add(new Instructor(2, "Santa"));
        previousInstructors.add(new Instructor(3, "Frosty"));

        return new Classroom(previousInstructors, previousStudents);
    }

}
