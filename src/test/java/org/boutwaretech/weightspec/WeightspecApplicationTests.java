package org.boutwaretech.weightspec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.boutwaretech.weightspec.WeightspecApplication;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = WeightspecApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class WeightspecApplicationTests {

    @Test
    public void contextLoads() {
    }

}
