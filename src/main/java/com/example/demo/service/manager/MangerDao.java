package com.example.demo.service.manager;

import com.example.demo.entity.Amial.Amail;
import com.example.demo.entity.user.admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MangerDao {
    @Select("")
    public List<admin> getData();
    @Select("")
    public List<Amail> getDataforAmail();
    @Insert("")
    public void insert(Amail amails);

}
