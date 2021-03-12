package com.example.demo.entity.user;

import com.example.demo.entity.Amial.Amail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class admin {
    private String username;
    private String password;
    private String realname;
    private String Iphone;
    private String  Address;
    private List<Amail> amail;

}
