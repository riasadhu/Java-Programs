public class Dog
{
	// Class Variables
	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of Class
	public Dog(String name, String breed,
				int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// method 1
	public String getName()
	{
		return name;
	}

	// method 2
	public String getBreed()
	{
		return breed;
	}

	// method 3
	public int getAge()
	{
		return age;
	}

	// method 4
	public String getColor()
	{
		return color;
	}

	@Override
	public String toString()
	{
	    Dog tuffy=new Dog();
		return("Hi my name is "+ tuffy.getName()+
			".\nMy breed,age and color are " +
			tuffy.getBreed()+"," + tuffy.getAge()+
			","+ tuffy.getColor());
	}

	public static void main(String[] args)
	{
		Dog tuffy = new Dog("tuffy","papillon", 5, "white");
		System.out.println(tuffy.toString());
	}
}
