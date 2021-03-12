package com.example.demo.service.Title;

import com.example.demo.entity.Title;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TitleDao {
   @Select("")
    public List<Title> getData(String username);
   @Insert("")
    public Title write(Title title);
   @Delete("")
   public void delete(String username);
}
