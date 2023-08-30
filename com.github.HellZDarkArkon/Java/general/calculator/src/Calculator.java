package Java.general.calculator.src;

import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);
    private static boolean bRunning = true;
    public static boolean getRunning() {return bRunning;}
    public static void main(String[] args) {
        while(getRunning()) {
            System.out.print("Enter your data type (integer, float, double): ");
            String strType = sc.toString();
            double temp = 0;
            System.out.print("Enter your first number: ");
            double d1 = sc.nextDouble();
            System.out.print("Enter your operation: ");
            char op = sc.toString().charAt(0);
            System.out.print("Enter your second number: ");
            double d2 = sc.nextDouble();

            switch(op) {
                case '+':
                    switch(strType) {
                        case "integer":
                            temp = jMath.iAdd((int)d1, (int)d2);
                            break;
                        case "int":
                            temp = jMath.iAdd((int)d1, (int)d2);
                            break;
                        case "i":
                            temp = jMath.iAdd((int)d1, (int)d2);
                            break;
                        case "float":
                            temp = jMath.fAdd((float)d1, (float)d2);
                            break;
                        case "f":
                            temp = jMath.fAdd((float)d1, (float)d2);
                            break;
                        case "double":
                            temp = jMath.dAdd(d1, d2);
                            break;
                        case "d":
                            temp = jMath.dAdd(d1,d2);
                            break;
                        default:
                            temp = 0;
                            break;
                    }
                case '-':
                    switch(strType) {
                        case "integer":
                            temp = jMath.iSub((int)d1, (int)d2);
                            break;
                        case "int":
                            temp = jMath.iSub((int)d1, (int)d2);
                            break;
                        case "i":
                            temp = jMath.iSub((int)d1, (int)d2);
                            break;
                        case "float":
                            temp = jMath.fSub((float)d1, (float)d2);
                            break;
                        case "f":
                            temp = jMath.fSub((float)d1, (float)d2);
                            break;
                        case "double":
                            temp = jMath.dSub(d1, d2);
                            break;
                        case "d":
                            temp = jMath.dSub(d1, d2);
                            break;
                        default:
                            temp = 0;
                            break;
                    }
                case '*':
                    switch(strType) {
                        case "integer":
                            temp = jMath.iMul((int)d1, (int)d2);
                            break;
                        case "int":
                            temp = jMath.iMul((int)d1, (int)d2);
                            break;
                        case "i":
                            temp = jMath.iMul((int)d1, (int)d2);
                            break;
                        case "float":
                            temp = jMath.fMul((float)d1, (float)d2);
                            break;
                        case "f":
                            temp = jMath.fMul((float)d1, (float)d2);
                            break;
                        case "double":
                            temp = jMath.dMul(d1,d2);
                            break;
                        case "d":
                            temp = jMath.dMul(d1,d2);
                            break;
                        default:
                            temp = 0;
                            break;
                    }
                case '/':
                    switch(strType) {
                        case "integer":
                            temp = jMath.iDiv((int)d1, (int)d2);
                            break;
                        case "int":
                            temp = jMath.iDiv((int)d1, (int)d2);
                            break;
                        case "i":
                            temp = jMath.iDiv((int)d1, (int)d2);
                            break;
                        case "float":
                            temp = jMath.fDiv((float)d1, (float)d2);
                            break;
                        case "f":
                            temp = jMath.fDiv((float)d1, (float)d2);
                            break;
                        case "double":
                            temp = jMath.dDiv(d1, d2);
                            break;
                        case "d":
                            temp = jMath.dDiv(d1, d2);
                            break;
                        default:
                            temp = 0;
                            break;
                    }
                case '^':
                    switch(strType) {
                        case "integer":
                            temp = jMath.iExp((int)d1, (int)d2);
                            break;
                        case "int":
                            temp = jMath.iExp((int)d1, (int)d2);
                            break;
                        case "i":
                            temp = jMath.iExp((int)d1, (int)d2);
                            break;
                        case "float":
                            temp = jMath.fExp((float)d1, (int)d2);
                            break;
                        case "f":
                            temp = jMath.fExp((float)d1, (int)d2);
                            break;
                        case "double":
                            temp = jMath.dExp(d1, (int)d2);
                            break;
                        case "d":
                            temp = jMath.dExp(d1, (int)d2);
                            break;
                        default:
                            temp = 0;
                            break;
                    }
                case 'r':
                    switch(strType) {
                        case "integer":
                            temp = jMath.iRoot((int)d1, (int)d2);
                            break;
                        case "int":
                            temp = jMath.iRoot((int)d1, (int)d2);
                            break;
                        case "i":
                            temp = jMath.iRoot((int)d1, (int)d2);
                            break;
                        case "float":
                            temp = jMath.fRoot((float)d1, (int)d2);
                            break;
                        case "f":
                            temp = jMath.fRoot((float)d1, (int)d2);
                            break;
                        case "double":
                            temp = jMath.dRoot(d1, (int)d2);
                            break;
                        case "d":
                            temp = jMath.dRoot(d1, (int)d2);
                            break;
                        default:
                            temp = 0;
                            break;

                    }
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