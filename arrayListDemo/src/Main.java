import java.util.ArrayList;

//koleksiyonlarla çalışmak
public class Main {

    public static void main(String[] args) {
        /*int[] sayilar = new int[]{1,2,3};
        sayilar[3]=4;//ArrayIndexOutOfBoundsException
        sayilar = new int[4];
        System.out.println(sayilar[0]);*/
        ArrayList sayilar =new ArrayList();
        //System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());
        System.out.println(sayilar.get(0));
        sayilar.set(0,100);
        System.out.println(sayilar.get(0));
        System.out.println(sayilar.get(2));
        sayilar.set(2,"Istanbul");
        System.out.println(sayilar.get(2));
        sayilar.remove(0);//değeri değil indexi kaldır.
        System.out.println(sayilar.get(0));
        for(Object i:sayilar){
            System.out.println(i);
        }



    }
}
