package basic;

public class Methods {

//    1. w/o return type and w/o arguments

        public void printstatmentsonly()
        {
            System.out.println(" in this method explore name is 1. w/o return type and w/o arguments");
        }

//   2. w/o return type and with arguments

        public void passingparameter(String emp_name,int emp_age)
        {
            System.out.println(" my emp name is "+emp_name);
        }


//    with return type and w/o arguments

        public char returnprocess1()
        {
            System.out.println(" this process name is  with return type and w/o arguments\n");
            return  'M';
        }
        public static void main(String[] args)
        {
            Methods obj=new Methods();

            obj.printstatmentsonly();

            obj.passingparameter("Sam",27);

            char gender= obj.returnprocess1();
            System.out.println(" current employee gender is (M-male,F-female)"+gender);
        }

}
