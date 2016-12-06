class Automobile
{
	int numberOfWheels, gasolineTankCapacity; // declare fields

	// define a parameterized constructor
 	Automobile(String make, int yearOfManufacture)
    {
		System.out.println(make + " printed from the constructor");
		System.out.println(yearOfManufacture+ " printed from the constructor");
		numberOfWheels = 4;
		gasolineTankCapacity = 12;
 	}

	// define a method
 	void makeLoudHornSound()
 	{
		System.out.println("Honk!!!");
		// return not necessary for a void method
	}
}
class ClassMembersAutomobileDemo
{
    public static void main(String[] args)
    {
		// instantiate an object by calling the constructor
		Automobile myCar = new Automobile("Prius", 2017);
		// call a method on an object
		myCar.makeLoudHornSound();
		// pass a runtime argument to a method
		System.out.println("End of the application");
    }
}