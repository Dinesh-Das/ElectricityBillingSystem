package Model;
public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private int unitsConsumed;
    private float tariffAmount;
    private float fixedCharge;
    private float totalAmount;

   public Customer() {

    }

    public Customer(int customerId, String customerName, String customerAddress, int unitsConsumed, float totalAmount,
            float tariffAmount, float fixedCharge,String customerPhone) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.tariffAmount = tariffAmount;
        this.fixedCharge = fixedCharge;
        this.customerPhone=customerPhone;

    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTariffAmount(float tariffAmount)
    {
        this.tariffAmount=tariffAmount;
    }
    public float getTariffAmount()
    {
        return tariffAmount;
    }
    public void setFixedCharge(float fixedCharge)
    {
        this.fixedCharge=fixedCharge;
    }
    public float getFixedCharge()
    {
        return fixedCharge;
    }

    public void setCustomerPhone(String customerPhone)
    {
        this.customerPhone=customerPhone;
    }
    public String getCustomerPhone()
    {
        return customerPhone;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%5s %10s %20s %5s %5s", customerId, customerName, customerAddress, unitsConsumed,
                totalAmount);
    }
}
