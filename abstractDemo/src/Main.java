public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager= new CustomerManager();
        customerManager.databaseManager = new MySqlDataBaseManager();
        customerManager.getCustomer();

        //SOLID O: Sisteme yeni bir özellik getirdiğinde kodu değiştiriyorsan sıkıntı var.
    }
}
