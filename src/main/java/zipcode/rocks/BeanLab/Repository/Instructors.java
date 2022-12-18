package zipcode.rocks.BeanLab.Repository;

import zipcode.rocks.BeanLab.Model.Instructor;

import java.util.List;

public class Instructors extends People<Instructor>{
    public Instructors(List<Instructor> personList) {
        super(personList);
    }

    public Instructors() {}
}
