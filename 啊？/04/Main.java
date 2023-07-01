<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static int countSubstring(String str, String subStr) {
        int count = 0;
        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            if (str.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String subStr =sc.nextLine();
        int count = countSubstring(str, subStr);
        System.out.println(subStr + " appears " + count + " times in " + str);
    }
}

=======
import java.util.Scanner;
public class Main {
    public static int countSubstring(String str, String subStr) {
        int count = 0;
        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            if (str.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String subStr =sc.nextLine();
        int count = countSubstring(str, subStr);
        System.out.println(subStr + " appears " + count + " times in " + str);
    }
}

>>>>>>> 0944a5e3ce61f69c9ec476ca1fd43328f2559bcd
