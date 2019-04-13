import com.vivi.TaskJob;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springTask.xml")
public class test1 {

    @Autowired
    private TaskJob taskJob;

    @Test
    public void demo1(){
        taskJob.job1();
    }
}
