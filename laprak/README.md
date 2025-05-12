### Fitur Tambahan: Wishlist (Daftar Keinginan)
Sebagai bonus poin keaktifan, saya menambahkan satu fitur tambahan di program ini, yaitu wishlist. Fitur ini belum masuk 
ke fitur utama, tapi lumayan berguna untuk buat simulasi marketplacenya.

### Apa itu Wishlist?
Jadi, wishlist ini semacam tempat buat menyimpan produk-produk yang diinginkan oleh user, tapi belum tentu langsung dibeli. 
Mirip seperti fitur wishlist di e-commerce gitu. Tiap user bisa punya wishlist sendiri berdasarkan **userId**.

### Gimana Cara Kerjanya?
- Aku pakai **HashMap<Integer, List<Product<?>>>** buat menyimpan wishlistnya.
- Key nya adalah **userId**, dan valuenya adalah list product yang user itu pengen.
- Karena class *Product<T>* pakai **generics**, wishlist ini tetap fleksibel buat berbagai kategori produk.

### Fungsinya Apa Aja?
- *addToWishlist(int userId, Product<?> product)* → Buat nambahin produk ke wishlist si user.
- *displayWishlist(int userId)* → Buat nampilin isi wishlist si user.

### Kenapa pakai HashMap?
Soalnya biar bisa nyimpen wishlist per user, dan aksesnya juga cepet kalau mau lihat wishlist-nya siapa aja. Simple dan efisien.

### Tampil di Menu Mana?
Fitur wishlist ini bisa diakses lewat:
**7. Add to Wishlist**
**8. View Wishlist**
