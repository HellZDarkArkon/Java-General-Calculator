package Java.general.calculator.src;

import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);
    private static boolean bRunning = true;
    public static boolean getRunning() {return bRunning;}
    public static void main(String[] args) {
        while(getRunning()) {
            System.out.print("Enter your first number: ");
            float fNum1 = sc.nextFloat();
            System.out.print("Enter your operation: ");
            String cOp = sc.next();
            System.out.print("Enter your second number: ");
            float fNum2 = sc.nextFloat();
            float temp = 0.0f;
            switch(cOp) {
                case "+":
                    temp = jMath.fAdd(fNum1,fNum2);
                    break;
                case "-":
                    temp = jMath.fSub(fNum1, fNum2);
                    break;
                case "*":
                    temp = jMath.fMul(fNum1, fNum2);
                    break;
                case "/":
                    temp = jMath.fDiv(fNum1, fNum2);
                    break;
                case "^":
                    temp = jMath.fExp(fNum1, (int)fNum2);
                    break;
                case "rt":
                    temp = jMath.fRoot(fNum1, (int)fNum2);
                    break;
                default:
                    break;
            }

            System.out.println("The answer is: " + temp);

            System.out.print("Do you want to continue: Y/N");
            bSetRunning(sc.nextBoolean());

        }
    }

    public static void bSetRunning(boolean b) {
        bRunning = b;
    }
}