package com.example.demo.service.Commerial;

import com.example.demo.entity.commerial.Commerial;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PService extends PDao {

    public List<Commerial> getData();
    public Commerial insert(Commerial commerial);
    public void delete(String name);
}
