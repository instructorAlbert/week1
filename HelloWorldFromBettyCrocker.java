class BettyCrocker
{
    BettyCrocker()
    {
       System.out.println("Hello World! printed from the constructor");
    }
}
class HelloWorldFromBettyCrocker
{
    public static void main(String[] args)
    {
        // initialize; test; increment
        for(int i = 0; i < 16; i++)
        {
            BettyCrocker bc = new BettyCrocker();
            System.out.println("This is Betty Crocker number " + i);
            // increment occurs at this location
        }
    }
}