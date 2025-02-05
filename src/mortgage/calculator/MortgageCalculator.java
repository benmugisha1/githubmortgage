package mortgage.calculator;
import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator { 
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT= 100;
        int principal;
        float monthlyInterest;
        int numberOfPayments;
        double mortgage;
        Scanner scanner=new Scanner(System.in);
        while(true){
        System.out.print("Principal:");
        principal=scanner.nextInt();
        if (principal>=1000&&principal<=1000000){
            break;
        }
        System.out.print("Enter a value between 1000 and 1Million");   
        
        }
        while(true){
        System.out.print("Annual Interest Rate:");
        float annualInterest=scanner.nextFloat();
        if(annualInterest>=1&& annualInterest<=30){
            monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEAR;
            break;
        }
        System.out.print("Enter a value between 1 and 30");
        }
        while(true){
        System.out.print("Period of Years: ");
        byte years=scanner.nextByte();
        if(years>=1&&years<=30){
             numberOfPayments= years*MONTHS_IN_YEAR;
             break;
        }
        System.out.println("Enter a value between 1 and 30.");            
        }
       
        
        mortgage=principal*((monthlyInterest *(Math.pow(1+ monthlyInterest,numberOfPayments))/(Math.pow(1+monthlyInterest,numberOfPayments)-1)));
        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage "+mortgageFormatted);
    }

}
