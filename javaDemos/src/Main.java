public class Main {

    public static void main(String[] args) {
        // write your code here
        int num = 1;
        boolean asal = true;
        if(num<2){
            System.out.println("Asal değil");
            return;
        }

        for(int i=2 ; i<num ; i++){
            if (num%i==0){
                asal = false;
            }
        }
        if (asal){
            System.out.println("Asal");
        }
        else{
            System.out.println("Asal değil");
        }

    }
}

