public class Student {
    public String sid;
    public String name;
    public String age;
    public String address;
    public Student(){}

    public Student(String sid, String name, String age, String address) {//alt+insert+constructor
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //alt+insert  getter+setter
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
