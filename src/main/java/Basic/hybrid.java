package basic;
class food
{
    public void menu()
    {
        System.out.println("Tell me yur order");
    }
}
class veg extends food
{
    public void vegmenu()
    {
        System.out.println("pure veg restaurant");
    }
}
class curdrice extends veg
{
    public void ordered()
    {
        System.out.println("yur order is taken");
    }
    class nonveg extends food {
        public void nonvegmenu ()

        {
            System.out.println("Non veg restaurant");
        }
    }

}
public class hybrid {
    public static void main(String[] args) {
        curdrice restaurant = new curdrice();
        restaurant.menu();
        restaurant.vegmenu();
        restaurant.ordered();
        
    }
}
