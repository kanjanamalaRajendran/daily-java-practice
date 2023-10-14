class Employee{
    int salary ;
    int age ;
    String name ;
    void setdetail(int salary,int age,String name){
        this.salary = salary;
        this.age = age;
        this.name = name;
    }
    void getdetail(){
        System.out.println(this.salary+" "+ this.age+" "+  this.name);
    }
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setdetail(20000,24,"kani");
        obj.getdetail();
        Employee obj1 = new Employee();
        obj1.setdetail(30000,52,"vani");
        obj1.getdetail();
    }
}
