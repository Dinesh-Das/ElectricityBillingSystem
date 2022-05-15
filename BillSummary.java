import Model.Customer;

public class BillSummary {
    public void billReport(Customer customer) {
        String dash = "-----------------------------------------------------------------------";
        System.out.println(dash);
        System.out.println("\t\t\tTamilNadu Electricity Board");
        System.out.println("\t\t\t\tBill Summary");
        System.out.println();
        System.out.println(dash);
        System.out.println("Name :" + customer.getCustomerName() + "\t\t\t\t\tPhone :" + customer.getCustomerPhone());
        System.out.println();
        System.out.println("Address :" + customer.getCustomerAddress());
        System.out.println(dash);
        System.out.println("Unit Consumed :" + customer.getUnitsConsumed());
        System.out.println("Tariff Amount :" + customer.getTariffAmount());
        System.out.println("Fixed Charge :" + customer.getFixedCharge());
        System.out.println("Amount to Pay :" + customer.getTotalAmount());
        System.out.println(dash);
    }
}
