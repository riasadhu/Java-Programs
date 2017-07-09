import java.util.Scanner;
class A
{
int num1,num2,result;
public void add(int r,int p)
{
num1=r;
num2=p;
result=r+y;
System.out.printin("addition" +result)
}
public void sub(int r,int p)
{
num1=r;
num2=p;
result=r-y;
System.out.printin("subtraction of 2 nos" +result)
}
public void mult(int r,int p)
{
num1=r;
num2=p;
result=r*y;
System.out.printin("multiplication of 2 nos" +result)
}
public void div(int r,int p)
{
num1=r;
num2=p;
result=(float)r/y;
System.out.printin("division of 2 nos" +result)
}
public void percent(int r,int p)
{
num1=r;
num2=p;
result=((r+y)/200*100);
System.out.printin("percentage% of 2 nos" +result)
}
public static void main(String[] args)
{
int num1,num2;
Scanner sc=sc.Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
A a1=new A();
int choice=sc.nextInt();
System.out.printin("if choice is 1:addition");
System.out.printin("if choice is 2:subtraction");
System.out.printin("if choice is 3:multiplication");
System.out.printin("if choice is 4:division");

System.out.printin("if choice is 5:percentage%");
System.out.printin("if choice is 6:exit"):
switch(choice)
{
case1:

a1.add(num1,num2);
break;
case2:
a1.sub(num1,num2);
break;
case3
a1.mult(num1,num2);
break;
case4:
a1.div(num1,num2);
case5:
a1.percent(num1,num2);
case6:
a1.exit(0);
}}}




