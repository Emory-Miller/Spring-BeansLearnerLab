package zipcode.rocks.BeanLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zipcode.rocks.BeanLab.Repository.Classroom;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    public Classroom currentCohort;

    @Autowired
    public Classroom previousCohort;

    @Test
    public void toStringInstructorsTest1() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Bob'}, " +
                "Person{id=2, name='Cratchit'}, " +
                "Person{id=3, name='Charles'}]}";

        String actual = currentCohort.getInstructors().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringInstructorsTest2() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Rudolph'}, " +
                "Person{id=2, name='Santa'}, " +
                "Person{id=3, name='Frosty'}]}";

        String actual = previousCohort.getInstructors().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringStudentsTest1() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Carol'}, " +
                "Person{id=2, name='Tim'}, " +
                "Person{id=3, name='Scrooge'}]}";

        String actual = currentCohort.getStudents().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringStudentsTest2() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Bill'}, " +
                "Person{id=2, name='Murray'}, " +
                "Person{id=3, name='Scrooge'}]}";

        String actual = previousCohort.getStudents().toString();

        Assert.assertEquals(expected, actual);
    }

}
