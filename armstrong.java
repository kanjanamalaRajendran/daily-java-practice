class armstrong{
 public static void main(String[] args){
   int num = 370;
   int temp = num;
   int r,sum = 0;
   if(num>0)
   {
    r=num%10;
    num = num/10;
    sum = sum+r*r*r;
   }
   if(temp == sum)
   {
     System.out.println("it's an armstrong number");
   }
   else
   {
    System.out.println("not an armstrong number");
   }
}
}
