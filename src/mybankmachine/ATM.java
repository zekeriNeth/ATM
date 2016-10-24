/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;
import java.util.*;
/**
 *
 * @author Zanea7326
 */


public class ATM {
    
    public static Scanner input=new Scanner(System.in);
    
    private String user;
    private static int balance=0;
    
    
    public ATM(){
        user="John Doe";
        balance=0;
        
    }public ATM(String name){
        user=name;
        balance=balance;
        
        
    }public static void deposit(){
        System.out.println("Please input how much you wish to deposit");
        int userInput=input.nextInt();
        
        if(userInput>0){
            balance+=userInput;
        }else{
            System.out.println("Sorry that is incorrect input");
        }
    }public static void withdraw(){
        System.out.println("Please input how much you wish to withdraw");
        int userInput=input.nextInt();
        
        if(userInput>0&&userInput<balance){
            balance-=userInput;
        }else{
            System.out.println("Sorry that is incorrect input");
        }
        
    }public static double dailyInterest(double rate,int days){
       double finalCost;
       int principleAmount=balance;
       
       finalCost=principleAmount*Math.pow(1+(rate/100),days);
       
       return finalCost;
       
    }public static void printBalance(){
        System.out.println("Balance: $"+balance);
    }
}
