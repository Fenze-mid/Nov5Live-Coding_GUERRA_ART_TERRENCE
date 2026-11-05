/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding;

/**
 *
 * @author GUERRA_CPE113
 */
import java.util.Scanner;
public class LiveCoding {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Pls input your prelim exam Score");
         double PrelimScore = input.nextDouble();
         
        System.out.println("Pls input your midterm exam Score");
        double MidtermScore = input.nextDouble();
         
        System.out.println("Pls input your final exam Score");
        double FinalsScore = input.nextDouble();
                
        double average = gradescore(PrelimScore,MidtermScore,FinalsScore);
        
        char grade = averagescore(average);

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        input.close();
        
    }public static double gradescore (double PrelimScore,double MidtermScore,double FinalsScore){
        return(PrelimScore+MidtermScore+FinalsScore)/3;
     
    }public static char averagescore(double average){
            if (average >= 90){
        return 'A';
     }else if  (average >= 85){
        return 'B';   
     }else if  (average >= 80){
        return 'C';   
     }else if  (average >= 75){
        return 'D';            
     }else{
        return'F';
     } 
    }
}
