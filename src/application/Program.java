package application;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse("18/07/1998");
        Department department = new Department(1,"Developer");

        Seller seller = new Seller(1,"Ludson","ludson@gmail.com",date,3500.00,department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);





    }

}
