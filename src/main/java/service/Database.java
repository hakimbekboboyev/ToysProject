package service;

import controller.SearchToys;
import dto.AllProduct;

import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Database {
    Set<AllProduct> listProduct = new HashSet<>();
    Set<Long> longSet = new HashSet<>();
    String URL = "jdbc:postgresql://localhost:5432/toys";


    List<AllProduct> productList = new ArrayList<>();

    String user = "postgres";
    String password = "1";
    private final SearchToys searchToys = new SearchToys();


    public void searchProduct(int n) {
        try {

            Connection connection = DriverManager.getConnection(URL, user, password);

            String query = "select * from toys";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            switch (n){
                case 1:
                    searchToys.searchId(resultSet);
                    break;
                case 2:
                    searchToys.searchName(resultSet);
                    break;
                case 3:
                    searchToys.searchCategory(resultSet);
                    break;
                case 4:
                    searchToys.searchColour(resultSet);
                    break;
                case 5:
                    searchToys.searchPrice(resultSet);
                    break;
                case 6:
                    searchToys.searchQuantity(resultSet);
                    break;
                case 7:
                    searchToys.showAll(resultSet);
                    break;
                case 0:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Wrong choice!");
                    break;


            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }




}
