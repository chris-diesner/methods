import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib die erste Zahl ein: ");
        int input1 = scanner.nextInt();
        System.out.println("Gib die zweite Zahl ein: ");
        int input2 = scanner.nextInt();
        System.out.println(doubleNumber(input1,input2));
        System.out.println(printNumbers(input1,input2));
        System.out.println("Ist eine der beiden Zahlen größer 100?:");
        System.out.println(compareNumbers(input1,input2));
    }

    public static int doubleNumber (int num1, int num2){
        return num1+num2;
    }

    public static String printNumbers(int num1, int num2){
        String output = "Die Nummern " + num1 + " und " + num2 + " wurden addiert.";
        return output;
    }

    public static boolean compareNumbers(int num1, int num2){
        if (num1 > 100 | num2 > 100){
            return true;
        } else return false;
    }

}
