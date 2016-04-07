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
public class Test2 {
    public static void main(String[] args) {
    Map<String, String> record1 = new HashMap<>();
    record1.put("name", "Sally Jones");
    record1.put("ssn","111-11-1111");
    Map<String, String> record2 = new HashMap<>();
    record1.put("name", "Bob Smith");
    record1.put("ssn","222-221-2222");
    
    List<Map<String,String>> employees = new ArrayList<>();
    employees.add(record1);
    employees.add(record2);

    
    }
}
