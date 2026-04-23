package pemrog2;

public class Pt2 {
    
    public String nim, nama, grade;
    private float uts, uas;
    public double nilaiAkhir;

    // Getter & Setter NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter & Setter Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter & Setter UTS
    public float getUts() {
        return uts;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    // Getter & Setter UAS
    public float getUas() {
        return uas;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }

    // Hitung Nilai Akhir
    public double getNilaiAkhir() {
        nilaiAkhir = (uts + uas) / 2;
        return nilaiAkhir;
    }

    // Menentukan Grade
    public String getGrade() {
        if (nilaiAkhir < 50)
            grade = "F";
        else if (nilaiAkhir < 60)
            grade = "D";
        else if (nilaiAkhir < 70)
            grade = "C";
        else if (nilaiAkhir < 80)
            grade = "B";
        else
            grade = "A";

        return grade;
    }
}