/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trogers8
 */
public class Challenge1 {
    public static void main(String[] args) {
    Employee e1 = new Employee(1, "Smith", "Bob", "111-11-1111");
    Employee e2 = new Employee(2, "Jones", "Sally", "222-22-2222");
    Employee e3 = new Employee(3, "Pecker", "Peter", "333-33-3333");
    Employee e4 = new Employee(2, "Jones", "Sally", "222-22-2222");
    
    List employees = new ArrayList();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);
    employees.add(e4);
    
    for(int i =0; i<employees.size();i++){
        Employee tempEmployee = (Employee)employees.get(i);
        System.out.println(tempEmployee.getFirstName() + " " + tempEmployee.getLastName());
    }
    }
}
