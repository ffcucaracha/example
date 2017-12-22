/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.text.SimpleDateFormat;
import java.util.Date;
import type.*;

/**
 *
 * @author Анна
 */
public class Package1 {
    private Integer id;
    private String name;
    private Integer type;
    private Date date;
    
    
    public Package1(Integer id_, String name_, Integer type_, Date date_)
    {
        this.id = id_;
        this.name = name_;
        this.type = type_;
        this.date = date_;
    }
    
    public Integer getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getType(TypeList tList)
    {
        Type t = tList.getType(this.type);
        return t.getName();
    }
    
    public String getDate()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String s = format.format(this.date);
        return s;
    }
}
