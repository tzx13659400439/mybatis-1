package com.example.mybatis1.mapper;


import com.example.mybatis1.bean.Scustomer;

public interface ScustomerMapper {
    Scustomer selectById(int id);

    int insert(Scustomer scustomer);
}
