# LAPORAN PRAKTIKUM JOBSHEET 3 (ENKAPSULASI PADA PBO)

## A. Screenshoot Output Percobaan 1-Enkapsulasi

<img src="output1.JPG">

## B. Screenshoot Output Percobaan 2-Access Modifier

<img src="output2.JPG">

## C. Screenshoot Output Percobaan 3-Getter dan Setter

<img src="output3.JPG">

## D. Screenshoot Output Percobaan 4-Konstruktor, Instansiasi
1. Perubahan output yang pertama

<img src="output4.JPG">

2. Perubahan output yang kedua

<img src="output5.JPG">

## E. TUGAS (Untuk source code tugas ada di folder TugasPertemuan3)

1. Cobalah program dibawah ini dan tuliskan	hasil outputnya
<br>
Jawaban :
<br>
<img src="tugas1.JPG">

2. Pada program	diatas,	pada class EncapTest kita mengeset age dengan nilai	35, namun pada saat	ditampilkan	ke layar nilainya 30, jelaskan mengapa.
<br>Jawaban : Karena dalam method setAge terdapat if yang apabila age yang dimasukkan melebihi 30 maka age di anggap 30.
<br>
3. Ubah program diatas agar atribut age dapat diberi nilai maksimal	30 dan minimal 18.
<br>
Jawaban : 
<br>
a. Perubahan code di class EncapDemo

<img src="tugas3a.JPG">

b. Perubahan code di class EncapTest

<img src="tugas3b.JPG">

c. Output dari perubahan kode di atas 

<img src="tugas3c.JPG">

4. Pada	sebuah sistem informasi	koperasi simpan	pinjam, terdapat class Anggota yang memiliki atribut antara	lain nomor KTP,	nama, limit	peminjaman,	dan	jumlah pinjaman. Anggota dapat meminjam	uang dengan	batas limit	peminjaman yang	ditentukan.	Anggota	juga dapat mengangsur pinjaman.	Ketika Anggota tersebut	mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai	dengan nominal yang	diangsur. Buatlah class Anggota	tersebut, berikan atribut, method dan konstruktor sesuai dengan	kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota	yang anda buat telah sesuai	dengan yang	diharapkan.
<br>Jawaban : 
<br>
a. Berikut source code pada class Anggota

<img src="anggota1.JPG">
<img src="anggota2.JPG">

b. Berikut Hasil Outputnya (sudah sesuai dengan yang diminta pada soal)

<img src="tugas4.JPG">

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini.	Jika mengangsur	kurang dari itu, maka muncul peringatan	“Maaf, angsuran	harus 10% dari jumlah pinjaman”.
<br>Jawaban :
<br>
a. Letak modifikasi pada class Anggota

<img src="tugas4a.JPG">

b. Letak modifikasi pada class TestKoperasi

<img src="tugas4b.JPG">

c. Berikut Output setelah dimodifikasi

<img src="tugas4c.JPG">

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran	dapat menerima input dari console.
<br>Jawaban :
<br>
a. Berikut bentuk modifikasinya 

<img src="tugas6a.JPG">
<img src="tugas6b.JPG">

b. Berikut Output setelah dimodifikasi

<img src="1.JPG">
<img src="2.JPG">




