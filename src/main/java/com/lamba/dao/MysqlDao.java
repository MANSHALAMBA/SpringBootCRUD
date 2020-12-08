package com.lamba.dao;


import com.lamba.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
@Repository
public class MysqlDao implements DaoI {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int create(Employee e) {

        int rAffetcted=jdbcTemplate.update(
                "INSERT INTO Employee (EMPNAME) VALUES (?)",
                e.getName());

        return rAffetcted;

    }

    @Override
    public Employee read(int id) {
     Object arr[]={id};
       Employee e= jdbcTemplate.query("select EMPID,EMPNAME from Employee where EMPID=?",arr,new ResultSetExtractor<Employee>(){
            @Override
            public Employee extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                Employee e=null;
                while(rs.next()){
                    e=new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));


                }
                return e;
            }
        });

        return e;
    }

    @Override
    public int update(Employee e) {
        int rAffetcted=jdbcTemplate.update(
                "update Employee set EMPNAME = ? where EMPID = ?",
                e.getName(), e.getId());

        return rAffetcted;
    }

    @Override
    public int delete(int id) {
        int rAffetcted=jdbcTemplate.update(
                "DELETE FROM Employee WHERE EMPID = ?",
                id);

        return rAffetcted;
    }
}
