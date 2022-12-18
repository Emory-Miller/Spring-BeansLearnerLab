package zipcode.rocks.BeanLab.Configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import zipcode.rocks.BeanLab.Repository.Instructors;
import zipcode.rocks.BeanLab.Repository.Students;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @PostConstruct
    public void executeBootcamp (){

    }
}
