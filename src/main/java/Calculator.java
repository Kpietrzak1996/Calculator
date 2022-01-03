import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result = 0;
        //powitanie
        //wyświetl menu z operacjami
        //podaj nr operacji
        //DODAWANIE: podaj liczbę

        System.out.println("Hello to Calculatorex");
        String userInput;
        do {
            System.out.println("Choose option number:\n" +
                    "1. Add\n" +
                    "2. Substract\n" +
                    "3. Multiply\n" +
                    "4. Divide\n" +
                    "5. Exit\n");

            userInput = scanner.nextLine();
            switch (userInput) {
                case "1": {
                    System.out.println(result);
                    System.out.println("Insert up to 10 numbers separated by spaces");
                    String userAnswear = scanner.nextLine();
                    double[] input = new double[10];

                    String[] split = userAnswear.split(" ");
                    for (int i = 0; i < split.length; i++) {
                        input[i] = Double.valueOf(split[i]);
                    }

                    for (int i = 0; i < input.length; i++) {
                        result += input[i];
                    }

                    System.out.println(result);
                    break;
                }
                case "2": {
                    System.out.println(result);
                    System.out.println("Insert up to 10 numbers separated by spaces");
                    String userAnswear = scanner.nextLine();
                    double[] input = new double[10];

                    String[] split = userAnswear.split(" ");
                    for (int i = 0; i < split.length; i++) {
                        input[i] = Double.valueOf(split[i]);
                    }

                    for (int i = 0; i < input.length; i++) {
                        if (input[i] < 0)
                            result += (-input[i]);
                        else
                            result -= input[i];
                    }

                    System.out.println(result);
                    break;
                }

                case "3": {
                    System.out.println(result);
                    System.out.println("Insert up to 10 numbers separated by spaces");
                    String userAnswear = scanner.nextLine();
                    double[] input = new double[10];

                    for (int i = 0; i < 10; i++) {
                        input[i] = 1.0;
                    }

                    String[] split = userAnswear.split(" ");

                    for (int i = 0; i < split.length; i++) {
                        input[i] = Double.valueOf(split[i]);
                    }


                    for (int i = 0; i < input.length; i++) {
                        result *= input[i];
                    }

                    System.out.println(result);
                    break;

                }

                case "4": {
                    System.out.println(result);
                    System.out.println("Insert up to 10 numbers separated by spaces");
                    String userAnswear = scanner.nextLine();
                    double[] input = new double[10];

                    for (int i = 0; i < 10; i++) {
                        input[i] = 1.0;
                    }

                    String[] split = userAnswear.split(" ");
                    for (int i = 0; i < split.length; i++) {
                        input[i] = Double.valueOf(split[i]);
                    }

                    for (int i = 0; i < input.length; i++) {
                        if (input[i] == 0) {
                            System.out.println("0 znajduje się w podanym ciągu, pomijam 0");
                        } else result /= input[i];
                    }

                    System.out.println(result);
                    break;
                }
                default: {
                    System.out.println("No such option, pleas choose again.");
                    break;
                }

            }

        } while (!userInput.equals("5"));
    }

}
// dopisać pozostałe CASE
// przenieśc logikę z CASE do metod
// wrzucić na git + github - tylko konsola