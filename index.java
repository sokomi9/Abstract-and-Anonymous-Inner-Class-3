class Vehicles
{
    public void cars()
    {
        System.out.println("Honda Fit");
    }
}
/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Vehicles obj = new Vehicles()
        {
            public void cars()
            {
                System.out.println("Mazda Demio");
            }
        };
        obj.cars();
    }
}