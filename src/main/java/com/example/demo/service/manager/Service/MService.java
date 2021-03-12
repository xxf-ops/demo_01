package com.example.demo.service.manager.Service;

import com.example.demo.entity.Amial.Amail;
import com.example.demo.entity.user.admin;
import com.example.demo.service.manager.MangerDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MService extends MangerDao {

    public List<admin> getData();

    public List<Amail> getDataforAmail();

    public void insert(Amail amails);
}
