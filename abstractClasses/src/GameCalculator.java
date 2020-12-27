public abstract class GameCalculator {
    public abstract void hesapla();
    //hesapla fonksiyonunu kullanmak isteyen abstract class olduğu için override etmek zorunda
    //-final dan dolayıı override edilemez.
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
