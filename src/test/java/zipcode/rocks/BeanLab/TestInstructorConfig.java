package zipcode.rocks.BeanLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zipcode.rocks.BeanLab.Repository.Instructors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorConfig {

    @Autowired
    @Qualifier("instructors")
    public Instructors instructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    public Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    public Instructors tcUkInstructors;

    @Test
    public void sizeTest1() {
        int expected = 3;

        int actual = instructors.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2() {
        int expected = 3;

        int actual = tcUkInstructors.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest3() {
        int expected = 3;

        int actual = tcUsaInstructors.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest1() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Mickey'}, " +
                "Person{id=2, name='Mouse'}, " +
                "Person{id=3, name='Clubhouse'}]}";

        String actual = instructors.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest2() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Bob'}, " +
                "Person{id=2, name='Cratchit'}, " +
                "Person{id=3, name='Charles'}]}";

        String actual = tcUsaInstructors.toString();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void toStringTest3() {
        String expected = "People{personList=[" +
                "Person{id=1, name='Tiny'}, " +
                "Person{id=2, name='Tim'}, " +
                "Person{id=3, name='Scrooge'}]}";

        String actual = tcUkInstructors.toString();

        Assert.assertEquals(expected, actual);
    }
}
