package Basic.Abstraction;

public class implement extends additionprogram{



    @Override
    public void ArithematicOperation(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b){
    int data=a-b;
        System.out.println(data);
    }

    public static void main(String[] args) {
        implement obj = new implement();
        obj.additional(10,20);
        obj.ArithematicOperation(5,9);
        obj.additionmethod(6,23);

    }
}
