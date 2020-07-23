package recap.java.basics;


/** A simple enum example where enum is declared
 outside any class (Note enum keyword instead of
 class keyword) **/
enum Cars
{
    BMW, Mercedes, Audi, Dacia, Lamborghini;
}


public class EnumExample {

/** enum declaration inside a class **/

enum Color
{
    RED, GREEN, BLUE, BLACK, WHITE;

    /** Java program to demonstrate that enums can have constructor
     and concrete methods. **/

    /** enum constructor called separately for each
    constant **/
    private Color()
    {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

    public static void main(String[] args) {
        Cars c1 = Cars.Audi;
        System.out.println(c1);

        /** Methods for enums: values(), ordinal() and valueOf() **/

        /** Calling values() **/
        Color arr[] = Color.values();

        /** enum with loop **/
        for (Color col : arr)
        {
            /** Calling ordinal() to find index
             of color. **/
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        /** Using valueOf(). Returns an object of
         Color with given constant.
         Uncommenting second line causes exception
         IllegalArgumentException **/
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("PURPLE"));
    }
}
