/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Statement;
import java.util.*;
import java.sql.*;
import javax.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.pool.*;

/**
 *
 * @author Анна
 */
public class Connection {
    private java.sql.Connection c = null; 
    private Statement st = null; 
    
    public Connection()
    {
        try{
            OracleDataSource ods = new OracleDataSource(); 
            ods.setServerName("paralab"); 
            ods.setServiceName("lab.univer.omsk.su"); 
            ods.setPortNumber(1521); 
            ods.setUser("AnnaS"); 
            ods.setPassword("1");
            ods.setDriverType("thin"); 
            ods.setNetworkProtocol("tcp");       
        
            c = ods.getConnection();
            st=c.createStatement(); 
        } catch(Exception e) {} 
    }
    
    /*public ~Connection()
    {
        try{st.close();} catch(Exception e){}
        try{c.close();} catch(Exception e){}
    }*/
    
    public void closeConnection()
    {
        try{st.close();} catch(Exception e){}
        try{c.close();} catch(Exception e){}
    }
    
    public Statement getStatement()
    {
        return this.st;
    }
}
