package penilaian;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan nilai komponen
        NilaiAkhir nilai = new NilaiAkhir("M. Amin Badali", 2110010400, 80, 90, 75);

        // Menghitung nilai akhir
        double nilaiAkhir = nilai.hitungNilaiAkhir();

        // Menampilkan nilai akhir
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
    
}
