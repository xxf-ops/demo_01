package com.example.demo.service.Title;

import com.example.demo.entity.Title;

import java.util.List;

public interface TitleService extends TitleDao {
    public List<Title> getData(String username);
    public Title write(Title title);
    public void delete(String username);
}
