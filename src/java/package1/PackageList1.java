/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.text.*;
import type.Type;

/**
 *
 * @author Анна
 */
public class PackageList1 {
    private Map<Integer,Package1> pList = new LinkedHashMap<Integer, Package1>();
    private Package1 p;
    
    public PackageList1()
    {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        java.util.Date date = new java.util.Date();
        String d = new String("");
        
        d = "25.11.2017";
        try{
            date = format.parse(d);
        } catch(Exception e) {}
        
        Package1 p1 = new Package1(1, "one", 2, date);
        pList.put(1,p1);
        
        d = "15.12.2017";
        try{
            date = format.parse(d);
        } catch(ParseException e) {}
        
        Package1 p2 = new Package1(2, "два", 1, date);
        pList.put(2,p2);
    }  
      
    public void deleteFromHashMap(int j)
    {
        try{
            this.pList.remove(j);
        } catch(Exception e){}
    }
      
    public Collection<Package1> values()
    {
        return this.pList.values();
    }
    
    public Package1 getPackage1(Integer i)
    {
        return this.pList.get(i);
    }
}
