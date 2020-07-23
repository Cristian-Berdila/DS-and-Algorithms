package recap.java.basics;

// Java program to demonstrate how values can
// be assigned to enums.
enum TrafficSignal
{
    // This will call enum constructor with one
    // String argument
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    // declaring private variable for getting values
    private String actiune;

    // getter method
    public String getAction()
    {
        return this.actiune;
    }

    // enum constructor - cannot be public or protected
    //the name of the argument is the name of the value of each enum
    private TrafficSignal(String actiune)
    {
        this.actiune = actiune;
    }
}

// Driver code
public class EnumWithValuesExample
{
    public static void main(String args[])
    {
        // let's print name of each enum and there action
        // - Enum values() examples
        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals)
        {
            // use getter method to get the value
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction() );
        }
    }
}