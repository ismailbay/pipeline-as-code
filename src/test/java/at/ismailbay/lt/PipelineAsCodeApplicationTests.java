package at.ismailbay.lt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PipelineAsCodeApplicationTests {

    @Test
    public void contextLoads() {}
    
    @Test
    public void testFail() {
        Assert.fail("fail on purpose");
    }

}
