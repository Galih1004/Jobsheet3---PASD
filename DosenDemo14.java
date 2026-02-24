import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {

        Scanner gg = new Scanner(System.in);
        Dosen14[] arrayOfDosen = new Dosen14[3];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = gg.nextLine();
            System.out.print("Nama          : ");
            nama = gg.nextLine();
            System.out.print("Jenis Kelamin (true=Pria/false=Wanita) : ");
            dummy = gg.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            dummy = gg.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen14 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            i++;
        }

        gg.close();
      
    }
}