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

/**
 *
 * @author Анна
 */
public class TypeList {
    private Map<Integer,Type> tList = new LinkedHashMap<Integer, Type>();
    private Type t;
    
    public TypeList()
    {
        Type t1 = new Type(1, "тип1");
        tList.put(1,t1);
        
        Type t2 = new Type(2, "тип2");
        tList.put(2,t2);
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
