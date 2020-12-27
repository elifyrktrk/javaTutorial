public class Main {
//polymorphismin interfacelerle uygulanması
    public static void main(String[] args) {
	//interfaceler de abstractlar gibi newlenemezler.
      //  ICustomerDal iCustomerDal = new OracleCustomerDal();
        //interface onu implement eden classın referansını tutabilir.polymorphism
    CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
    //customerManager.customerDal=new MySqlCustomerDal();//constructor kullandığımızda buna gerek yok artık
    customerManager.add();
    }
}
