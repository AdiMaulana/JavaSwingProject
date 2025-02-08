# JavaSwingProject
 Aplikasi Penjualan Merchandise Band Local berbasis desktop menggunakan framework java swing UI dan simpan data ke database postgresql

Tampilan Halaman Registasi Account

![Image](https://github.com/user-attachments/assets/aa6e61b2-1128-40c9-b11a-76d88bb60e6f)

Register Account Berhasil

![Image](https://github.com/user-attachments/assets/09aaddc8-6cd0-40da-865e-f91f454add38)

Tampilan Halaman Login

![Image](https://github.com/user-attachments/assets/143cb786-d545-41c4-9eaa-feadbf98f236)

Login Gagal Salah Username dan Password

![Image](https://github.com/user-attachments/assets/6765bb4b-d31d-4d59-b4f1-9fabf752b578)

1. Menu Dashboard

Tampilan Halaman Utama di menu dashboard untuk memunculkan daftar merchandise yang dijual

![Image](https://github.com/user-attachments/assets/5ebb2bc2-55a7-4857-a973-3f21890837f7)

Pembelian Merchandise
Pada menu dashboard, pilih salah satu produk merchandise yang ingin dibeli dengan mengklik tombol purchase

![Image](https://github.com/user-attachments/assets/f13973ab-8a02-4735-80f1-9f2adad02edd)

Jika stok merchandise habis atau kurang dari total item yang ingin dibeli maka akan muncul error stok habis

![Image](https://github.com/user-attachments/assets/489fbc65-7b67-4720-9e20-9900d4a96657)

Pilih produk merchandise lain yang stok nya masih banyak

Tampilan pembelian merchandise jika berhasil akan mengupdate stok produk dan data penjualan akan otomatis tersimpan ke revenue

![Image](https://github.com/user-attachments/assets/c661d324-11e9-4e7d-8bdb-a01d4cdd2558)

2. Menu Collection
Tampilan berisi menu koleksi data merchandise

Admin dapat menambah data, memperbarui nama produk, stok, harga dan menghapus data merchandise 

![Image](https://github.com/user-attachments/assets/70df884f-3e5a-417a-b79c-2c6163b742be)

Untuk menambahkan data produk merchandise yang baru, klik tombol Tambah Merch di pojok kanan atas daftar catalog maka akan muncul form tambah produk.
Kemudian input nama merchandise, harga dan stok, lalu klik simpan dan sistem akan menyimpan data tersebut ke database merchandise 

![Image](https://github.com/user-attachments/assets/665b4f72-65fc-4471-aa16-8cc9a62615d0)

Jika produk berhasil disimpan maka akan muncul notif "Data berhasil ditambahkan"

![Image](https://github.com/user-attachments/assets/6f63a619-e935-45ad-912e-1f7073a685d5)

Untuk mengupdate stok produk dan harga bisa pilih salah satu merchandise lalu klik detail maka akan muncul form details merchandise, 
field yang bisa diubah hanya nama merchandise, harga dan stok. Untuk field ID akan disable, sistem akan melakukan update atau hapus data 
berdasarkan ID merchandise yang terdaftar di database.  Jika sudah input data maka lalu lanjut klik update untuk submit data

![Image](https://github.com/user-attachments/assets/5d56e2f8-72dc-453e-bb79-0065d45aed5e)

Tampilan ketika update data merchandise berhasil akan muncul pop up dengan keterangan "Data stok merchandise berhasil diperbarui" seperti tampilan berikut :

![Image](https://github.com/user-attachments/assets/fd3b0bc6-94f9-4764-a147-36427f2fde37)

Untuk menghapus data merchandise pun demikian, pilih satu data yang akan dihapus dengan cara klik detail. 

![Image](https://github.com/user-attachments/assets/48d4280e-becf-40f9-9907-7e467e71c8d6)

Akan muncul pop up dialog untuk konfirmasi hapus data demi mencegah kesalahan hapus data merchandise. klik ya untuk melanjutkan proses delete lalu muncul keterangan data berhasil dihapus.

![Image](https://github.com/user-attachments/assets/4c82ae8f-a09f-43ee-8807-23f3ba230a09)

3. Menu Members
Berisi data pengguna yang melakukan registrasi akun, termasuk nama, userID, email dan nama role dengan tampilan sebagai berikut:

![Image](https://github.com/user-attachments/assets/a31f3313-0404-45e7-bf2b-359f87d06a6b)

4. Menu Revenue
Berisi data penjualan yang diinput dari menu pembelian merchandise. Terdapat data jumlah item terjual dan total revenue. 
Tampilannya programnya sebagai berikut:

![Image](https://github.com/user-attachments/assets/ac7bc471-2721-43c8-bf36-8187588812ed)

5. Menu Logout
Jika sudah selesai melakukan pembelian, lalu klik logout dan akan diarahkan kembali ke halaman login

![Image](https://github.com/user-attachments/assets/c672281a-5a17-4d1e-a50d-ed26fbfc3fc6)

