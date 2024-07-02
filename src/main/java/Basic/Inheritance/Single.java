package basic;
class bank {
    public void bankinfo() {
        String bankname="TMB";
        String bankbranch="kalangani";
        System.out.println("Bank name is:"+bankname);
        System.out.println("Bank branch is:"+bankbranch);
    }
}
 class account extends bank
{
   public void accinfo()
    {
        long accno=3526781866757l;
        int accid= 453678990;
        System.out.println("Account no :"+accno);
        System.out.println("Account id:"+accid);

    }
}
public class Single {
    public static void main(String[] args) {
        account money=new account();
        money.bankinfo();
        money.accinfo();

    }
}
