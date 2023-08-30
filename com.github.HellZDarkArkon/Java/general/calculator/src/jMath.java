package Java.general.calculator.src;

public class jMath {
    public jMath() {

    }

    public static int iAdd(int a, int b) {
        return a + b;
    }
    public static float fAdd(float a, float b) {
        return a + b;
    }
    public static double dAdd(double a, double b) {
        return a + b;
    }

    public static int iSub(int a, int b) {
        return a - b;
    }
    public static float fSub(float a, float b) {
        return a - b;
    }
    public static double dSub(double a, double b) {
        return a - b;
    }
    public static int iMul(int a, int b) {
        return a * b;
    }
    public static float fMul(float a, float b) {
        return a * b;    }
    public static double dMul(double a, double b) {
        return a * b;
    }
    public static int iDiv(int a, int b) {
        return a / b;
    }
    public static float fDiv(float a, float b) {
        return a/ b;
    }
    public static double dDiv(double a, double b) {
        return a / b;
    }

    public static int iExp(int a, int b) {
        int x = a;
        for(int i = 0; i < b; i++) {
            x *= a;
        }
        return x;
    }

    public static float fExp(float a, int b) {
        float x = a;
        for(int i = 0; i < b; i++) {
            x *= a;
        }
        return x;
    }

    public static double dExp(double a, int b) {
        double x = a;
        for(int i = 0; i < b; i++) {
            x *= a;
        }
        return x;
    }

    public static int iAbs(int a) {
        int x = a;
        if(x < 0) {
            x *= -1;
        } else {
            x *= 1;
        }
        return x;
    }

    public static float fAbs(float a) {
        float x = a;
        if(x < 0) {
            x *= -1;
        }else {
            x *= 1;
        }
        return x;
    }

    public static double dAbs(double a) {
        double x = a;
        if(x < 0) {
            x *= -1;
        } else {
            x *= 1;
        }
        return x;
    }

    public static int iRoot(int a, int b) {
        int x = a;
        while(iExp(x,b) != a) {
            if(iExp(x,b) < a) {
                b += 1;
            } else if (iExp(x, b) > a) {
                b -= 1;
            }
        }
        if(iExp(x,b) == a) {
            return x;
        }
        return 0;
    }

    public static float fRoot(float a, int b) {
        float x = a;
        float epsilon = 0.0001f;

        while(fAbs(fExp(x,b) - a) > epsilon) {
            x -= (fExp(x,b) - a) / (b * fExp(x,b - 1));
        }
        return x;
    }

    public static double dRoot(double a, int b) {
        double epsilon = 0.0001;
        double x = a;
        while(dExp(x,b) > a) {
            x -= (dExp(x,b) - a) / (b * dExp(x,b - 1));
        }
        return x;
    }

}