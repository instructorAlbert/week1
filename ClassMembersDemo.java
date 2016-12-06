class Calculator
{
	int field1, field2; // declare fields

	// define a parameterized constructor
 	Calculator(int firstNumber, int secondNumber)
    {
		System.out.println(firstNumber + " printed from the constructor");
		System.out.println(secondNumber+ " printed from the constructor");
		field1 = firstNumber;
		field2 = secondNumber;
 	}

	// define a method
 	int addFieldValues()
 	{
		System.out.println("This method adds the field values.");
		return (field1 + field2);
	}
}
class ClassMembersDemo
{
    public static void main(String[] args)
    {
		// instantiate an object by calling the constructor
		Calculator myCalculator = new Calculator(17, 10);
		// call a method on an object
		int mySum = myCalculator.addFieldValues();
		// pass a runtime argument to a method
		System.out.println(mySum);
    }
}