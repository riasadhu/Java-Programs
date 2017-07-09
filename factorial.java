import  java.util.Scanner;
class marks
{



         public static void main(String[] args)
         {
            Scanner sc=new Scanner(System.in);
           int i,n,sum;
         n=sc.nextInt();
         sum=sc.nextInt();
           for(i=0;i<n;i++)
           {
            sum*=(n-i);
            }
            System.out.println("factorial of" +n);
            System.out.println(sum);
            }
}
            