
class marks
{
public static int fact(int n)
{
if(n==1){
return n;}
else
{
return n*fact(n-1);
}}
 public static void main(String[] args)
         {
           fact(4);
           System.out.println(fact(5));
            
          }}