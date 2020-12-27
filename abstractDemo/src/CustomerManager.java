public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomer(){
        databaseManager.getData();

        //bağımlı bir kullanım şekli .
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
    }
}
