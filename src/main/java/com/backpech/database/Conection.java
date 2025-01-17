package com.backpech.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conection {

    public static void main(String[] args) {

        try {
            //Register the Driver
            Class.forName("com.mysql.jdbc.Driver");

            //Open a connection
            Connection cxn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_CdT", "admcdt", "CongeladosDoTio2405");

            System.out.println("Conexão realizada com sucesso!");

            //Close the connection
            cxn.close();

        //Handling errors
        } catch (SQLException e) {
            //Handle errors for Class.forName
            System.err.println("Não foi possível conectar ao banco de dados!");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.err.println("O Driver JDBC não foi encontrado!");
            e.printStackTrace();
        }

    }
}
