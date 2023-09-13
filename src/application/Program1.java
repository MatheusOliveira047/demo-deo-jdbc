package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //System.out.println("==== Teste 1 insert ====");
        Department department = new Department(null,"Backend");
        //departmentDao.insert(department);

        //department = new Department(null,"FrontEnd");
        //departmentDao.insert(department);


       //System.out.println("==== Teste 2 update ====");
        // department = new Department(7,"FullStack");
       //departmentDao.update(department);


        //System.out.println("==== Teste 3 delete ====");
        //departmentDao.deleteById(8);

       // System.out.println("==== Teste 4 delete ====");
        //Department dep = departmentDao.findById(2);
        //System.out.println(dep);

        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

    }
}
