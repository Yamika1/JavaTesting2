/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task_03;

import javax.swing.JOptionPane;

/**
 *
 * @author yamik
 */
public class ICE_TASK_03 {

    public static void main(String[] args) {
        
      // Declarations
      String nameOfBusiness;
      int grossProfit;
       int expenses;
       int netProfit;
       int year;
       
        
        
        // Prompt the user to enter the projected gross profit for the first year
    
    JOptionPane.showInputDialog(null, "Please enter the projected gross profit for the first year: ", "grossProfit", JOptionPane.QUESTION_MESSAGE);
    
    //  Prompt the user to enter the estimated expenses for the first year
    
    JOptionPane.showInputDialog(null, "Please enter the estimated expenses for the first year: ", "estimatedExpenses", JOptionPane.QUESTION_MESSAGE);
    
   // Calculate expenses are increasing each year
   JOptionPane.showInputDialog(null, "Please enter the expenses each year: ", "expenses", JOptionPane.QUESTION_MESSAGE);
    
// Calculate Gross Profits each year
    
    JOptionPane.showInputDialog(null, "Please enter gross profits from each year: ", "grossProfits", JOptionPane.QUESTION_MESSAGE);
    
    // Display a report 
    
    JOptionPane.showInputDialog(null, "Name of the business: ", "nameOfBusiness", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showInputDialog(null, "Year of first profit : ", "Year", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showInputDialog(null, "The gross profit : ", "grossProfit", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showInputDialog(null, "The expenses : ", "expenses", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showInputDialog(null, "The net profit for each year: ", "netProfit", JOptionPane.INFORMATION_MESSAGE);
    
    
    
   
    }
}
