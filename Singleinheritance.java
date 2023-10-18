class Cat {
    int small(int a,int b){
        System.out.println("I am a cat");
        return a+b;
    }
}
class Tiger extends Cat{
    int  big(int a,int b,int c){
        System.out.println("I am a tiger");
        return a+b+c;
         }
    public static void main(String  [] args){
        Tiger ani = new Tiger();
        int v= ani.small(23,34 );
        int w=ani.big(12,22,56);
        System.out.println(v);
        System.out.println(w);
        
    }
}  
