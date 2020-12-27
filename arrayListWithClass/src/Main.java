import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Elif","Yürektürk"));
        customers.add(new Customer(2, "Aysu","Yiğit"));
        customers.add(new Customer(3, "Büsra","Kahraman"));


        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
