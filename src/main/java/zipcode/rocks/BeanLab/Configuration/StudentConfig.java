package zipcode.rocks.BeanLab.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipcode.rocks.BeanLab.Model.Student;
import zipcode.rocks.BeanLab.Repository.Students;

@Configuration
public class StudentConfig {

    private Students addCurrentStudents(){
        Students currentStudents = new Students();
        currentStudents.add(new Student(1, "Steve"));
        currentStudents.add(new Student(2, "Bob"));
        currentStudents.add(new Student(3, "Charles"));
        return currentStudents;
    }

    private Students addPreviousStudents(){
        Students currentStudents = new Students();
        currentStudents.add(new Student(1, "Carol"));
        currentStudents.add(new Student(2, "Tim"));
        currentStudents.add(new Student(3, "Scrooge"));
        return currentStudents;
    }


    @Bean(name = "currentStudents")
    public Students currentStudents(){
        return addCurrentStudents();
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return addPreviousStudents();
    }
}
