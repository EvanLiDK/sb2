package com.mooc.sb2;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.event.WeatherRunListener;
import com.mooc.sb2.mapper.DemoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Sb2Application.class})
public class Sb2ApplicationTests  {

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    public void contextLoads(){

    }

    @Test
    public void testEvent(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }


}
