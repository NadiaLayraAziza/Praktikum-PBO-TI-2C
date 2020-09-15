# JAWABAN PERTANYAAN PADA JOBSHEET 3

## A. PERTANYAAN - PERCOBAAN 2
1. Pada class TestMobil, saat kita menambah	kecepatan untuk	pertama	kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!” ?	
<br>
Jawaban : Karena belum menyalakan mesin/ belum memanggil method nyalakanMesin sehingga mesin dalam keadaan off
<br>
2. Mengapat	atribut	kecepatan dan kontakOn diset private ?	
<br>
Jawaban : Karena jika menggunakan public, kecepatan motor tiba-tiba saja berubah dari 0 ke 50. Padahal keterangannya posisi kontak motor masih dalam kondisi OFF. Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan, sehingga atribut kecepatan kontakOn di set private untuk menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain). 
<br>
3. Ubah	class Motor sehingga kecepatan maksimalnya adalah 100!
<br>
Jawaban :
<img src="jawaban_n0_3.JPG">
<br>

## B. PERTANYAAN - PERCOBAAN 3 DAN 4
1. Apa yang dimaksud getter dan setter ?
<br>
Jawaban : Getter dan setter adalah dua method yang tugasnya untuk mengambil dan mengisi data ke dalam objek. Method ini digunakan dalam OOP enkapsulasi dimana data dibungkus dengan modifier private agar tidak bisa diakses secara langsung dari luar class.
<br>
2. Apa kegunaan dari method getSimpanan() ?
<br>
Jawaban : Digunakan untuk mendapatkan nilai simpanan karena seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik().
<br>
3. Method apa yang digunakan untuk menambah saldo ?
<br> 
Jawaban : Method setor yaitu public void setor(float uang)
<br>
4. Apa yang dimaksud konstruktor ?
<br>
Jawaban : Konsktruktor adalah Method istimewa yang digunakan saat pembuatan objek (instansiasi). Perbedaan method konstruktor dengan method lainnya pada java adalah nama method konstruktor harus sama dengan nama kelasnya.
<br>
5. Sebutkan	aturan dalam membuat konstruktor ?
<br>
Jawaban : Nama method sama dengan nama class, Tidak memiliki tipe data method, Hanya bisa dijalankan/dipanggil pada proses instansiasi, bisa memiliki parameter, tidak dapat diwariskan, bisa memiliki acces modifier private, super() atau this() adalah pernyataan pertama yang harus di panggil dalam constructor.
<br>
6. Apakah boleh	konstruktor	bertipe	private ?
<br>
Jawaban : Tidak boleh karena constructor tidak memiliki tipe data method
<br>
7. Kapan menggunakan parameter dengan passsing parameter ?
<br>
Jawaban : Ketika mengirim dan atau mengembalikan suatu nilai kepada fungsi atau prosedur.
<br>
8. Apa perbedaan atribut class dan instansiasi atribut ?
<br>
Jawaban : Atribut class merupakan kumpulan variabel yang ada di dalam blok code class, sedangkan Instansiasi atribut adalah proses pembuatan atribut itu sendiri
<br>
9. Apa perbedaan class method dan instansiasi method ?	
<br>
Jawaban : Class method adalah kumpulan method yang ada di dalam blok code class, sedangkan Instansiasi method adalah proses pembuatan method itu sendiri
