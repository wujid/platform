package com.paas.platform;

import com.alibaba.dubbo.config.annotation.Service;
import com.paas.platform.api.Person;
import com.paas.platform.dao.IPersonDao;

@Service(version = "${demo.dao.version}")
public class PersonDaoImpl implements IPersonDao {
    @Override
    public Person getPersonDao() {
        Person p = new Person();
        p.setName("张三");
        return p;
    }
}
