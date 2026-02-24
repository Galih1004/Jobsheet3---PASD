Menjawab Pertanyaan Percobaan 3.2
1. Apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
    Tidak Harus, hanya atribut yang wajib ada di dalam class karena jika tidak ada atribut maka kode program tidak akan bisa di jalankan / error

2. Apa yang dilakukan oleh kode program berikut?
    Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

    kode diatas merupakan sebuah deklarasi sebuah array yang bernama Mahasiswa ("[]") tanda ini adalah simbol array

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktor pada baris berikut?
     arrayOfMahasiswa[0] = new Mahasiswa();
     
     tidak ada konstruktor, akan tetapi java akan otomatis membuat konstruktor default, sehingga tidak akan menimbulkan error

4. Apa yang dilakukan oleh kode program berikut?
     arrayOfMahasiswa[0] = new Mahasiswa();
     arrayOfMahasiswa[0].nim   = "244107060033";
     arrayOfMahasiswa[0].nama  = "AGNES TITANIA KINANTI";
     arrayOfMahasiswa[0].kelas = "SIB-1E";
     arrayOfMahasiswa[0].ipk   = (float) 3.75;
     
     membuat dan menyimpannya ke dalam array

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan?

    class Mahasiswa berfungsi untuk membuat atribut maupun atribut, sedangkan MahasiswaDemo untuk pemanggilan kembali seluruh atribut yg ada pada class mahasiswa

Menjawab Pertanyaan Percobaan 3.3
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.
    Sudah

2.  Mengapa kode berikut menyebabkan error?
     Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3];
     myArrayOfMahasiswa[0].nim   = "244107060033";
     myArrayOfMahasiswa[0].nama  = "AGNES TITANIA KINANTI";
     myArrayOfMahasiswa[0].kelas = "SIB-1E";
     myArrayOfMahasiswa[0].ipk   = (float) 3.75;
 
     Kode tersebut menyebabkan NullPointerException saat di running, karena elemen array masih bernilai null

Menjawab Pertanyaan Percobaan 3.4
1. Apakah suatu class dapat memiliki lebih dari 1 constructor?
     Jika iya, berikan contohnya!
 
     Ya, suatu class DAPAT memiliki lebih dari 1 constructor,contoh:
      public class Matakuliah {
         public String kode;
         public String nama;
         public int sks;
         public int jumlahJam;
 
         // Constructor 1: tanpa parameter (default)
         public Matakuliah() {
         }
 
         // Constructor 2: dengan 2 parameter
         public Matakuliah(String kode, String nama) {
             this.kode = kode;
             this.nama = nama;
         }

2. Tambahkan method tambahData() pada class Matakuliah, kemudian
     gunakan di MatakuliahDemo untuk menambahkan data Matakuliah.
 
     Sudah

3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian
     gunakan di MatakuliahDemo untuk menampilkan data hasil inputan.

     Sudah

4. 4. Modifikasi MatakuliahDemo agar panjang array ditentukan user.

 