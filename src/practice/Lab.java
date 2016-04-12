/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Employee;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Tim
 */
public class Lab {
    public static void main(String[] args) {
        
    
    Employee e1 = new Employee(1, "Smith", "Bob", "111-11-1111");
    Employee e2 = new Employee(2, "Jones", "Sally", "222-22-2222");
    Employee e3 = new Employee(3, "Pecker", "Peter", "333-33-3333");
    Employee e4 = new Employee(4, "Jones", "Sally", "222-22-2222");
    
    Map<String, Employee> employees = new HashMap<>();
    employees.put(e1.getSsn(), e1);
    employees.put(e2.getSsn(), e2);
    employees.put(e3.getSsn(), e3);
    employees.put(e4.getSsn(), e4);
    
    
     Set<String> keys = employees.keySet();
        for(String key : keys) {
            Employee found = employees.get(key);
            System.out.println(found.toString());
        }
        System.out.println("");
    Map<String, Employee> employees2 = new TreeMap<>();
    employees.put(e1.getSsn(), e1);
    employees.put(e2.getSsn(), e2);
    employees.put(e3.getSsn(), e3);
    employees.put(e4.getSsn(), e4);
    
     Set<String> keys2 = employees.keySet();
        for(String key : keys2) {
            Employee found = employees.get(key);
            System.out.println(found.toString());
        }
}
}

