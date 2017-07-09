import java.util.*;
import java.util.ArrayList;


public class arraylistString {

	public static void main(String[] args) {
		ArrayList<String>employeename=new ArrayList<String>();//creating ArrayList
		employeename.add("ram"); //0 index 
		//adding elements of type string in the dynamic
	//array
		employeename.add("sham");//1 index
		employeename.add("tam");//2 index
		employeename.add("zam");//3 index
		employeename.add("kam");//4 index
		System.out.println("enter all the objects in the dynamic arrayemployeename");
		
		for(String i:employeename)
		{
			System.out.println(i);
			
		}
		
		employeename.remove("kam");
		employeename.add(2, "rum");
		employeename.add("tim");
		System.out.println("removing  object kam in the dynamic arrayemployeename");
		for(String i:employeename)
		{
			System.out.println(i);
			
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
