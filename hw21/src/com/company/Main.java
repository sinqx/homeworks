package com.company;

public class Main {

    public static void main(String[] args) {
	Credit first = new Credit(1,15000,"2 month",11.4);
	Credit second = new Credit(2,19900,"5 month, 5 days",14.0);
	Credit third = new Credit(3,5800,"21 days",5.4);
	Credit fourth = new Credit(4,31800,"1 year",15.0);
	Credit fifth = new Credit(5,9100,"1 month, 12 days" ,12.7);

        System.out.println(Credit.getAvg());
        System.out.println(Credit.getAllSum());
        System.out.println(Credit.getQuantity());

////////////////////////////////////////////////////////////////////////////////////
    Credit[] IvansCredits = new Credit[]{first,second,third,fourth,fifth};

    creditInfo(IvansCredits, IvansCredits.length-1, 0);
    }

    static void creditInfo(Credit[] IvanCr, int num, int sum){
        sum+=IvanCr[num].getSum();
        int quantity = IvanCr.length;

        if(num == 0) {
            System.out.print("Общая сумма кредитов: " + sum);
            System.out.print("\nКоличество кредитов: " + quantity);
            System.out.print("\nСредняя сумма кредитов: " + sum/quantity);
            return;
        }
        creditInfo(IvanCr, num-1, sum);
    }
}
