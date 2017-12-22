/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

/**
 *
 * @author Анна
 */
public class Type {
    public Integer id;
    public String name;
    
    public Type(Integer id_, String name_)
    {
        this.id = id_;
        this.name = name_;
    }
    
    public String getName()
    {
        return this.name;
    }
}
