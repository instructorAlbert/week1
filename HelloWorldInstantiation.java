/*
  This example creates an object, then calls a method on that object.
  Usage: java HelloWorldInstantiation 3
  Output: Hello World!
          3
*/
class HelloWorldInstantiation
{ // single-line comment
  void printGreeting()
  {
     System.out.println("Hello World!");
  }
  // we could define any number of other methods to add more behavior
  public static void main(String[] args) // command-line arguments
  {
    // instantiate an object from this static context
    // by calling the HelloWorldInstantiation() constructor
    HelloWorldInstantiation myObject = new HelloWorldInstantiation();
    // call a method on an object
    myObject.printGreeting();
    /* The System.out property is static, so we do not call any constructor.
     Instead we call the println method, that prints to screen and then prints a blank line
     */
    System.out.println(args.length);
    System.out.println(args[0]); // runtime Exception if args is empty
    /* args is a static array that is NOT bound to an instance of the class,
       so the following does not compile
       // String myVariable = myObject.args[0];
       //System.out.println(myVariable);
    */
  }
}