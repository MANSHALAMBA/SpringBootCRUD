package com.lamba.dao;


import com.lamba.model.Employee;

import java.util.List;

public interface DaoI {

    int create(Employee e);
    Employee read(int id);
    int update(Employee e);
    int delete(int id);



}
