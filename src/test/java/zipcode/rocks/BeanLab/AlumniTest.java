package zipcode.rocks.BeanLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zipcode.rocks.BeanLab.Configuration.Alumni;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Alumni alumni;// = new Alumni();

    @Test
    public void hoursTest(){
        alumni.getPreviousStudents().findById(1L).setTotalStudyTime(0);
        alumni.executeBootcamp();

        double expected = 1200;

        double actual = alumni.getPreviousStudents().findById(1L).getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void hoursTest2(){

        alumni.getPreviousStudents().findById(2L).setTotalStudyTime(0);
        alumni.executeBootcamp();
        double expected = 1200;

        double actual = alumni.getPreviousStudents().findById(2L).getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void hoursTest3(){
        alumni.getPreviousStudents().findById(3L).setTotalStudyTime(0);
        alumni.executeBootcamp();

        double expected = 1200;

        double actual = alumni.getPreviousStudents().findById(3L).getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }
}
