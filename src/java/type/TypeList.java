/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import DAO.Connection;

/**
 *
 * @authoimport java.sql.ResultSet;
r Анна
 */
public class TypeList {
    private Map<Integer,Type> tList = new LinkedHashMap<Integer, Type>();
    private Type t;
    
    public TypeList()
    {
        /*
        Type t1 = new Type(1, "тип1");
        tList.put(1,t1);
        
        Type t2 = new Type(2, "тип2");
        tList.put(2,t2);
        */
        try{
            String sql = "select * from tbl_order where id = "+id_;
            ResultSet rs = st.executeQuery(sql);
            this.id = rs.getInt(1);
            this.name = rs.getString(2);
        } catch(Exception e){}
        finally{
            Connection.closeConnection();
        }
    }  
      
    public void deleteFromHashMap(int j)
    {
        try{
            this.tList.remove(j);
        } catch(Exception e){}
    }
      
    public Collection<Type> values()
    {
        return this.tList.values();
    }
    
     public Type getType(int i)
      {
          return this.tList.get(i);
      }
}
