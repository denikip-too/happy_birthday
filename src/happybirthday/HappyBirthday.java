
package happybirthday;

public class HappyBirthday {

    public static void main(String[] args) {
        printTo();
        printTo();
        PrintDear("Tom");
        printTo();
    }
    static void printTo()
         {
            System.out.println("Happy birthday to you");
        }
    static void printDear(String name)
        {
            System.out.println( "Happy birthday dear, " +name );
        }

    private static void PrintDear(String tom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
