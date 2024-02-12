/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.abstraction_class_example;

/**
 *
 * @author zafer
 */
public class Abstraction_class_example {

    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        cm.databaseManager = new SqlServerDatabaseManager();
        cm.getCustomers();
    }
}
