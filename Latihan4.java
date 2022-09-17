package latihan4;
public class Latihan4 {
    public static void main(String[] args) {
        // Program Konversi Data
        
        int nilaiInt = 330; // 32-bit
        System.out.println("nilai int = " + nilaiInt);
        
        // Memperluas tipe data ke yang lebih besar
        
        long nilaiLong = nilaiInt;
        System.out.println("nilaiLong = " + nilaiLong);
        
        // Memperkecil ke tipe data yang lebih kecil
        
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // Pembagian
        
        // Contoh sebelum memakai float
        int f = 10;
        int e = 2;
        
        int g = f/e;
        System.out.printf("%d / %d = %d \n",f,e,g);
        
        // Contoh setelah memakai float
        
        int a = 10;
        float b = 2;
        
        float c = a/b;
        System.out.printf("%d / %f = %f \n",a,b,c);
        
        int x = 12;
        int y = 2;
        
        float z = (float)x /y;
        System.out.printf("%d / %d = %f \n",x,y,z);
        
        
    }
    
}
