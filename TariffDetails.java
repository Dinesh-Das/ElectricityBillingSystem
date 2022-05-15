
public class TariffDetails {

    public static float tariffCalculation(int units,int id) {
        float amount = 0f;
        if(id==1)
        {
            if (units > 0 && units <= 100) {
                amount = units * 1.50f;
            } else if (units > 100 && units <= 200) {
                amount = units * 3.50f;
            } else if (units > 200 && units <= 500) {
                amount = units * 4.60f;
            } else if (units > 500) {
                amount = units * 6.60f;
            }
        }else if(id==2)
        {
            if (units > 0 && units <= 100) {
                amount = units * 7.50f;
            } else if (units > 100 && units <= 200) {
                amount = units * 8.50f;
            } else if (units > 200 && units <= 500) {
                amount = units * 9.60f;
            } else if (units > 500) {
                amount = units * 10.60f;
            }
        }
        return amount;
    }

    public static void tariffDetails() {
        System.out.println("Domestic Tariff Range:");
        System.out.println(String.format("%5s %15s %15s %25s", "", "Units", "Price (INR)", "Fixed Charges(INR)"));
        System.out.println(String.format("%5s %15s %15s %15s", "", "0-100", "1.50", "0"));
        System.out.println(String.format("%5s %15s %15s %15s", "", "101-200", "3.50", "20"));
        System.out.println(String.format("%5s %15s %15s %15s", "", "201-500", "4.60", "30"));
        System.out.println(String.format("%5s %15s %15s %15s", "", ">500", "6.60", "50"));
    }

    public static int fixedCharge(int units,int id) {
        int fixedCharge = 0;
        if(id==1)
        {
            if (units >= 0 && units < 100) {
                fixedCharge = 0;
            } else if (units > 100 && units <= 200) {
                fixedCharge = 20;
            } else if (units > 200 && units <= 500) {
                fixedCharge = 30;
            } else if (units > 500) {
                fixedCharge = 50;
            }
        }else if(id==2){
            if (units >= 0 && units < 100) {
                fixedCharge = 50;
            } else if (units > 100 && units <= 200) {
                fixedCharge = 100;
            } else if (units > 200 && units <= 500) {
                fixedCharge = 150;
            } else if (units > 500) {
                fixedCharge = 200;
            }
        }
        return fixedCharge;

    }

    public static void tariffDetailsCommercial() {
        System.out.println("Domestic Tariff Range:");
        System.out.println(String.format("%5s %15s %15s %25s", "", "Units", "Price (INR)", "Fixed Charges(INR)"));
        System.out.println(String.format("%5s %15s %15s %15s", "", "0-100", "7.50", "50"));
        System.out.println(String.format("%5s %15s %15s %15s", "", "101-200", "8.50", "100"));
        System.out.println(String.format("%5s %15s %15s %15s", "", "201-500", "9.60", "150"));
        System.out.println(String.format("%5s %15s %15s %15s", "", ">500", "10.60", "200"));
    }
}
