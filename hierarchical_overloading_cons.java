class College{
    int a=20;
    void name(int a,int b){
    System.out.println(a+b);
    System.out.println("hi");
    }
}
class  Teacher extends College{
    void name(int a,int b){
    System.out.println(a+b);
    System.out.println("hello");
}
}
class Student extends College{
    int a=35;
        void name(int a,int b,int c){
        System.out.println(a+b);
        System.out.println("HI hello");
        }
}

class Main{
    public static void main(String[] args) {
        Student stu=new Student();
        Teacher tea=new Teacher();
        stu.name(23,34,34);
        stu.name(20,34);
        tea.name(29,28);
        tea.name(24,34);
    }
}
