package com.example.demo.service.user.impl;

import com.example.demo.entity.Amial.Amail;
import com.example.demo.entity.user.admin;
import com.example.demo.service.user.Dao.UserDao;
import com.example.demo.service.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userImpl implements UserService {
    @Autowired
    private UserDao u;
    @Override
    public List<Amail> select(Amail amail) {
        return u.select(amail);
    }

    @Override
    public List<Amail> check() {
        return u.check();
    }

    @Override
    public admin update(admin admin) {
        return u.update(admin);
    }

    @Override
    public Amail update_Amail(String name) {
        return u.update_Amail(name);
    }
}
