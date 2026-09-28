/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapp;

/**
 *
 * @author Student
 */
public abstract class Console implements IConsole {

    private String consoleType;
    private String store;
    private String totalSales;

    public Console(String consoleType, String store, String totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public String getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}


