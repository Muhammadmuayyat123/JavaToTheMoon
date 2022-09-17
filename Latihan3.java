package latihan3;
public class Latihan3 {
    public static void main(String[] args) {
        
        // Operasi Aritmatika
        
        int variabel1 = 16;
        int variabel2 = 6;
        
        int hasil;
        
        // 1. penjumlahan
        
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);
        
        // 2. pengurangan
        
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);
        
        // 3. perkalian
        
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n",variabel1,variabel2,hasil);
        
        // 4. pembagian
        
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);
        
        // 5. modulus (sisa pembagian)
        
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);
        
    }
    
}
