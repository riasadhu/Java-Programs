import java.util.Scanner;
class Abc
{

public void acceptanddisplay()
{
int a[][]=new int[2][3];
int b[][]=new int[2][3];
int sum[][]=new int[2][3];
Scanner sc=new Scanner(System.in);
 System.out.println("first matrix");
for(int i=0;i<2;i++)
  {
   for(int j=0;j<3;j++)
   {
a[i][j]=sc.nextInt();
   }
 }

 System.out.println("second matrix");
for(int i=0;i<2;i++)
 {
   for(int j=0;j<3;j++)
    {
    b[i][j]=sc.nextInt();
    }
 }
for(int i=0;i<2;i++)
  {
    for(int j=0;j<3;j++)
    {
     sum[i][j]=a[i][j]+b[i][j];
     System.out.print(sum[i][j]+" ");
   }
 System.out.println();
}
}
public static void main(String[] args)
{
Abc a1=new Abc();
a1.acceptanddisplay();
}}



