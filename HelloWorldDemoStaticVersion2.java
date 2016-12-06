class HelloWorld
{
    // field OF the class, not ON a object
    static String myString = "Hello World! printed from a static method";
    // method OF the class, not ON an object
    static String showGreeting()
    {
       return myString; // must return a String
    }
    static String showFarewell()
    {
       return "Goodbye"; // String literal
    }
}
class HelloWorldDemoStaticVersion2
{
    public static void main(String[] args)
    {
        // method call assigns a value to a variable
        String returnedString = HelloWorld.showGreeting();
        System.out.println(returnedString); // runtime argument
 
        // method call as runtime argument without a variable
         System.out.println(HelloWorld.showFarewell());
    }
}