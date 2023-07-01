import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        System.out.println("--------欢迎来到学生管理菜单--------");
        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入:");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudents(array);
                    break;
                case "5":
                    System.out.println("滚吧");
                    //break;
                    //System.exit(0);//JVM退出
                    return;
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生住址:");
        String address = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功!");
    }

    public static void findAllStudents(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息");
            return;//return不再往下执行
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t住址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入要删除的学生学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        for (int i = 0; i < array.size()+1; i++) {
            i=0;
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
            else {
                System.out.println("不存在的学号，重新输入");
                sid = sc.nextLine();
            }
        }
        System.out.println("删除成功");
    }

    public static void updateStudent(ArrayList<Student> array) {
        System.out.println("请输入要修改的学生学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        Student s = new Student();
        for (int i = 0; i < array.size()+1; i++) {
            s = array.get(i);
            if (s.getSid().equals(sid)) {
                s = array.get(i);
                break;
            } else {
                System.out.println("学号不存在,1.重新输入 2.退出");
                String a= sc.nextLine();
                switch (a){
                    case "1":
                        System.out.println("要查找的学号为");
                        sid = sc.nextLine();
                        i=-1;
                    default:break;//第100行的i=0放在这switch语句里为什么不行
                }
            }
        }
        boolean s1 = true;
        while (s1) {
            System.out.println("请选择要修改的信息：1.姓名 2.年龄 3.住址 4.退出修改");
            String line =sc.nextLine();
            if (line.equals("4"))
                s1 = false;
            else {
                switch (line) {
                    case "1":
                        System.out.println("姓名修改为");
                        String name = sc.nextLine();
                        s.setName(name);
                        break;
                    case "2":
                        System.out.println("年龄修改为");
                        String age = sc.nextLine();
                        s.setName(age);
                        break;
                    case "3":
                        System.out.println("住址修改为");
                        String address = sc.nextLine();
                        s.setName(address);
                        break;
                }
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (s.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }
        System.out.println("修改成功!");
    }

}