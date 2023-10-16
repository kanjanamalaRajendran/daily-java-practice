class Animal{
    int a=20;
    Animal(){
        System.out.println("I am a animal");
    }
    Animal(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
class Dog extends Animal{
    int a=35;
    Dog(){
        System.out.println("Iam a Dog");
    }
    Dog(int a,int b,int c){
        super(a,b,c);
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(this.a);
        
    }
    public static void main(String[] args) {
        Dog dog=new Dog(6,32,13);
    }
}
