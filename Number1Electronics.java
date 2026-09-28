/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
public class Number1Electronics {

     public static void main(String[] args) {

        // Rows For the Cities
        // Columns For PS5, Xbox, Switch
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // This will display the sales
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------");

          // using a loop to go through all the cities 
        for (int i = 0; i < sales.length; i++) {
            System.out.print(cities[i] + ": ");

            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(consoles[j] + "  " + sales[i][j] + "  ");
            }

            System.out.println();
        }

        // Finding the console with the most sales
        int highestSales = 0;
        String bestConsole = "";

        for (int j = 0; j < consoles.length; j++) {

            int totalSales = 0;

            for (int i = 0; i < sales.length; i++) {
                totalSales = totalSales + sales[i][j];
            }

            System.out.println(consoles[j] + " " + totalSales);

            if (totalSales > highestSales) {
                highestSales = totalSales;
                bestConsole = consoles[j];
            }
        }

        System.out.println("-----------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + highestSales);
    }
   }
