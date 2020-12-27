public class ProductManager {
    public void add(Product product){
        //static ifadesi kullanılmadığında
        //ProductValidator validator = new ProductValidator();
        //productvalidater classındaki fonk static olduğunda
        //ProductValidater static olduğunda bir kere oluşur.!!Bütün kullanıcılar o şekilde kullanır.
        //static ifadeler bellekten atılmaz.
        //bir metodu static yaptığınızda class ismiyle direk çağırılır.!!!
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }
        //birşey fonku için newlemek gerekiyor.
        //newlediğimiz içn yapıcı blok da çalıştı.
        //ProductValidator productValidator= new ProductValidator();
        //productValidator.birşey();
    }
}
