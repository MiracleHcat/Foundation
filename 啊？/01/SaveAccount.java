<<<<<<< HEAD
public class SaveAccount {
    private double saving;
    private static double rate = 0;

    public SaveAccount(double saving) {
        this.saving = saving;
    }

    public void calculate() {
        double month_interest = this.saving * rate / 12;
        this.saving += month_interest;
    }

    public static void modifyRate(double newRate) {
        rate = newRate / 100;
    }

    public double getSaving() {
        return saving;
    }
}
=======
public class SaveAccount {
    private double saving;
    private static double rate = 0;

    public SaveAccount(double saving) {
        this.saving = saving;
    }

    public void calculate() {
        double month_interest = this.saving * rate / 12;
        this.saving += month_interest;
    }

    public static void modifyRate(double newRate) {
        rate = newRate / 100;
    }

    public double getSaving() {
        return saving;
    }
}
>>>>>>> 0944a5e3ce61f69c9ec476ca1fd43328f2559bcd
