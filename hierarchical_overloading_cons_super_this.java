class College{
    int a=20;
  
    void name(int a,int b){
    System.out.println("hi");
    System.out.println(a);
    System.out.println(this.a);
    System.out.println(a+b);
    }
}
class  Teacher extends College{
    int a=45;
    void name(int a,int b,int c){
    System.out.println("hello");
    System.out.println(a);
    System.out.println(this.a);
    System.out.println(a+b+c);
    System.out.println(super.a);
}
}
class Student extends College{
        int a=35;
    
        void name(int a,int b,int c){
        System.out.println("HI hello");
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(a+b+c);
        System.out.println(super.a);
        }
}

class Main{
    public static void main(String[] args) {
        Student stu=new Student();
        Teacher tea=new Teacher();
        stu.name(23,34,34);
        stu.name(28,34);
        tea.name(29,28,67);
        tea.name(24,34);
    }
}
