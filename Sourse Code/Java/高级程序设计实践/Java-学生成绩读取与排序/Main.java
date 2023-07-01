/*输入样例:
        小明,2001,Java,88
        小刚,2002,Java,78
        小丁,2003,Java,56
        小宏,2004,Java,85
        小明,2001,Python,84
        小刚,2002,Python,98
        小丁,2003,JavaWeb,66
        小宏,2004,Algorithm,87
        exit
        输出样例:
        No1:2002,小刚
        No2:2001,小明
        No3:2004,小宏
        No4:2003,小丁
        解析：排序是一个很经典的算法问题，常见的排序方法有:冒泡排序、快速排序、选择排序、插入排序、
        希尔排序，甚至还有基数排序、鸡尾酒排序、桶排序、鸽巢排序、归并排序等。感兴趣的同学可以多做
        了解。Java API 中提供了一些排序方法，部分如下：
        1.基本数组，直接通过 Arrays.sort 工具类
        2.对象数组，通过实现 Comparable 接口来排序
        3.list 排序，简单的 Integer 类型，直接用 Colletions 工具类
        4.set 排序。HashSet 存储无序,离散,所以无法直接排序,只能间接排序. 比如转成 List、TreeSet 进行排序
        5.map 排序……
        大家平时可以多多阅读 API 文档，登录网页 Oracle Help Center，通过 Search 找到 JDK 的 API 文档。
        参考代码：*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Student implements Comparable<Student>{
    String name;
    String id;
    String course;
    int score;
    int num=1;
    public Student(String a,String b,String c,int d) {
        name=a;
        id = b;
        course = c;
        score = d;
    }
    public void getSum(int s) {
        num++;
        this.score+=s;
    }
    public double getScore() {
        return score/num;
    }
    public int compareTo(Student o) {
        if(this.getScore()==o.getScore())
            return id.compareTo(o.id);
        else return (int)(o.getScore()-getScore());
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        while(sc.hasNext()) {
            String line = sc.next();
            if(line.equals("exit"))
                break;
            String []stu = line.split(",");
            int flag=0;
            for(int i=0;i<list.size();i++) {
                if(list.get(i).id.compareTo(stu[1])==0) {
                    list.get(i).getSum(Integer.parseInt(stu[3]));
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                Student a = new
                        Student(stu[0],stu[1],stu[2],Integer.parseInt(stu[3]));
                list.add(a);
            }
        }
        for(int i=0;i<list.size();i++) {
            list.get(i).getScore();
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++) {
            System.out.println("No"+(i+1)+":"+list.get(i).id+","+list.get(i)
                    .name);
        }
    }
}
