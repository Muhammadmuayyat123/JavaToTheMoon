public class project5 {
    public static void main(String[] args) {
        // unary = operasi yang dijalankan pada satu variable
        
        //unary + dan -
        int angka = 8;
        System.out.printf("unary '+' %d menjadi %d\n",angka,+angka);
        System.out.printf("unary '-' %d menjadi %d\n",angka,-angka);
        
        // unary decrement dan increment
        int angka2 = 20;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = "+ angka2);
        
        int angka3 = 30;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = "+ angka3);
        
        int angka4 = 4;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++angka4);
        int angka5 = 4;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", angka5++);
        System.out.printf("nilai hasil dari postfix menjadi %d \n",angka5);
        
        // unary boolean dengan ! untuk negasi
        
        boolean yayat = true;
        System.out.println("nilai boolean = "+ yayat);
        System.out.println("nilai boolean = "+ !yayat);
    }
    
}
