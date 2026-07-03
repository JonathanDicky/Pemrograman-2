public class Product {
    String nama;
    int harga;
    String kategori;

    public Product(String nama, int harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return nama + " | " + harga + " | " + kategori;
    }
}