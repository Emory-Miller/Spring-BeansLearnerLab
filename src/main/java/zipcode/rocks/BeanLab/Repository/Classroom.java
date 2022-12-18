package zipcode.rocks.BeanLab.Repository;

import zipcode.rocks.BeanLab.Model.Learner;
import zipcode.rocks.BeanLab.Model.Teacher;

public class Classroom {

    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public Classroom() {
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Iterable<? extends Learner>) students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
