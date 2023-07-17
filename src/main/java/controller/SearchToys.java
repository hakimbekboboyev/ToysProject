package controller;

import dto.AllProduct;
import model.Appliance;
import model.Toys;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchToys implements SearchProduct {


    private final SearchItemBySubString searchProduct = new SearchItemBySubString();

    @Override
    public void searchId(ResultSet resultSet) throws SQLException {
        Scanner son = new Scanner(System.in);
        System.out.print("Enter id:");
        long id = son.nextLong();
        Toys toys;
        Appliance appliance = new model.Appliance();
        AllProduct allProduct = new AllProduct();
        int t = 0;
        while (resultSet.next()) {
            if (resultSet.getLong("id") == id) {
                t++;
                allProduct.setId(resultSet.getLong("id"));
                allProduct.setName(resultSet.getString("name"));
                allProduct.setCategory(resultSet.getString("category"));
                allProduct.setColour(resultSet.getString("colour"));
                allProduct.setPrice(resultSet.getDouble("price"));
                allProduct.setQuantity(resultSet.getLong("quantity"));

                appliance.setColour(allProduct.getColour());
                appliance.setPrice(allProduct.getPrice());
                appliance.setQuantity(allProduct.getQuantity());

                toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
                System.out.println(toys.toString());
            }
        }
        if (t == 0) {
            System.out.println("Not Found!");
        }
    }

    public void searchName(ResultSet resultSet) throws SQLException {
        Toys toys;
        Appliance appliance = new model.Appliance();
        AllProduct allProduct = new AllProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String word = scanner.nextLine();

        int t = 0;
        while (resultSet.next()) {
            String text = resultSet.getString("name");
            boolean isName = searchProduct.searchItemSubString(text, word);
            if (isName) {
                t++;
                allProduct.setId(resultSet.getLong("id"));
                allProduct.setName(resultSet.getString("name"));
                allProduct.setCategory(resultSet.getString("category"));
                allProduct.setColour(resultSet.getString("colour"));
                allProduct.setPrice(resultSet.getDouble("price"));
                allProduct.setQuantity(resultSet.getLong("quantity"));

                appliance.setColour(allProduct.getColour());
                appliance.setPrice(allProduct.getPrice());
                appliance.setQuantity(allProduct.getQuantity());

                toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
                System.out.println(toys.toString());
            }
        }
        if (t == 0) {
            System.out.println("Not Found!");
        }

    }

    @Override
    public void searchCategory(ResultSet resultSet) throws SQLException {
        Toys toys;
        Appliance appliance = new model.Appliance();
        AllProduct allProduct = new AllProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter category: ");
        String word = scanner.nextLine();

        int t = 0;
        while (resultSet.next()) {
            String text = resultSet.getString("category");
            boolean isCategory = searchProduct.searchItemSubString(text, word);
            if (isCategory) {
                t++;
                allProduct.setId(resultSet.getLong("id"));
                allProduct.setName(resultSet.getString("name"));
                allProduct.setCategory(resultSet.getString("category"));
                allProduct.setColour(resultSet.getString("colour"));
                allProduct.setPrice(resultSet.getDouble("price"));
                allProduct.setQuantity(resultSet.getLong("quantity"));

                appliance.setColour(allProduct.getColour());
                appliance.setPrice(allProduct.getPrice());
                appliance.setQuantity(allProduct.getQuantity());

                toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
                System.out.println(toys.toString());
            }
        }
        if (t == 0) {
            System.out.println("Not Found!");
        }
    }

    @Override
    public void searchColour(ResultSet resultSet) throws SQLException {
        Toys toys;
        Appliance appliance = new Appliance();
        AllProduct allProduct = new AllProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Colour: ");
        String word = scanner.nextLine();

        int t = 0;
        while (resultSet.next()) {
            String text = resultSet.getString("colour");
            boolean isColour = searchProduct.searchItemSubString(text, word);
            if (isColour) {
                t++;
                allProduct.setId(resultSet.getLong("id"));
                allProduct.setName(resultSet.getString("name"));
                allProduct.setCategory(resultSet.getString("category"));
                allProduct.setColour(resultSet.getString("colour"));
                allProduct.setPrice(resultSet.getDouble("price"));
                allProduct.setQuantity(resultSet.getLong("quantity"));

                appliance.setColour(allProduct.getColour());
                appliance.setPrice(allProduct.getPrice());
                appliance.setQuantity(allProduct.getQuantity());

                toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
                System.out.println(toys.toString());
            }
        }
        if (t == 0) {
            System.out.println("Not Found!");
        }

    }

    @Override
    public void searchPrice(ResultSet resultSet) throws SQLException {
        Toys toys;
        Appliance appliance = new model.Appliance();
        AllProduct allProduct = new AllProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Price: ");
        String word = scanner.nextLine();

        int t = 0;
        while (resultSet.next()) {
            String text = String.valueOf(resultSet.getDouble("price"));
            boolean isPrice = searchProduct.searchItemSubString(text, word);
            if (isPrice) {
                t++;
                allProduct.setId(resultSet.getLong("id"));
                allProduct.setName(resultSet.getString("name"));
                allProduct.setCategory(resultSet.getString("category"));
                allProduct.setColour(resultSet.getString("colour"));
                allProduct.setPrice(resultSet.getDouble("price"));
                allProduct.setQuantity(resultSet.getLong("quantity"));

                appliance.setColour(allProduct.getColour());
                appliance.setPrice(allProduct.getPrice());
                appliance.setQuantity(allProduct.getQuantity());

                toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
                System.out.println(toys.toString());
            }
        }
        if (t == 0) {
            System.out.println("Not Found!");
        }
    }

    @Override
    public void searchQuantity(ResultSet resultSet) throws SQLException {
        Toys toys;
        Appliance appliance = new model.Appliance();
        AllProduct allProduct = new AllProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Quantity: ");
        String word = scanner.nextLine();

        int t = 0;
        while (resultSet.next()) {
            String text = String.valueOf(resultSet.getLong("quantity"));
            boolean isQuantity = searchProduct.searchItemSubString(text, word);
            if (isQuantity) {
                t++;
                allProduct.setId(resultSet.getLong("id"));
                allProduct.setName(resultSet.getString("name"));
                allProduct.setCategory(resultSet.getString("category"));
                allProduct.setColour(resultSet.getString("colour"));
                allProduct.setPrice(resultSet.getDouble("price"));
                allProduct.setQuantity(resultSet.getLong("quantity"));

                appliance.setColour(allProduct.getColour());
                appliance.setPrice(allProduct.getPrice());
                appliance.setQuantity(allProduct.getQuantity());

                toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
                System.out.println(toys.toString());
            }
        }
        if (t == 0) {
            System.out.println("Not Found!");
        }

    }

    @Override
    public void showAll(ResultSet resultSet) throws SQLException {
        Toys toys;
        Appliance appliance = new model.Appliance();
        AllProduct allProduct = new AllProduct();
        while (resultSet.next()) {
            allProduct.setId(resultSet.getLong("id"));
            allProduct.setName(resultSet.getString("name"));
            allProduct.setCategory(resultSet.getString("category"));
            allProduct.setColour(resultSet.getString("colour"));
            allProduct.setPrice(resultSet.getDouble("price"));
            allProduct.setQuantity(resultSet.getLong("quantity"));

            appliance.setColour(allProduct.getColour());
            appliance.setPrice(allProduct.getPrice());
            appliance.setQuantity(allProduct.getQuantity());

            toys = new Toys(allProduct.getId(), allProduct.getName(), allProduct.getCategory(), appliance);
            System.out.println(toys.toString());
        }
    }
}