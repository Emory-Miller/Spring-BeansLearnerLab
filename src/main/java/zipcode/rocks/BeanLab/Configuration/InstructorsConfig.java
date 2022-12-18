package zipcode.rocks.BeanLab.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipcode.rocks.BeanLab.Model.Instructor;
import zipcode.rocks.BeanLab.Repository.Instructors;

@Configuration
public class InstructorsConfig {

    @Bean(name = "instructors")
    public Instructors instructors(){
        Instructors instructors = new Instructors();
        instructors.add(new Instructor(1, "Mickey"));
        instructors.add(new Instructor(2, "Mouse"));
        instructors.add(new Instructor(3, "Clubhouse"));
        return instructors;
    }

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        Instructors tcUsaInstructors = new Instructors();
        tcUsaInstructors.add(new Instructor(1, "Bob"));
        tcUsaInstructors.add(new Instructor(2, "Cratchit"));
        tcUsaInstructors.add(new Instructor(3, "Charles"));
        return tcUsaInstructors;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        Instructors tcUkInstructors = new Instructors();
        tcUkInstructors.add(new Instructor(1, "Tiny"));
        tcUkInstructors.add(new Instructor(2, "Tim"));
        tcUkInstructors.add(new Instructor(3, "Scrooge"));
        return tcUkInstructors;
    }

}
