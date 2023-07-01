import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n", s1,x);
                // 格式化输出字符串和整数，其中%-15s表示左对齐且占15个字符宽度，%03d表示右对齐且占3个字符宽度，不足用0填充
            }
            System.out.println("================================");

    }
}
