package zipcode.rocks.BeanLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zipcode.rocks.BeanLab.Repository.Students;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("currentStudents")
    public Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    public Students previousStudents;

    @Test
    public void sizeTest1() {
        int expected = 3;

        int actual = currentStudents.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2() {
        int expected = 3;

        int actual = previousStudents.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest1() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Steve'}, " +
                "Person{id=2, name='Bob'}, " +
                "Person{id=3, name='Charles'}]}";

        String actual = currentStudents.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest2() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Carol'}, " +
                "Person{id=2, name='Tim'}, " +
                "Person{id=3, name='Scrooge'}]}";

        String actual = previousStudents.toString();

        Assert.assertEquals(expected, actual);
    }
}
