package com.example.demo.service.user.Dao;

import com.example.demo.entity.Amial.Amail;
import com.example.demo.entity.user.admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("")
    public List<Amail> select(Amail amail);
    @Select("")
    public List<Amail> check();
    @Update("")
    public admin update(admin admin);
    @Update("")
    public Amail update_Amail(String name);

}
