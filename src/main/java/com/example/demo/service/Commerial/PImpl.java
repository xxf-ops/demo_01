package com.example.demo.service.Commerial;

import com.example.demo.entity.commerial.Commerial;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PImpl implements PService {
    @Autowired
    private PDao pDao;
    @Override
    public List<Commerial> getData() {
        return pDao.getData();
    }

    @Override
    public Commerial insert(Commerial commerial) {
        return pDao.insert(commerial);
    }

    @Override
    public void delete(String name) {
       pDao.delete(name);
    }

}
