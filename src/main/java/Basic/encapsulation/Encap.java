package Basic.encapsulation;
class employee {
    public int Empid;
    public String Ename;

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String companyname;
    public String Location;
}
public class Encap {
    public static void main(String[] args) {
        employee ee=new employee();
        ee.setEmpid(01);
        ee.setEname("Anu");
        ee.setCompanyname("TCS");
        ee.setLocation("CHENNAI");

        employee ee1 = new employee();
        ee1.setEmpid(02);
        ee1.setEname("RAM");
        ee1.setCompanyname("GOOGLE");
        ee1.setLocation("us");

        System.out.println(ee.getEmpid()+"\n"+ee.getEname()+"\n"+ee.getCompanyname()+"\n"+ee.getLocation());
        System.out.println(ee1.getEmpid()+"\n"+ee1.getEname()+"\n"+ee1.getCompanyname()+"\n"+ee1.getLocation());

    }
}
