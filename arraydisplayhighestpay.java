package arraydisplayhighestpay;

public class a
{
	public static void main(String args[])
	{
	int salary[]={50000,40000,60000,51000,42000};
	String name[]={"tim","kim","jim","kim","dim"};
	String temp="";
	int min=0;
	for(int i=0;i<salary.length;i++)
	{
		if(salary[i]<min)
		
		{
			min=salary[i];
			temp=name[i];
			
			
			
		}
		
	 
	}
	System.out.print(min);
	System.out.print(temp);
	
	
	
	
}
}
