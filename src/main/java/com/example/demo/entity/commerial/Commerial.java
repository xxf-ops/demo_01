package com.example.demo.entity.commerial;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Commerial {
    private int pid;
    private String name;
    private String kind;
    private String price;
}
