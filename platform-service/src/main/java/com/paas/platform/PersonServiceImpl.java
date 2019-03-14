package com.paas.platform;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.paas.platform.api.Person;
import com.paas.platform.dao.IPersonDao;
import com.paas.platform.service.IPersonService;

@Service(version = "${demo.service.version}")
public class PersonServiceImpl implements IPersonService {

    @Reference(version = "${demo.service.version}")
    private IPersonDao personDao;

    @Override
    public Person getPersonService() {
        Person p = personDao.getPersonDao();
        p.setAge(10);
        return p;
    }
}
