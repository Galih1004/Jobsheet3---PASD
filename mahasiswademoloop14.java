import java.util.Scanner;

public class mahasiswademoloop14 {
    public static void main(String[] args) {

        Scanner izinn = new Scanner(System.in);
        mahasiswa14[] arrayOfMahasiswa = new mahasiswa14[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa14();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = izinn.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = izinn.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = izinn.nextLine();
            System.out.print("IPK   : ");
            dummy = izinn.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM   : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa[i].ipk);
            System.out.println("------------------------------");
        }
        izinn.close();
    }
}