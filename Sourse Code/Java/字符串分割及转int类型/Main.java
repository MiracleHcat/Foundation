// 导入java.util包
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 创建Scanner对象，用于读取用户输入
        Scanner sc = new Scanner(System.in);
        // 读取整数n
        int n = sc.nextInt();
        // 读取字符串s
        String s = sc.next();
        // 调用splitString方法将字符串s按照长度为n进行分割，并将结果存储在result数组中
        String[] result = splitString(s, n);
        // 遍历result数组，输出每个子字符串
        int[] array=new int[result.length];
        for(int  i=0;i< result.length;i++){
            array[i]=Integer.parseInt(result[i]);
        }
        for(int  a:array){
            System.out.println(a);
        }
    }

    // 定义splitString方法，用于将字符串按照指定长度进行分割
    public static String[] splitString(String str, int n) {
        // 计算字符串的长度
        int len = str.length();
        // 计算需要分割成几个子字符串
        int size = (len + n - 1) / n;
        // 创建一个大小为size的字符串数组，用于存储分割后的子字符串
        String[] result = new String[size];
        // 循环遍历每个子字符串
        for (int i = 0; i < size; i++) {
            // 计算当前子字符串的起始位置和结束位置，并使用substring方法截取子字符串
            result[i] = str.substring(i * n, Math.min((i + 1) * n, len));
        }
        // 返回分割后的结果数组
        return result;
    }
}
