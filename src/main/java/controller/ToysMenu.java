package controller;
import dto.AllProduct;
import service.Database;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class ToysMenu {
    public static void main(String[] args) throws SQLException {

        System.out.println("1.Search id\n2.Search name\n3.Search category\n4.Search colour\n" +
                "5.Search price\n6.Search quantity\n7.Show All\n0.Quit");
        Scanner son = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("--Select operation:");
        int n = son.nextInt();
        Database database = new Database();
        database.searchProduct(n);
        main(args);
    }
}
