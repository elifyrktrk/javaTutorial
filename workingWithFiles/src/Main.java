import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\javaUdemy\\files\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\javaUdemy\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya Adı: "+ file.getName());
            System.out.println("Dosya Yolu: "+ file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi?: "+ file.canWrite());
            System.out.println("Dosya Okunabilir mi?: "+ file.canRead());
            System.out.println("Dosya Boyutu(byte): "+ file.length());

        }

    }

    public static void readFile(){
        File file = new File("C:\\javaUdemy\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javaUdemy\\files\\students.txt",true));
           writer.newLine();
           writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
