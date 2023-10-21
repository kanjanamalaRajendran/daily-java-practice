class ClassName{
   public static void main(String[] args) {
      student a1 = new student();
      teacher a2 = new teacher();
      clg a = new clg();
      a1.bark(2,3,4);
      a2.bark1(1,2,1);
      a1.bark2(1,2,3);
      a2.bark(3,4,5);
      
      }
  }
class clg{
    int x=100;
    void bark(int x, int y, int z){
       System.out.println("i am parent");
       System.out.println(this.x);
       System.out.println(x+y+z);
       
   }
 }
 class teacher extends clg{
      int x=50;
      void bark1(int x, int y, int z){
       System.out.println("i am  child");
       System.out.println(this.x);
       System.out.println(super.x);  
      }
 }
class student extends clg{
      int x=60;
      void bark2(int x, int y, int z){
       System.out.println("i am  child1");
       System.out.println(this.x);
       System.out.println(super.x);
       System.out.println(x+y+z); 
   }
       }

