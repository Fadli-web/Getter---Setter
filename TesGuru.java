// package Bupasha;
import java.util.Scanner;

public class TesGuru {
   public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      System.out.println("Nama :");
      String nama = input.nextLine();
      System.out.println("nip :");
      int NIP = input.nextInt();
      System.out.println("IPK :");
      String IPK = input.nextLine();
      System.out.println("masukkan Mapel :");
      String mapel = input.nextLine(); 
      System.out.println("masukkan Status ; ");
      String Status = input.nextLine();
      
      

      KelasGuru zidan = new KelasGuru();
      KelasGuru wahyu = new KelasGuru();
      KelasGuru ari = new KelasGuru();
      KelasGuru ilham = new KelasGuru();

      zidan.setNip(1111);
      zidan.setNama("zidan");
      zidan.setMapel("bahasa jawa");
      zidan.setStatus("Full-time");
      zidan.print();

      

      wahyu.setNip(1112);
      wahyu.setNama("wahyu");
      wahyu.setMapel("Olahraga");
      wahyu.setStatus("Full-time");
      wahyu.print();

      ari.setNip(1112);
      ari.setNama("wahyu");
      ari.setMapel("Olahraga");
      ari.setStatus("Full-time");
      ari.print();

      ilham.setNip(1123);
      ilham.setNama("wahyu");
      ilham.setMapel("Olahraga");
      ilham.setStatus("Full-time");
      ilham.print();

   
   }
}