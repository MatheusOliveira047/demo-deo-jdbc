package application;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;

import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) throws ParseException {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2: sellers findByDepartment ===");
        List<Seller> sellers = sellerDao.findByDepartment(new Department(2,"Books"));
        sellers.forEach(System.out::println);

        System.out.println("=== TEST 4: Insert seller ===");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Seller seller1 = new Seller(null,"Vanessa","vanessa@gmail.com",sdf.parse("20/04/1998"),8000.00,new Department(1,"Books"));
        sellerDao.insert(seller1);

        System.out.println("=== TEST 3: sellers findAll ===");
        List<Seller> sellers1 = sellerDao.findAll();
        sellers1.forEach(System.out::println);

    }

}
