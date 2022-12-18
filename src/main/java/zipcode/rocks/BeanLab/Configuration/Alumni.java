package zipcode.rocks.BeanLab.Configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import zipcode.rocks.BeanLab.Model.Instructor;
import zipcode.rocks.BeanLab.Repository.Instructors;
import zipcode.rocks.BeanLab.Repository.Students;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;// = new StudentConfig().previousStudents();

    @Autowired
    Instructors instructors = new InstructorsConfig().instructors();

    public Alumni() {

    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = previousStudents.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        for (Instructor instructor : instructors) {
            instructor.lecture(previousStudents.getPersonList(), numberOfHoursPerInstructor);
        }
    }
}
