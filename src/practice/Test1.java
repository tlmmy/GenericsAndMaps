/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author trogers8
 */
public class Test1 {
    public static void main(String[] args) {
        
    
    Employee e1 = new Employee(1, "Smith", "Bob", "111-11-1111");
    Employee e2 = new Employee(2, "Jones", "Sally", "222-22-2222");
    Employee e3 = new Employee(3, "Pecker", "Peter", "333-33-3333");
    
    List<Employee> wctcEmployees = new ArrayList<>();
    wctcEmployees.add(e1);
    wctcEmployees.add(e2);
    wctcEmployees.add(e3);
    
    Employee e4 = new Employee(4, "Sanders", "Bernie", "444-44-4444");
    Employee e5 = new Employee(5, "Clinton", "Hilary", "555-55-5555");
    Employee e6 = new Employee(6, "Cruz", "Ted", "666-66-6666");
    
    List<Employee> politicians = new ArrayList<>();
    politicians.add(e4);
    politicians.add(e5);
    politicians.add(e6);
    
    Map<String, List<Employee>> employees = new HashMap<>();
    employees.put("wctc", wctcEmployees);
    employees.put("politicians", politicians);
    
    
    List<Employee> eList = employees.get("wctc");
        System.out.println(eList);
    
    }
}
