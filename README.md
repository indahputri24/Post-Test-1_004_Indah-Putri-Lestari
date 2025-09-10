# Post Test 1 Praktikum PBO
Nama: Indah Putri Lestari

NIM: 2409116004

Kelas: A

# Sistem Parkir Kendaraan di Mall (CRUD)

Program sederhana untuk mencatat data kendaraan yang parkir di mall dengan operasi CRUD (Create, Read, Update, Delete). Data yang disimpan hanya plat kendaraan, jenis kendaraan, dan blok lokasi parkir.

# Penjelasan Output

<img width="669" height="448" alt="image" src="https://github.com/user-attachments/assets/bff41f22-5cb9-4772-8358-92433916523d" />

Menu tersebut adalah menu utama dari program sistem parkir kendaraan. Program ini menampilkan daftar pilihan menu yang dapat dipilih oleh pengguna. Ada 5 pilihan menu utama, yaitu:
1. Tambah Data Parkir: bagian ini untuk menambahkan data parkir kendaraan baru (plat, jenis, blok).
2. Tampilkan Data Parkir: bagian ini untuk menampilkan semua data parkir kendaraan.
3. Perbarui Data Parkir: bagian ini untuk mengubah atau memperbarui data kendaraan berdasarkan plat.
4. Hapus Data Parkir: bagian ini untuk menghapus data parkir kendaraan berdasarkan plat.
5. Keluar: bagian ini untuk menghentikan program.

Pengguna diminta mengetik angka [1-5] sesuai menu yang ingin dijalankan. Setelah menyelesaikan suatu operasi, program akan kembali menampilkan menu ini sampai pengguna memilih Keluar.

<img width="879" height="953" alt="image" src="https://github.com/user-attachments/assets/bc7593a4-ec4d-4b3c-ad12-0d5cc0cd2da9" />

Saat pengguna memasukkan input menu yang tidak sesuai, yaitu angka 9, sementara pilihan menu yang tersedia hanya dari 1 sampai 5. Program kemudian menampilkan pesan "Pilihan tidak valid. Masukkan pilihan angka [1-5]." untuk memberi tahu pengguna bahwa input salah. Setelah itu, program otomatis kembali menampilkan menu utama agar pengguna bisa mencoba memasukkan pilihan yang benar.

<img width="702" height="951" alt="image" src="https://github.com/user-attachments/assets/f773e124-df08-4075-874d-a6f7d765c324" />

Saat pengguna mencoba memasukkan input menu dengan teks "pbo" padahal program hanya menerima angka 1 sampai 5 sebagai pilihan menu. Lalu program menampilkan pesan kesalahan "Input menu harus angka 1-5.". Setelah itu, program tidak berhenti, melainkan kembali menampilkan menu utama sehingga pengguna bisa mencoba lagi dengan input yang benar.

## Menampilkan Data Parkir

<img width="770" height="475" alt="image" src="https://github.com/user-attachments/assets/018c0f9d-8ac2-4951-bf0d-734e0db19e62" />

Output ini menunjukkan hasil ketika pengguna memilih menu 2 (Tampilkan Data Parkir). Program akan menampilkan seluruh data kendaraan yang sudah tersimpan dalam bentuk tabel dengan kolom No, Plat, Jenis, dan Blok.

## Tambah Data Parkir

<img width="969" height="516" alt="image" src="https://github.com/user-attachments/assets/2f22c3a6-389a-461d-af01-2b45b111da9e" />

Output ini menampilkan proses saat pengguna memilih menu 1 (Tambah Data Parkir).
1. Program meminta input plat nomor kendaraan, jenis kendaraan (Mobil/Motor), dan blok lokasi parkir.
2. Pengguna memasukkan data: plat "KT5464BAJ", jenis "Motor", dan blok "A1".
3. Setelah semua data valid dan lolos pengecekan, program akan menambahkan entri baru ke dalam daftar parkir.
4. Program kemudian menampilkan pesan konfirmasi: "Berhasil menambahkan data parkir dengan plat KT5464BAJ." sebagai tanda bahwa data sudah tersimpan.

<img width="778" height="524" alt="image" src="https://github.com/user-attachments/assets/871c5578-2744-4192-995d-e95be63a4692" />

Daftar Parkir setelah berhasil menambahkan data parkir baru.

<img width="879" height="637" alt="image" src="https://github.com/user-attachments/assets/36d720fe-fc03-4f71-a427-9e3f1da37de3" />

Pada saat pengguna memilih menu Tambah Data Parkir, program akan meminta input berupa plat nomor kendaraan. Jika pengguna tidak jadi untuk menambahkan data parkir, cukup tekan ENTER untuk membatalkannya, maka program secara otomatis membatalkan proses penambahan data dan mengembalikan pengguna ke menu utama untuk memilih opsi lain.

<img width="895" height="405" alt="image" src="https://github.com/user-attachments/assets/4542131b-67ed-448f-99cc-be9dae5ca539" />

Jika pengguna salah memasukkan jenis kendaraan, misalnya mengetik "pesawat" daripada Mobil atau Motor, maka program akan menolak input tersebut dan mengulang kembali permintaan input hingga pengguna memberikan data yang valid atau memilih batal dengan menekan ENTER.

## Perbarui Data Parkir

<img width="1080" height="1325" alt="image" src="https://github.com/user-attachments/assets/293bf4fc-4399-4de7-8093-78c996fe8db4" />

Saat pengguna memilih menu 3 (Perbarui Data Parkir) akan menampilkan daftar parkir yang tersimpan terlebih dahulu, lalu menampilkan pilihan sub-menu perbarui data jika plat yang ingin diperbarui ada di daftar parkir.

<img width="1106" height="846" alt="image" src="https://github.com/user-attachments/assets/17e382d2-f5dc-4677-8029-32ff0748e42b" />

Ketika pengguna memasukkan plat nomor yang tidak terdapat pada daftar parkir, seperti contoh KT1234OK, program tidak menemukan kecocokan. Program kemudian menampilkan pesan “Plat nomor kendaraan tidak ditemukan.” dan meminta pengguna untuk memasukkan ulang plat nomor atau menekan ENTER untuk membatalkan proses perbarui data.

<img width="1088" height="822" alt="image" src="https://github.com/user-attachments/assets/14a66884-d50c-4791-b48b-b4528b4e9523" />
<img width="755" height="397" alt="image" src="https://github.com/user-attachments/assets/ccaf3735-8ceb-448e-8d9e-dc7d10712f5d" />

Pada saat pengguna memilih menu Perbarui Data Parkir dan memasukkan plat nomor KT4959IO, program menampilkan data lama berupa plat, jenis kendaraan, dan blok lokasi. Selanjutnya, pengguna memilih opsi 1 (Plat Nomor) pada sub-menu perbarui data. Program kemudian meminta input plat baru, dan pengguna memasukkan KT3456KL. Setelah diverifikasi bahwa plat baru valid dan tidak duplikat, program memperbarui data dari plat lama KT4959IO menjadi KT3456KL.

<img width="1078" height="1315" alt="image" src="https://github.com/user-attachments/assets/b70a9f44-c7c9-4432-b3a5-a95ba68da9e3" />

Ketika pengguna memilih opsi Plat Nomor pada sub-menu perbarui data dan memasukkan plat baru KT4321EFG, program mendeteksi bahwa plat tersebut sudah digunakan oleh kendaraan lain (pada no 5). Akibatnya, program menolak perubahan dan menampilkan pesan “Plat baru sudah ada di data lain.”. Dengan demikian, pengguna diminta kembali untuk memasukkan plat baru yang valid atau membatalkan proses dengan menekan ENTER, sehingga program dapat menjaga agar tidak ada data ganda pada daftar parkir.

<img width="1069" height="844" alt="image" src="https://github.com/user-attachments/assets/157e5f88-9fc8-4b10-8f0c-f3275e8ae07f" />
<img width="766" height="195" alt="image" src="https://github.com/user-attachments/assets/3a5d3f58-5ad5-455f-8a25-3f7332f3616b" />

Pada saat pengguna memilih opsi 2 (Jenis Kendaraan) pada sub-menu perbarui data. Program kemudian meminta input jenis baru, dan pengguna memasukkan Mobil. Karena input tersebut valid sesuai dengan ketentuan, program memperbarui jenis kendaraan dari Motor menjadi Mobil dan menampilkan pesan konfirmasi “Jenis kendaraan berhasil diperbarui.” Dengan demikian, data kendaraan berhasil diubah tanpa memengaruhi plat maupun blok lokasi.

<img width="1083" height="873" alt="image" src="https://github.com/user-attachments/assets/f713367f-c5a3-45e0-a556-393e4ed2e592" />

Saat diminta memasukkan jenis baru, pengguna mengetikkan input tidak valid, yaitu “pesawat”. Karena program hanya menerima input “Mobil” atau “Motor”, program menolak perubahan dan menampilkan pesan “Jenis harus 'Mobil' atau 'Motor'! Coba lagi.”. Setelah itu, program kembali meminta pengguna untuk menginput ulang jenis kendaraan yang benar atau menekan ENTER untuk membatalkan proses pembaruan.

<img width="1075" height="886" alt="image" src="https://github.com/user-attachments/assets/c33bbb4a-90fd-46af-bf0c-b1f0f94fbfbe" />
<img width="764" height="232" alt="image" src="https://github.com/user-attachments/assets/7b2a9d90-1c1a-4259-a967-f123c7e80dcf" />

Pada saat pengguna memilih opsi 3 (Blok Lokasi) pada sub-menu perbarui data. Program kemudian meminta input blok lokasi baru, lalu pengguna mengetikkan B4. Karena input valid, program langsung memperbarui data blok dari C1 menjadi B4 dan memberikan pesan konfirmasi “Blok C1 berhasil diperbarui menjadi B4.” sehingga perubahan hanya terjadi pada blok lokasi tanpa memengaruhi data plat maupun jenis kendaraan.

<img width="1079" height="810" alt="image" src="https://github.com/user-attachments/assets/ae1200b4-93bd-428b-a5e9-4e6dbab2f525" />

Jika pengguna memilih opsi 4 (Batal Perbarui). Karena pilihan ini berarti pengguna tidak ingin melakukan perubahan, sistem langsung menampilkan pesan “Batal perbarui data. Kembali ke menu utama.” dan keluar dari proses pembaruan tanpa mengubah data apapun.

## Hapus Data Parkir

<img width="1037" height="836" alt="image" src="https://github.com/user-attachments/assets/89d6a4e9-b3e5-4cb8-b1de-203f73421490" />
<img width="773" height="355" alt="image" src="https://github.com/user-attachments/assets/32c367fd-8ccb-46e6-aa1c-3e225732ef92" />

Pada saat pengguna memilih menu Hapus Data Parkir, program terlebih dahulu menampilkan seluruh daftar kendaraan yang sedang terdaftar di parkiran. Pengguna kemudian memasukkan plat nomor KT5464BAJ sebagai data yang ingin dihapus. Untuk memastikan, program meminta konfirmasi dengan pertanyaan “Yakin ingin menghapus data dengan plat KT5464BAJ? (Y/T)”. Setelah pengguna mengetikkan Y, program langsung menghapus data tersebut dari daftar parkir. Proses ini ditutup dengan pesan konfirmasi “Data dengan plat KT5464BAJ berhasil dihapus!”, yang menandakan bahwa data kendaraan tersebut sudah tidak ada lagi di sistem.

<img width="1046" height="765" alt="image" src="https://github.com/user-attachments/assets/2d606650-aecd-4a5f-9d5e-9f6256269d53" />

Jika pengguna mengetikkan plat nomor KT8763KO untuk dihapus. Namun, program melakukan pencarian pada daftar yang ada dan tidak menemukan plat nomor tersebut. Karena tidak cocok dengan data yang tersedia, program menampilkan pesan “Plat nomor tidak ditemukan.”. Setelah itu, program langsung meminta kembali pengguna untuk memasukkan plat nomor yang ingin dihapus atau menekan ENTER jika ingin membatalkan.

<img width="1027" height="1198" alt="image" src="https://github.com/user-attachments/assets/b6747794-08d7-4b49-ab31-45f75769f83d" />

Program menampilkan daftar data parkir yang tersedia, kemudian pengguna mengetikkan plat nomor KT4321EFG untuk dihapus. program mendeteksi plat tersebut ada dalam daftar, sehingga menampilkan konfirmasi: “Yakin ingin menghapus data dengan plat KT4321EFG? (Y/T):”. Pengguna kemudian mengetik T, yang berarti Tidak, sehingga program tidak jadi menghapus data tersebut. Program langsung menampilkan pesan “Batal hapus data, kembali ke menu utama.” dan mengembalikan pengguna ke menu utama.

<img width="1560" height="1228" alt="image" src="https://github.com/user-attachments/assets/b3556055-5f1a-4cb0-af7e-556e4be629ec" />

Ketika pengguna menghapus data dengan plat nomor KT4321EFG. Setelah memasukkan plat yang benar, program menampilkan konfirmasi penghapusan. Namun, ketika pengguna salah mengetik input konfirmasi dengan memasukkan teks selain Y, T, atau menekan ENTER, program memberikan peringatan bahwa input tidak valid dan meminta konfirmasi ulang. Saat pengguna hanya menekan ENTER, program mengenali hal tersebut sebagai pembatalan penghapusan sehingga menampilkan pesan “Batal hapus data (ENTER ditekan), kembali ke menu utama”. Dengan demikian, data tidak jadi dihapus dan program kembali ke menu utama.

## Keluar Program

<img width="1255" height="596" alt="image" src="https://github.com/user-attachments/assets/d276a947-f345-4663-8439-53e13ae3a857" />

Saat pengguna memilih menu nomor 5 (Keluar) pada program Sistem Parkir Mall. Setelah input angka 5, program langsung menampilkan pesan "Terima kasih. Program Selesai." yang menandakan bahwa program dihentikan dengan benar.
