package com.paas.platform;

import com.paas.platform.api.Person;
import com.paas.platform.dao.IPersonDao;
import com.paas.platform.service.IPersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformServiceApplicationTests {

    @Resource
    IPersonService personService;
    @Test
    public void contextLoads() {
        Person p = personService.getPersonService();
        System.out.print(p);
    }

}
