package project8;
public class Project8 {
    public static void main(String[] args) {
        
        // operator equal
        int a,b;
        boolean hasil;
        
        //-----PERSAMAAN-----
        System.out.println("----PERSMAAN----");
        a = 10;
        b = 10;
        hasil = (a==b);
        System.out.printf("%d == %d --> %s \n", a,b, hasil);
        
        a = 11;
        b = 10;
        hasil = (a==b);
        System.out.printf("%d == %d --> %s \n", a,b, hasil);
        
        
        //-----PERTIDAKSAMAAN-----
        System.out.println("----PERTIDAKSAMAAN----");
        a = 10;
        b = 10;
        hasil = (a != b);
        System.out.printf("%d == %d --> %s \n", a,b, hasil);
        
        a = 11;
        b = 10;
        hasil = ( a != b);
        System.out.printf("%d == %d --> %s \n", a,b, hasil);
        
        
        //-----KURANG dari-----
        System.out.println("----KURANG dari----");
        a = 10;
        b = 10;
        hasil = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b, hasil);
        
        a = 11;
        b = 10;
        hasil = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b, hasil);
        
        //-----LEBIH dari-----
        System.out.println("----LEBIH dari----");
        a = 10;
        b = 10;
        hasil = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b, hasil);
        
        a = 11;
        b = 10;
        hasil = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b, hasil);
        
        //-----KURANG DARI SAMADENGAN-----
        a = 9;
        b = 10;
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasil);
        
        a = 10;
        b = 10;
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasil);
        
        a = 11;
        b = 10;
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasil);
        
        //-----LEBIH DARI SAMADENGAN-----
        a = 9;
        b = 10;
        hasil = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasil);
        
        a = 10;
        b = 10;
        hasil = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasil);
        
        a = 11;
        b = 10;
        hasil = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasil);
        
        
         
    }
    
}
