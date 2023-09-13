package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

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


        System.out.println("==== Teste 2 delete ====");
        departmentDao.deleteById(8);

    }
}
