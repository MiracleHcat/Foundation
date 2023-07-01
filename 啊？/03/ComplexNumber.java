<<<<<<< HEAD
public class ComplexNumber implements Comparable<ComplexNumber> {
    private double realPart; // 实部
    private double imaginaryPart; // 虚部

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // 重写toString方法，输出格式为“a+bi”
    @Override
    public String toString() {
        if (imaginaryPart > 0) {
            return realPart + "+" + imaginaryPart + "i";
        } else if (imaginaryPart < 0) {
            return realPart + "-" + (-imaginaryPart) + "i";
        } else {
            return realPart + "";
        }
    }

    // 复数加法
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(realPart + other.realPart, imaginaryPart + other.imaginaryPart);
    }

    // 复数减法
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(realPart - other.realPart, imaginaryPart - other.imaginaryPart);
    }

    // 复数乘法
    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(realPart * other.realPart - imaginaryPart * other.imaginaryPart,
                realPart * other.imaginaryPart + imaginaryPart * other.realPart);
    }

    // 复数除法
    public ComplexNumber divide(ComplexNumber other) throws ArithmeticException {
        double denominator = Math.pow(other.realPart, 2) + Math.pow(other.imaginaryPart, 2);

        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero");
        }

        double numerator1 = realPart * other.realPart + imaginaryPart * other.imaginaryPart;
        double numerator2 = imaginaryPart * other.realPart - realPart * other.imaginaryPart;

        return new ComplexNumber(numerator1 / denominator, numerator2 / denominator);
    }

    // 复数的模
    public double modulus() {
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ComplexNumber other = (ComplexNumber) obj;
        return Double.compare(this.realPart, other.realPart) == 0
                && Double.compare(this.imaginaryPart, other.imaginaryPart) == 0;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        if (this.modulus() > other.modulus()) {
            return 1;
        } else if (this.modulus() < other.modulus()) {
            return -1;
        } else {
            return 0;
        }
    }
}
=======
public class ComplexNumber implements Comparable<ComplexNumber> {
    private double realPart; // 实部
    private double imaginaryPart; // 虚部

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // 重写toString方法，输出格式为“a+bi”
    @Override
    public String toString() {
        if (imaginaryPart > 0) {
            return realPart + "+" + imaginaryPart + "i";
        } else if (imaginaryPart < 0) {
            return realPart + "-" + (-imaginaryPart) + "i";
        } else {
            return realPart + "";
        }
    }

    // 复数加法
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(realPart + other.realPart, imaginaryPart + other.imaginaryPart);
    }

    // 复数减法
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(realPart - other.realPart, imaginaryPart - other.imaginaryPart);
    }

    // 复数乘法
    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(realPart * other.realPart - imaginaryPart * other.imaginaryPart,
                realPart * other.imaginaryPart + imaginaryPart * other.realPart);
    }

    // 复数除法
    public ComplexNumber divide(ComplexNumber other) throws ArithmeticException {
        double denominator = Math.pow(other.realPart, 2) + Math.pow(other.imaginaryPart, 2);

        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero");
        }

        double numerator1 = realPart * other.realPart + imaginaryPart * other.imaginaryPart;
        double numerator2 = imaginaryPart * other.realPart - realPart * other.imaginaryPart;

        return new ComplexNumber(numerator1 / denominator, numerator2 / denominator);
    }

    // 复数的模
    public double modulus() {
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ComplexNumber other = (ComplexNumber) obj;
        return Double.compare(this.realPart, other.realPart) == 0
                && Double.compare(this.imaginaryPart, other.imaginaryPart) == 0;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        if (this.modulus() > other.modulus()) {
            return 1;
        } else if (this.modulus() < other.modulus()) {
            return -1;
        } else {
            return 0;
        }
    }
}
>>>>>>> 0944a5e3ce61f69c9ec476ca1fd43328f2559bcd
