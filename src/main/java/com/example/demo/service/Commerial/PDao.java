package com.example.demo.service.Commerial;

import com.example.demo.entity.commerial.Commerial;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PDao {
    @Select("")
    public List<Commerial> getData();
    @Insert("")
    public Commerial insert(Commerial commerial);
    @Delete("")
    public void delete(String name);
}
