package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SearchProduct {
    void searchId(ResultSet resultSet) throws SQLException;
    void searchName(ResultSet resultSet) throws SQLException;
    void searchCategory(ResultSet resultSet) throws SQLException;
    void searchColour(ResultSet resultSet) throws SQLException;
    void searchPrice(ResultSet resultSet) throws SQLException;
    void searchQuantity(ResultSet resultSet) throws SQLException;
    void showAll(ResultSet resultSet) throws SQLException;

}
