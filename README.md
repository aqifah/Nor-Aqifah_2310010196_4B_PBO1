# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pasien menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan Noregistrasi pasien, dan memberikan output berupa informasi detail dari Noregistrasi tersebut seperti tahun masuk, Rumah Sakit, Rujukan, dan nomor pendaftaran.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pasien`, `PasienDetail`, dan `PasienBeraksi` adalah contoh dari class.

```bash
public class Pasien {
    ...
}

public class PasienDetail extends Mahasiswa {
    ...
}

public class PasienBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `psx[i] = new PasienDetail(nama, noregistrasi);` adalah contoh pembuatan object.

```bash
psx[i] = new PasienDetail(nama, noregistrasi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `noregistrasi` adalah contoh atribut.

```bash
String nama;
String noregistrasi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pasien` dan `PasienDetail`.

```bash
public Pasien(String nama, String noregistrasi) {
    this.nama = nama;
    this.npm = noregistrasi;
}

public PasienDetail(String nama, String noregistrasi) {
    super(nama, noregistrasi);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNoregistrasi` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNpm(String noregistrasi) {
    this.noregistrasi = noregistrasi;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNoregistrasi`, `getTahunMasuk`, `getRumahSakit`, `getRujukan`, dan `getNoPendaftaran` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNoregistrasi() {
    return noregistrasi;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `noregistrasi` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String noregistrasi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `pasienDetail` mewarisi `Pasien` dengan sintaks `extends`.

```bash
public class PasienDetail extends Pasien {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di 'Pasien` merupakan overloading method `displayInfo` dan `displayInfo` di `PasienDetail` merupakan override dari method `displayInfo` di `Pasien`.

```bash
public String displayInfo(String ruang) {
    return displayInfo() + "\nRuang: " + ruang;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getRumahSakit` dan seleksi `switch` dalam method `getRujukan`.

```bash
public String getRumah Sakit() {
    if(getNoregistrasi().substring(2, 4).equals("10")){
        return "Rumah Sakit Husada";
    } else {
        return "Rumah Sakit Ulin";
    }

    //return getNoregistrasi().substring(2, 4).equals("10") ? "Rumah Sakit Husada" : "Rumah Sakit lain";
}

public String getRujukan() {
    switch(getNoregistrasi().substring(4, 6)) {
        case "01":
            return "Rumah Sakit Husada";
        case "02":
            return "Rumah Sakit Ulin";
        default:
            return "Rumah Sakit lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < pasien.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pasien ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Pasien:");
System.out.println(pasien.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PasienDetail[] pasien = new PasienDetail[2];` adalah contoh penggunaan array.

```bash
PasienDetail[] pasien = new PasienDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nor Aqifah
NPM: 2310010196
