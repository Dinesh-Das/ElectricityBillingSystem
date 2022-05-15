
import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Customer;

public class BillCalculator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        BillSummary billSummary = new BillSummary();
        try {

            System.out.println("Enter Customer Name: ");
            customer.setCustomerName(scanner.nextLine());
            System.out.println("Enter Customer Phone: ");
            customer.setCustomerPhone(scanner.nextLine());
            System.out.println("Enter Customer Address: ");
            customer.setCustomerAddress(scanner.nextLine());
            System.out.println();

            System.out.println("Usage Type:");
            System.out.println("1. Domestic");
            System.out.println("2.Commercial");
            customer.setCustomerId(scanner.nextInt());
            if (customer.getCustomerId() == 1) {

                System.out.println();
                TariffDetails.tariffDetails();
                System.out.println();

            } else if (customer.getCustomerId() == 2) {
                System.out.println();
                TariffDetails.tariffDetailsCommercial();
                System.out.println();
            }else{
                System.out.println("Invalid Option");
                System.out.println("Exiting.......");
                System.exit(0);
            }

            System.out.println("Enter the no. of units consumed :");
            customer.setUnitsConsumed(scanner.nextInt());
            customer.setTariffAmount(TariffDetails.tariffCalculation(customer.getUnitsConsumed(),customer.getCustomerId()));
            customer.setFixedCharge(TariffDetails.fixedCharge(customer.getUnitsConsumed(),customer.getCustomerId()));
            customer.setTotalAmount(customer.getFixedCharge() + customer.getTariffAmount());

            billSummary.billReport(customer);

        } catch (InputMismatchException e) {
            System.out.println("Integer Expected...! Please Try Again :)");
        }

        scanner.close();
    }

}