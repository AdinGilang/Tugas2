package Matematika;

public class MatematikaBeraksi {
    public static void main(String[]args){
        Matematika mtk =  new Matematika();
        mtk.Pertambahan(20, 10);
        mtk.Pengurangan(10, 5);
        mtk.Perkalian(10, 3);
        mtk.Pembagian(21, 2);
        
   
        System.out.println("pertambahan 20+10 = "+mtk.Pertambahan(20, 10));
        System.out.println("pengurangan 10-5 = "+mtk.Pengurangan (10, 5));
        System.out.println("perkalian 10*3 = "+mtk.Perkalian (10, 3));
        System.out.println("pembagian 21/2 ="+mtk.Pembagian(21,2));
 
        
    }
    
}
