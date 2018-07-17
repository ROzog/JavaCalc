package Calculator;
import java.util.Scanner;

public class MainCalculator{
    public static void main(String[] args) {

        String chosenOption;
        Calculations calculator = new Calculations();
        CalculatorMenu menu = new CalculatorMenu();
        Scanner scanner = new Scanner(System.in);

        do{
            menu.showCalculatorMenu();  //menu obiekt utowrzona powyzej .metoda utworzona w clasie CalculatorMenu
            chosenOption = scanner.nextLine();

            switch (chosenOption){
                case "exit":{
                    break;
                }
                case "1": {
                    calculator.multiply();
                    break;
                }
                case "2":{
                    calculator.divide();
                    break;
                }
                case "3":{
                    calculator.involution();
                    break;
                }
                case "4":{
                    calculator.nth();
                    break;
                }
                case "5":{
                    calculator.decToBinary();
                    break;
                }
                case "6":{
                    calculator.binaryToDecimal();
                    break;
                }
                case "7":{
                    calculator.gcd();
                    break;
                }
                case "8":{
                    calculator.average();
                    break;
                }
                case "9":{
                    calculator.setOfNumbersWithoutNumber();
                    break;
                }
            }
        }while (!chosenOption.equals("exit"));
    }
}
