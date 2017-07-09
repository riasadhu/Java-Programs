class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
     int x=i;  
   int y=n;  
     int z =s;  
    
System.out.println(x+" "+y+" "+z);
}  


public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    e1.insert(101,"ajeet",45000.000f);  
    e2.insert(102,"irfan",25000.000f);  
    e3.insert(103,"nakul",55000.000f);  
   
}}