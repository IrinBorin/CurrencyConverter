import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        System.out.println(" ");
        System.out.println("Выберите исходную валюту:\n");
        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. TL");

        double rubToEuros = 0.0099;
        double rubToUSD = 0.011;
        double rubToTL = 0.35;

        Scanner scanner = new Scanner(System.in);
        int currency = scanner.nextInt();
        System.out.println( "Сколько рублей Вы хотите получить?");
        int amount = scanner.nextInt();


        if(currency == 1){
            double result = rubToEuros * amount;
            System.out.println( "Дайте, пожалуйста,  " + result + " Евро.");
        }
        if(currency == 2){
            double result = rubToUSD * amount;
            System.out.println("Дайте, пожалуйста,  " + result + " Долларов.");
        }
        if(currency == 3){
            double result = rubToTL * amount;
            System.out.println("Дайте, пожалуйста,  " + result + " турецких лир.");
        }

        //System.out.println(greetings + str + end);
    }
}