class Employees{
    int emp_age=26;
    int emp_salary = 50000;
    String name = "kana";
    void getAge(){
        System.out.println("employee age is:"+emp_age);
    }
    void getSalary(){
        System.out.println("employee salary is:"+emp_salary);
    }
    void getName(){
        System.out.println("employee name is:"+name);
    }
    public static void main(String[] args) {
        System.out.println("employee detail:");
      

        Employees obj = new Employees();
        obj.getAge();
        obj.getSalary();
        obj.getName();
       
    }
}
