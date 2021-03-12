package com.example.demo.service.Title;

import com.example.demo.entity.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleImpl  implements TitleService{
    @Autowired
    private TitleDao dao;
    @Override
    public List<Title> getData(String name) {
        return dao.getData(name);
    }

    @Override
    public Title write(Title title) {
        return dao.write(title);
    }

    @Override
    public void delete(String username) {
       dao.delete(username);
    }
    public void delete(int id,String username){
        List<Title> list = dao.getData(username);
        list.remove(id);
    }
}
