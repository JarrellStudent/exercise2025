/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W05T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();

       
        if(number%2==0 ){
            System.out.println("Even");

        }
        else
            System.out.println("Odd");
    }
    
}
