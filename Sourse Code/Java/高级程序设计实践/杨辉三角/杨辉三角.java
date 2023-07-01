/*输出格式:
每个数字占据 4 个字符的位置，数字左对齐，数字不足 4 位的右边留出空格。
解析：根据杨辉三角的特点，对首列和对角线遍历赋值为 1，再处理第 n 行和第 n+1 行的关
系，最后将数组遍历输出。本题考查二维数组的使用。*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ans = new int[100][100];
        for (int i = 1; i <= n; i++) {
            ans[i][i] = ans[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", ans[i][j]);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
