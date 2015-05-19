package fr.lecharpentier.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @Deprecated
    public void notToBeUsed() {
        System.out.println( "You shouldn't see that!" );
    }
}
