package com.lamba.service;

import com.lamba.dao.MysqlDao;
import com.lamba.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CRUDService {

    @Autowired
    MysqlDao dao;


   public int create(Employee e){
        return dao.create(e);
   }

    public Employee read(int id){
       return dao.read(id);
    }

    public int update(Employee e){
       return dao.update(e);
    }
    public int delete (int id){
       return dao.delete(id);
    }
}
