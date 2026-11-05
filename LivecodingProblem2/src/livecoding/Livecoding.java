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
public class Livecoding {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your electricity consumption (kWh):");
        double Consumption = input.nextDouble();

        System.out.println("Please input the rate per kWh:");
        double Rate = input.nextDouble();

        System.out.println("Please input the additional charge percentage:");
        double Percentage = input.nextDouble();

        double ConsumptionCharge = calculateConsumptionCharge(Consumption, Rate);

        double AdditionalCharge = calculateAdditionalCharge(ConsumptionCharge, Percentage);

        double TotalBill = calculateTotalBill(ConsumptionCharge, AdditionalCharge);

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.printf("Consumption Charge: %.2f%n", ConsumptionCharge);
        System.out.printf("Additional Charge: %.2f%n", AdditionalCharge);
        System.out.printf("Total Electricity Bill: %.2f%n", TotalBill);

        input.close();
    }public static double calculateConsumptionCharge(double Consumption, double Rate) {
        return Consumption * Rate;
        
    }public static double calculateAdditionalCharge(double ConsumptionCharge, double Percentage) {
        return ConsumptionCharge * (Percentage / 100);
        
    }public static double calculateTotalBill(double ConsumptionCharge, double AdditionalCharge) {
        return ConsumptionCharge + AdditionalCharge;
    }
}