package com.example.demo.service.user.Service;

import com.example.demo.entity.Amial.Amail;
import com.example.demo.entity.user.admin;
import com.example.demo.service.user.Dao.UserDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService extends UserDao {

    public List<Amail> select(Amail amail);
    public List<Amail> check();
    public admin update(admin admin);
    public Amail update_Amail(String name);
}
