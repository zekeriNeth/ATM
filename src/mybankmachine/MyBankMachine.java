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
public class MyBankMachine {

    public static Scanner input=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    static boolean x=true;
    static boolean y=true;
    static int days=0;
    static double tempInput=0;
    static double interestRate=0;
    
    public static boolean errorCheckDouble(){      
        try{
            
            tempInput=input.nextDouble();
            if(tempInput>0){
                x=false;
            }else{
                System.out.println("That is incorrect input please try again");
            }
               
        }catch(InputMismatchException d){
            System.out.println("That is incorrect input please try again");
            
        }
        return x;
        
    }
    public static boolean errorCheckInt(){      
        try{
            
            tempInput=input.nextInt();
            if(tempInput>0){
                x=false;
            }else{
                System.out.println("That is incorrect input please try again");
            }
               
        }catch(InputMismatchException d){
            System.out.println("That is incorrect input please try again");
            
        }
        return x;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ATM atm;
        
        int userChoice=0;
        
        System.out.println("Welcome to the bank machine. Please enter your name");
        String user=input.nextLine();
        
        if(user.length()>0){
            atm=new ATM(user);
            
        }else{
            atm=new ATM();
            System.out.println("You inputed incorrectly. You are being randomly"
                    + " generated---\n");
            
        }

        
        System.out.println("Input a number and the correlating function will be"
                + " called.\n1)Deposit\n2)Withdraw\n3)Print balance\n4)Daily In"
                + "terest\n(Input a number less than 1 to exit)");
        
        try{
            userChoice=input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Sorry that's invalid input");
            
        }
        
        if(userChoice>0){
            
            if(userChoice==1){
                ATM.deposit();
                
            }else if(userChoice==2){
                ATM.withdraw();
                
            }else if(userChoice==3){
                ATM.printBalance();
                
            }else if(userChoice==4){
                System.out.println("What is the interest rate?");
                
                errorCheckDouble();
                
                if(x==false){
                    interestRate=tempInput;
                    System.out.println("How many days are you going to wait?");
                    
                    errorCheckInt();
                    

                    if(y){
                        days=(int) tempInput;
                        System.out.println("Final Cost:"+ATM.dailyInterest(interestRate,days));
                        
                    }
                }
                
            }else{
                System.out.println("Sorry that's invalid input");
            }
            
        }else{
        System.out.println("Thank you for your service");
        
        }
    }
    
}
