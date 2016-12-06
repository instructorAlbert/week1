class HelloWorld
{
    static void showGreeting()
    {
       System.out.println("Hello World! printed from a static method");
    }
}
class HelloWorldDemoStaticVersion
{
    public static void main(String[] args)
    {
        //HelloWorld myHelloWorld = new HelloWorld();
        HelloWorld.showGreeting();
    }
}