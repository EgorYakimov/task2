
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int openingBalance = 100;
        int replenishment = 700; //здесь можно менять значение
        int sumTotal = 0;
        int bonus = 0;
        if (replenishment > 1000) {
            sumTotal = ((openingBalance + replenishment) / 100 + (openingBalance + replenishment));
            bonus = (openingBalance + replenishment) / 100;
        }
        System.out.printf("Баланс Вашего счёта " + (openingBalance + replenishment + bonus) + " руб.");
        System.out.println("");
        System.out.printf("Ваш бонус " + bonus + " руб.");
    }
}