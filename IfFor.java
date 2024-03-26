package Enhance;
public class Enhance {
    public static void main(String[] args) {
        //if Biasa: digunakan untuk membuat kondisi. Jika kondisi terpenuhi (true), maka kode di dalam blok 
        //"if" akan dieksekusi. Jika tidak, maka tidak akan dieksekusi.
    int x = 5;
    if (x > 0) {
        System.out.println("Nilai x positif");
    }     

    //enchance if  adalah cara untuk membuat pernyataan "if" lebih singkat atau lebih cerdas. lebih tepatnya lebih efisien dibanding if biasa
    int y = 5;
    String result = (y > 0) ? "Positive" : "Non-positive";
        System.out.println("Number is " + result);
    

    //For Biasa: Dalam struktur "for" biasa di Java, Anda harus menentukan variabel iterasi, kondisi iterasi, dan langkah iterasi secara eksplisit
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }
    

    //Enhanced For (For Each): Dalam "enhanced for" atau "for-each loop" di Java, 
    //Anda tidak perlu khawatir tentang inisialisasi variabel iterasi, kondisi iterasi, atau langkah iterasi. 
    //Anda langsung mengakses setiap elemen dalam struktur data tersebut
    int[] numbersa = {1, 2, 3, 4, 5};
        for (int number : numbersa) {
            System.out.println(number);
        }
       
    }
} 

