//SOLID single responsibilitye aykırı bir kullanım şekli
//Bir class bir iş yapar inner class kullanmak yerine iki class yapmak daha güzel bir kullanım şekli.!!!
public class DatabaseHelper {

    public static class Crud{
        //create read uppdate delete
        public static void Delete(){

        }
        public static void Update(){

        }
    }
    public static class Connection{
        public static void createConnection(){

        }
    }
}
