package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Teste 1 insert ====");
        Department department = new Department(null,"Backend");
        departmentDao.insert(department);

        department = new Department(null,"FrontEnd");
        departmentDao.insert(department);

    }
}