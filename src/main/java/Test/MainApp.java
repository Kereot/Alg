package Test;

public class MainApp {
    public static void main(String[] args) {

        float x = 5f;
        System.out.println(taskOne(x, 6));
        System.out.println(taskOne(x, 0));
        System.out.println(taskOne(x, -6));
        System.out.println(taskTwo(x, 6));
        System.out.println(taskTwo(x, -6));

        System.out.println(taskThree(0, 99));


    }

    public static float taskOne(float base, int exponent) {
        float result = 1;
        if (exponent == 0) {
            return result;
        } else if (exponent > 0) {
            for (int i = exponent; i > 0; i--) {
                result *= base;
            }
            return result;
        } else {
            for (int i = exponent; i < 0; i++) {
                result *= base;
            }
            result = 1 / result;
            return result;
        }
    }

    public static float taskTwo(float base, int exponent) {
        float result = 1;
        if (exponent != 0) {
            if (exponent % 2 == 0) {
                base *= base;
                exponent /= 2;
            }
            if (exponent > 0) {
                for (int i = exponent; i > 0; i--) {
                    result *= base;
                }
            } else {
                for (int i = exponent; i < 0; i++) {
                    result *= base;
                }
                result = 1 / result;
            }
        }
        return result;
    }

    public static int taskThree(int start, int end) {
//        if (start > end) {
//            int oldStart = start;
//            start = end;
//            end = oldStart;
//        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
