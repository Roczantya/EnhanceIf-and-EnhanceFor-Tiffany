import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ErrorForeachLoop {
    
    //ada beberapa situasi di mana enhanced for loop tidak dapat digunakan atau tidak ideal:
        //Tidak Mendukung Pengaksesan Indeks: Enhanced for loop tidak memberikan akses langsung ke indeks elemen dalam sebuah koleksi. 
        //Jadi, jika Anda perlu mengakses indeks elemen atau melakukan operasi yang melibatkan indeks, enhanced for loop tidak cocok.
        List<String> myList = new ArrayList<>()
        for (String item : myList) {
            int index = myList.indexOf(item); // Ini tidak akan bekerja dengan benar
        }
        //Tidak Dapat Menghapus Elemen: Enhanced for loop tidak dapat digunakan untuk menghapus elemen dari koleksi saat iterasi. 
        //Menghapus elemen selama iterasi dapat menyebabkan ConcurrentModificationException atau perilaku yang tidak diinginkan.
        List<Integer> numbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                numbers.remove(num); // Ini akan menyebabkan ConcurrentModificationException
            }
        }
        //Tidak Dapat Melakukan Iterasi Mundur: Enhanced for loop hanya bisa digunakan untuk iterasi maju. 
        //Jika Anda perlu melakukan iterasi mundur atau iterasi dengan langkah variabel, enhanced for loop tidak mendukung itu.
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            if (num == 3) {
                // Kode iterasi mundur tidak mungkin di sini
            }
        }
        //Tidak Mendukung Perubahan Nilai Elemen: nhanced for loop hanya memberikan salinan nilai elemen, bukan referensi langsung ke elemen itu sendiri. 
        //Jadi, Anda tidak dapat menggunakan enhanced for loop untuk mengubah nilai elemen dalam koleksi.
        List<String> fruits = new ArrayList<>();
        for (String fruit : fruits) {
            fruit = "Apple"; // Ini tidak akan mengubah nilai elemen dalam koleksi
        }
        // Iterasi pada Array yang Tidak Diketahui Ukurannya: Enhanced for loop tidak dapat digunakan untuk iterasi pada array yang tidak diketahui ukurannya, 
        // seperti array primitif yang dideklarasikan tanpa ukuran atau array yang diinisialisasi melalui metode.
        int[] myArray = new int[10];
        for (int num : myArray) {
            // Tidak dapat digunakan untuk array yang tidak diketahui ukurannya
        }
        // Koleksi yang Tidak Mendukung Iterasi: Enhanced for loop hanya dapat digunakan dengan koleksi yang mengimplementasikan antarmuka Iterable. 
        // Jika koleksi yang Anda gunakan tidak mendukung iterasi, enhanced for loop tidak akan berfungsi.
        Map<String, Integer> myMap = new HashMap<>();
        for (String key : myMap.keySet()) {
            // Ini akan bekerja dengan baik karena Map mendukung iterasi
        }
        
        Set<String> mySet = new HashSet<>();
        for (String item : mySet) {
            // Ini tidak akan bekerja karena Set tidak mendukung iterasi
        }

}
