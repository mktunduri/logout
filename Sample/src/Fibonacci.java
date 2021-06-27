import java.util.*; 
public class Fibonacci{
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no.");
    int n= sc.nextInt(),a=1,b=0,c=0;
    num(n,a,b,c);
  }
  public static void num(int n,int a,int b,int c){
    if(a<=n){
      System.out.println(a);
      c=b;
      b=a;
      a=b+c;
      num(n,a,b,c);
    }
  }
}