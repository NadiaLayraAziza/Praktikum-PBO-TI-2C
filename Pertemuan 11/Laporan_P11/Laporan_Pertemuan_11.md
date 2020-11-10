# LAPORAN JOBSHEET 11 – INTERFACE DALAM OOP JAVA
## A. Output Percobaan 1
Pada percobaan 1 langkah ke-9 terdapat kode program yang eror, maka untuk memperbaikinya agar output sesuai dengan langkah percobaan ke-10 adalah dengan cara memberikan komentar pada baris program yang eror ataupun bisa juga dengan cara menghapus kode program tersebut.<br><br><img src = "solusi1.JPG"><br><br>
Berikut output yang dihasilkan setelah kode program diperbaiki, hasilnya sudah sesuai dengan percobaan pada langkah ke-10.<br><br><img src = "output_p1.JPG">
## B. Jawaban Pertanyaan Percobaan 1
1. Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut. Jelaskan penyebab terjadinya hal tersebut ? <br>Jawaban : Terdapat warning pada baris program ke 3 dikarenakan import tersebut unused atau tidak digunakan pada program tersebut dan juga karena import tersebut berada pada package yang sama.

2. Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut dihilangkan? Jelaskan menurut pemahaman anda. <br>Jawaban : Ketika baris program ke 3 dihilangkan, maka tidak terjadi eror dan output tetap seperti semula, hal tersebut terjadi karena baris kode yang dihilangkan adalah kode program yang unused sehingga meskipun dihilangkan tidak terjadi eror ataupun perubahan pada output program.

3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! <br>Jawaban : Terjadi eror karena objek mhsBiasa yang diinstansiasi dari class Mahasiswa belum di-implements pada class interface ICumlaude.

4. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian? <br>Jawaban : Method kuliahDiKampus() dapat dipanggil dari objek sarjanaCumlaude di class Program karena objek sarjanaCumlaude yang terbentuk dari class Sarjana telah di-extends pada class Mahasiswa (class pemilik method kuliahDiKampus()).

5. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? <br>Jawaban : Method kuliahDiKampus() tidak dapat dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor karena method kuliahDiKampus() tidak termasuk method yang di-implements pada class ICumlaude, namun  method kuliahDiKampus() merupakan method di class Mahasiswa jadi tidak ada hubungan diantara kedua class tersebut.

6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: <br>Jawaban : Pada class interface ICumlaude ditambahi method public abstract void kuliahDiKampus(); kemudian pada class Rektor di method beriSertifikatCumlaude() ditambahi baris program mahasiswa.kuliahDiKampus();<br>Berikut gambar letak perubahan di class interface ICumlaude : <br><img src = "6a.JPG"><br>Berikut gambar letak perubahan di class Rektor : <br><img src = "6b.JPG">
## C. Output Percobaan 2
Pada percobaan 2 langkah ke-5 terdapat kode program yang eror, maka untuk memperbaikinya agar output sesuai dengan langkah percobaan ke-6 adalah dengan cara memberikan komentar pada baris program yang eror ataupun bisa juga dengan cara menghapus kode program tersebut.<br><br><img src = "solusi2.JPG"><br><br>
Berikut output yang dihasilkan setelah kode program diperbaiki, hasilnya sudah sesuai dengan percobaan pada langkah ke-6.<br><br><img src = "output_p2.JPG">
## D. Jawaban Pertanyaan Percobaan 2
1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar dibawah ini : <br>Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya)<br>Jawaban : Terjadi eror karena aturan dalam struktur penulisan interface, modifier method yang diperbolehkan hanya public saja. Berikut hasil capturenya :<br><img src = "pertanyaan1_p2.JPG">

2. Perhatikan script code dibawah ini :<br>Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? <br>Jawaban : Terjadi eror karena IBerprestasi merupakan class interface, sedangkan class Interface tidak dapat dibuat objek instance-nya dengan kata kunci new.

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. <br>Jawaban : Pada class Sarjana ditambahkan interface baru IBerprestasi dibelakang kata kunci implements. Lalu dengan cara yang sama seperti sebelumnya, kliklah ikon lampu peringatan untuk meng-generate semua method abstract dari interface IBerprestasi pada class Sarjana. Lakukan langkahnya sama seperti class PascaSarjana. <br>Berikut gambar modifikasinya : <br><img src = "pertanyaan3_p2.JPG">
## E. UML Class Diagram Tugas 
Berikut hasil UML dari deskripsi permasalahan pada tugas <br><br><img src = "interface.JPG">
## F. Laporan Tugas 
Berikut langkah-langkah dalam mengimplementasikan class diagram tersebut menjadi sistem pada java : <br>
1. Membuat class interface dengan nama IKarnivora. Kemudian tambahkan method public abstract void displayMakan(); di dalam class tersebut. Class ini nantinya yang akan digunakan sebagai implements untuk class Singa dan Gorilla. <br>Berikut kode programnya : <br><img src = "t1.JPG">

2. Membuat class interface dengan nama IHerbivora. Kemudian tambahkan method public abstract void displayMakan(); di dalam class tersebut. Class ini nantinya yang akan digunakan sebagai implements untuk class Keledai dan Gorilla. <br>Berikut kode programnya : <br><img src = "t2.JPG">

3. Membuat class abstract dengan Nama Binatang yang nantinya class ini akan menjadi super Class dari class Singa, Keledai, dan Gorilla. Untuk atribut dan methodnya sesuaikan dengan diagram class yang telah dibuat sebelumnya. <br>Berikut kode programnya : <br><img src = "t3.JPG">

4. Membuat class Singa yang merupakan turunan dari class Binatang. Class Singa di-extends pada class Binatang, kemudian dibuat meng-implements interface IKarnivora yang sudah dibuat sebelumnya tadi. Untuk atribut dan methodnya sesuaikan dengan diagram class yang telah dibuat sebelumnya. <br>Tips: kita dapat menggunakan fasilitas override otomatis dengan cara mengklik ikon lampu peringatan. <br>Berikut kode programnya : <br><img src = "t4.JPG">

5. Membuat class Keledai yang merupakan turunan dari class Binatang. Class Keledai di-extends pada class Binatang, kemudian dibuat meng-implements interface IHerbivora yang sudah dibuat sebelumnya tadi. Untuk atribut dan methodnya sesuaikan dengan diagram class yang telah dibuat sebelumnya. <br>Tips: kita dapat menggunakan fasilitas override otomatis dengan cara mengklik ikon lampu peringatan. <br>Berikut kode programnya : <br><img src = "t5.JPG">

6. Membuat class Keledai yang merupakan turunan dari class Binatang. Class Keledai di-extends pada class Binatang, kemudian dibuat meng-implements interface IKarnivora dan juga IHerbivora yang sudah dibuat sebelumnya tadi. Untuk atribut dan methodnya sesuaikan dengan diagram class yang telah dibuat sebelumnya. <br>Tips: kita dapat menggunakan fasilitas override otomatis dengan cara mengklik ikon lampu peringatan. <br>Berikut kode programnya : <br><img src = "t6.JPG">

7. Membuat main class dengan menginstansiasi 3 objek di dalamnya, yaitu objek dari class Singa, Keledai, dan Gorilla. Kemudian memanggil 3 method displayMakan, displayBinatang, dan displayData dari ketiga class tersebut. <br>Berikut kode programnya : <br><img src = "t7.JPG">
## G. Output Program Tugas 
Berikut hasil output dari program yang telah dibuat. Hasilnya sudah sesuai dengan yang diminta pada tugas : <br><br><img src = "output_tugas.JPG">







