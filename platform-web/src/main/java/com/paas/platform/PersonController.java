package com.paas.platform;

import com.alibaba.dubbo.config.annotation.Reference;
import com.paas.platform.api.Person;
import com.paas.platform.service.IPersonService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Reference(version = "${demo.service.version}")
    private IPersonService personService;

    @RequestMapping("/sayHello/{name}")
    public Person sayHello(@PathVariable("name") String name) {
        Person p = personService.getPersonService();
        p.setHob("代码123");
        return p;
    }
}
