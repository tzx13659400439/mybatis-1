package com.example.mybatis1;

import com.example.mybatis1.bean.Customer;
import com.example.mybatis1.bean.Scustomer;
import com.example.mybatis1.bean.Student;
import com.example.mybatis1.mapper.CustomerMapper;
import com.example.mybatis1.mapper.ScustomerMapper;
import com.example.mybatis1.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatis1ApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ScustomerMapper scustomerMapper;

    @Test
    public void contextLoads() {
        //插入指定数据
        Customer customer = new Customer(2,54.4,"tzx");
        customerMapper.insert(customer);


    }


    @Test
    public void test1(){
        //删除指定数据
//        studentMapper.delete(14);
        //删除所有数据
//        studentMapper.delAll();
        //插入数据
//        Student student = new Student(1,"陶中翔");
//        studentMapper.insert(student);
        //查询指定数据
//        Student student1 = studentMapper.queOne(15);
//        System.out.println(student1.toString());
        //查询所有数据
//        List<Student> students = studentMapper.queAll();
//        for(Student student:students){
//            System.out.println(student.toString());
//        }
        //查询数据数目
        int count = studentMapper.queCount();
        System.out.println(count);

        //修改指定数据
        Student student = new Student(1,"幻之兄");
        studentMapper.update(student);
    }

    @Test
    public void test2(){
//        Scustomer scustomer = new Scustomer(1,23.4,"陶中翔");
//        int i = scustomerMapper.insert(scustomer);
//        System.out.println(i+"修改了");
        Scustomer scustomer = scustomerMapper.selectById(1);
        System.out.println(scustomer.toString());

    }

}
