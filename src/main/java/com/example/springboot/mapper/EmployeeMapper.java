package com.example.springboot.mapper;


import com.example.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
