public class MySqlCustomerDal implements ICustomerDal , IRepository{
    @Override
    public void Add() {
        System.out.println("My sql eklendi.");
    }
    //İsimlendirmedeki Dal anlamı : Data Acces Layer > Veritabanı ile ilgili operasyonlar buraya yazılır.
}