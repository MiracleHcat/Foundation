/*设计一个 Shape 及其子类 Oval
        编写一个完整的 Java Application 程序。包含类 Shape、类 Oval、类 ShapeTest，具体要求如
        下：
        (1)编写一个抽象类 Shape 表示形状对象，包含以下成员
        ①属性：
        PI：double 型常数，值为 3.1415926；
        ②方法：
        1. double area(),抽象方法；
        2. double perimeter()，抽象方法；
        (2)编写一个 Shape 类的子类 Oval，表示椭圆对象，包含以下成员
        ①属性：
        3.a：私有，double 型，长轴半径；
        4.b：私有，double 型，短轴半径；
        ②方法：
        5.Oval(double a，double b),构造方法,用参数设置椭圆的长轴半径和短轴半径
        6.Oval(),构造方法，将椭圆的长轴半径和短轴半径都初始化为 0。
        7. double area()，重写 Shape 类中的 area 方法，返回椭圆的面积()
        8. double perimeter()，重写 Shape 类中的 perimeter 方法，返回椭圆的周长()
        9.public String toString()，将把当前椭圆对象的转换成字符串形式，例如长轴半径为
        10.0，短轴半径为 5，返回字符串"Oval(a:10.0,b:5.0)"。
        （3）编写公共类 Main,实现如下功能
        10.输入长轴半径和短轴半径，并创建一个椭圆对象；
        11.分别用 area 和 perimeter 方法，求出以上椭圆的面积和宽度并输出，输出过程中要求使
        用到 toString 方法，输出格式如下：
        输入格式:
        输入长轴半径和短轴半径
        输出格式:
        输出椭圆的面积和周长。
        输入样例:
        8 6
        输出样例:
        在这里给出相应的输出。例如：
        The area of Oval(a:8.0,b:6.0)is 150.79644480000002
        The perimeterof Oval(a:8.0,b:6.0)is 44.42882862370954
        解析：周长公式选用 Shape.PI*2*Math.sqrt((a*a+b*b)/2)，按照题目中对属性和方法的要求，
        一步一步对应写每个部分；*/
import java.util.Scanner;

abstract class Shape {
    public static double PI = 3.1415926;

    public abstract double area();

    public abstract double perimeter();
}

class Oval extends Shape {
    private double a;
    private double b;

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Oval() {
        this.a = 0;
        this.b = 0;
    }

    @Override
    public double area() {
        return Shape.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Shape.PI * 2 * Math.sqrt((a * a + b * b) / 2);
    }

    public String toString() {
        String s = "Oval(a:" + this.a + ",b:" + this.b + ")";
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        Oval ov = new Oval(a, b);
        System.out.println("The area of " + ov.toString() + " is " + ov.area());
        System.out.println("The perimeterof " + ov.toString() + " is " + ov.perimeter());
    }
}
