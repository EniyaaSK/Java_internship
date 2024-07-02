package basic.Multiple;

public class Hotel extends Meals implements MrngTiffen,Lunch,NightDinner {
    public static void main(String[] args) {
     Hotel hh = new Hotel();
     hh.dinner();
     hh.tiffen();
     hh.lunch();
     hh.meals();

    }

    @Override
    public void lunch() {
        System.out.println("Lunch");
    }

    @Override
    public void tiffen() {
        System.out.println("tiifen");
    }

    @Override
    public void dinner() {
        System.out.println("Dinner");

    }
}
