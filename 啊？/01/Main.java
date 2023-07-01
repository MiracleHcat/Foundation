<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 实例化两个不同的SaveAccount对象，saver1和saver2，分别有存款2000.00和3000.00元
        SaveAccount saver1 = new SaveAccount(2000.00);
        SaveAccount saver2 = new SaveAccount(3000.00);

        // 将Rate设置为4%
        SaveAccount.modifyRate(4);

        // 分别计算月息，并打印每个储户的新存款余额
        saver1.calculate();
        saver2.calculate();

        System.out.println("Saver1 new saving balance: " + saver1.getSaving());
        System.out.println("Saver2 new saving balance: " + saver2.getSaving());
    }
}
=======
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 实例化两个不同的SaveAccount对象，saver1和saver2，分别有存款2000.00和3000.00元
        SaveAccount saver1 = new SaveAccount(2000.00);
        SaveAccount saver2 = new SaveAccount(3000.00);

        // 将Rate设置为4%
        SaveAccount.modifyRate(4);

        // 分别计算月息，并打印每个储户的新存款余额
        saver1.calculate();
        saver2.calculate();

        System.out.println("Saver1 new saving balance: " + saver1.getSaving());
        System.out.println("Saver2 new saving balance: " + saver2.getSaving());
    }
}
>>>>>>> 0944a5e3ce61f69c9ec476ca1fd43328f2559bcd
