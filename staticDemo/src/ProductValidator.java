public class ProductValidator {
    //ana class static olamaz.
    static {
        System.out.println("Statik yapıcı blok çalıştı");
    }
    //Yapıcı bloklar newleyince çalışır.
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void birşey(){

    }
    //inner class
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}
