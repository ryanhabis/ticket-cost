package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int drogheda = 10;
        int dublin = 15;
        int ticketCounter = 0;


        for(int i = 0; i<=2;i++) {
            System.out.printf("The cost of tickets will be listed below \n Dublin will cost €%d \t Drogheda will cost €%d \n", drogheda, dublin);

            System.out.println("How many Tickets do you want");
            int tickets = keyboard.nextInt();

            System.out.println("Where do you want to go ");
            String destination = keyboard.next();

            int totalCostDragheda = tickets * drogheda;
            int totalCostDublin = tickets * dublin;


            if (destination.equals("Drogheda") || destination.equals("drogheda")) {
                System.out.printf("You have selected %d tickets \n", tickets);

                System.out.println(" Here is your total: €" + totalCostDragheda);
                if (totalCostDragheda >= 100) {
                    double discount = totalCostDragheda - (0.10 * totalCostDragheda);

                    System.out.printf("Discount applied: €%.2f\n", discount);
                }
            } else if (destination.equals("Dublin") || destination.equals("dublin")) {
                System.out.printf("You have selected %d tickets \n", tickets);

                System.out.println(" Here is your total: €" + totalCostDublin);

                if (totalCostDublin >= 100) {
                    double discount = totalCostDublin - (0.10 * totalCostDublin);

                    System.out.printf("Discount applied: €%.2f \n", discount);
                }
            } else {
                System.out.println("Invalid Destination ");

            }

            ticketCounter = ticketCounter + tickets;

            System.out.printf("Total tickets sold %d \n",ticketCounter);

        }

    }
}
