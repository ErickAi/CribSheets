package com.er.frameworks;

import com.er.POJO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.*;

public class JDBC {

    public static void main(String[] args) throws SQLException {
//эта строка загружает драйвер DB. раскомментируйте если прописываете драйвер вручную
        //Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        List<POJO> objects = new ArrayList<>();
        try {
//Получаем Connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_name","user", "password");
            if (connection == null) {
                System.out.println("Нет соединения с БД!");
                System.exit(0);
            }
//Создаем Statement, PreparedStatement для executeBatch() или CallableStatement;
            Statement stmt = connection.createStatement();
//Из запроса получаем ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
//Используем данные из ResultSet
            while (rs.next()) {
                //users.add(/*логика маппинга ResultSet в юзеров*/);
            }
//При закрытии Statement автоматически закрываются все связанные с ним открытые ResultSet
            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if (connection != null){
                connection.close();
            }
        }
    }
}
