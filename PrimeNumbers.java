/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

import java.util.Scanner;

/**
 *
 * @author M N Khakse
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("Insert any whole number= ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        boolean prime= true;
        
        for(int i=2; i<num; i++){
            if(num%i==0){
                prime= false;
                break;
            }
          
        }
        
        if(prime){
            System.out.println(num+" is a prime number.");
        }   
        else{
            System.out.println(num+" is not a prime number.");
    
        }
    } 
        // TODO code application logic here
    }
    

