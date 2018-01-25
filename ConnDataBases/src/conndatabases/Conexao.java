/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conndatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ramonmachado
 */
public class Conexao {

    public Connection conectaBD(String dataBase, String server,String dataBaseName, String user, String password) {

        Connection conexao = null;
        
        String dataBaseDriver;
        String url;
        
        switch(dataBase){
            case "MySQL": 
                dataBaseDriver = "com.mysql.jdbc.Driver";
                url = "jdbc:mysql://" + server + "/" + dataBaseName;
                break;
            case "SQLServer":
                dataBaseDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                url = "jdbc:sqlserver://" + server + ";databaseName=" + dataBaseName;
                break;
            default:
                System.out.println("Unknown database." + dataBase);
                return conexao;
        }
        
        try {
            Class.forName(dataBaseDriver).newInstance();
            conexao = DriverManager.getConnection(url, user, password);

            System.out.println("Connecting in URL: " + url + "\nDatabase: " + conexao.getCatalog());

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println("Exception: " + e);
        }
        return conexao;
    }

}
