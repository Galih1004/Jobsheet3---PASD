import java.util.Scanner;

public class matakuliahdemo14 {
    public static void main(String[] args) {

        Scanner open = new Scanner(System.in);
        matakuliah14[] arrayOfMatakuliah = new matakuliah14[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = open.nextLine();
            System.out.print("Nama       : ");
            nama = open.nextLine();
            System.out.print("Sks        : ");
            dummy = open.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = open.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new matakuliah14(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }
        arrayOfMatakuliah[0] = new matakuliah14("12345", "Algoritma", 2, 6 );
        arrayOfMatakuliah[0].tambahData("12345", "Algoritma", 2, 6);

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
        open.close();
    }
 
}
