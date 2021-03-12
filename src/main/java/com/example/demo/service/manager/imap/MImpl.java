package com.example.demo.service.manager.imap;

import com.example.demo.entity.Amial.Amail;
import com.example.demo.entity.user.admin;
import com.example.demo.service.manager.MangerDao;
import com.example.demo.service.manager.Service.MService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MImpl  implements MService {
    @Autowired
    private MangerDao dao;
    @Override
    public List<admin> getData() {
        return dao.getData();
    }

    @Override
    public List<Amail> getDataforAmail() {
        return dao.getDataforAmail();
    }

    @Override
    public void insert(Amail amails) {
        dao.insert(amails);
    }
}
