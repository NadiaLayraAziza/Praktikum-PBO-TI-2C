# LAPORAN JOBSHEET 9 (OVERLOADING DAN OVERRIDING)

## A. Praktikum 
Terdapat tiga kelas, yaitu Karyawan, Manager, dan Staff. Class Karyawan merupakan superclass dari Manager dan Staff dimana subclass Manager dan Staff memiliki method untuk menghitung gaji yang berbeda.

<img src="Output Percobaan.JPG">

1. Pada class Staff terdapat overloading dan overriding. <br>Overloading terletak pada potongan kode program berikut : <br>public double getGaji (int lembur,double gajiLembur) { <br>return super.getGaji()+lembur * gajiLembur; } <br>Sedangkan overriding terdapat pada potongan kode program berikut : <br>public double getGaji() { <br>return super.getGaji()+lembur * gajiLembur; }

2. Pada class Manager terdapat overriding yang terletak pada potongan kode program berikut : <br>public double getGaji() { <br>return super.getGaji()+tunjangan; }

## B. LATIHAN

#### Output latihan 1 dan 2 
<img src="Output Latihan 1.JPG">

1. Dari source coding diatas terletak dimanakah overloading ? <br>Jawaban : Overloading terletak pada method perkalian yang pertama dan method perkalian yang ke kedua 

2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda ? <br>Jawaban : Ada 2 parameter yang berbeda yaitu (int a, int b) dan (int a, int b, int c)

#### Output Latihan 3 dan 4 
<img src="Output Latihan 2.JPG">

3. Dari source coding diatas terletak dimanakah overloading ? <br>Jawaban : Overloading terletak pada method perkalian yang pertama dan method perkalian yang ke 2

4. Jika terdapat overloading ada berapa tipe parameter yang berbeda ? <br>Jawaban : Ada 2 tipe parameter yang berbeda yaitu int dan double

#### Output Latihan 5 dan 6
<img src="Output Latihan 3.JPG">

5. Dari source coding diatas terletak dimanakah overriding ? <br>Jawaban : Overriding terletak pada method swim di Class Piranha yang mana class ini merupakan subclass dari class Ikan

6. Jabarkanlah apabila sourcoding diatas jika terdapat overriding ? <br>Jawaban : Nama method yang merupakan overriding adalah swim( ) pada class Piranha karena class Piranha ini menjadi subclass dari class Ikan sehingga method swim( ) pada class Ikan disebut overridden. Output yang dihasilakan dari kedua method tersebut berbeda meskipun nama methodnya sama.

## C. TUGAS
1. Overloading <br>Berikut output dari program overloading :
<img src="Output Tugas Overloading.JPG">
<br>Pada class Segitiga terdapat method yang overloading, diantaranya yaitu method totalSudut (int sudutA) dengan method totalSudut(int sudutA, int sudutB), kemudian ada lagi yaitu method keliling(int sisiA, int sisiB, int sisiC) dengan method keliling(int sisiA, int sisiB). Method-method tersebut dikatakan overloading karena memiliki nama method yang sama dengan parameter yang berbeda.

2. Overriding <br>Berikut output dari program overriding :
<img src="Output Tugas Overriding.JPG">
<br>Pada masing-masing class Manusia, dosen, dan Mahasiswa terdapat method makan, maka method inilah yang dinamakan overriding. Namun method makan yang ada di class Manusia disebut overridden karena method ini berada di super class nya. Maksud dari menggunakan teknik dynamic method dispatch adalah output yang dihasilkan adalah hasil dari method pada class itu sendiri, bukan method turunan. Contohnya bisa dilihat pada output program di atas. Output baris pertama merupakan hasil dari pemanggilan method makan pada class Manusia, kemudian output baris kedua merupakan hasil pemanggilan method makan pada class Dosen, sedangkan output baris ketiga merupakan hasil pemanggilan method makan pada class Mahasiswa.
