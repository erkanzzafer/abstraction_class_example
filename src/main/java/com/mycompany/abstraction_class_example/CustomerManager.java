/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction_class_example;

/**
 *
 * @author zafer
 */
public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers() {
        databaseManager.getData();
    }

}
