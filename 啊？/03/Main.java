<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(3, 4);
        ComplexNumber b = new ComplexNumber(1, -2);

        // 复数加法
        System.out.println(a + " + " + b + " = " + a.add(b));

        // 复数减法
        System.out.println(a + " - " + b + " = " + a.subtract(b));

        // 复数乘法
        System.out.println(a + " * " + b + " = " + a.multiply(b));

        // 复数除法
        try {
            System.out.println(a + " / " + b + " = " + a.divide(b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // 复数的模
        System.out.println("|" + a + "| = " + a.modulus());
        System.out.println("|" + b + "| = " + b.modulus());

        // 比较两个复数的大小（按照模大小）
        if (a.compareTo(b) > 0) {
            System.out.println(a + " > " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a.toString() + " equals to " + b.toString());
        }
    }
}
=======
public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(3, 4);
        ComplexNumber b = new ComplexNumber(1, -2);

        // 复数加法
        System.out.println(a + " + " + b + " = " + a.add(b));

        // 复数减法
        System.out.println(a + " - " + b + " = " + a.subtract(b));

        // 复数乘法
        System.out.println(a + " * " + b + " = " + a.multiply(b));

        // 复数除法
        try {
            System.out.println(a + " / " + b + " = " + a.divide(b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // 复数的模
        System.out.println("|" + a + "| = " + a.modulus());
        System.out.println("|" + b + "| = " + b.modulus());

        // 比较两个复数的大小（按照模大小）
        if (a.compareTo(b) > 0) {
            System.out.println(a + " > " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a.toString() + " equals to " + b.toString());
        }
    }
}
>>>>>>> 0944a5e3ce61f69c9ec476ca1fd43328f2559bcd
