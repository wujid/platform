package com.paas.platform;

import com.alibaba.dubbo.config.annotation.Reference;
import com.paas.platform.api.Person;
import com.paas.platform.dao.IPersonDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Reference(version = "${demo.service.version}")
    private IPersonDao personDao;

    @RequestMapping("/sayHello/test")
    public Person sayHello(){
        Person p = personDao.getPersonDao();
        return  p;
    }

}
