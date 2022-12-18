package zipcode.rocks.BeanLab.Repository;

import zipcode.rocks.BeanLab.Model.Student;

import java.util.List;

public class Students extends People<Student>{

    public Students(List<Student> personList) {
        super(personList);
    }

    public Students() {}
}
