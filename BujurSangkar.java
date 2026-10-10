package TugasInheritance;

public class BujurSangkar extends Bentuk {
    double sisi;

    public BujurSangkar(double sisi, String warna) {
        super(warna); // Mengirim parameter warna ke constructor parent (Bentuk)
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void printInfo() {
        System.out.println("BujurSangkar berwarna " + warna + ", luas = " + hitungLuas());
    }
}
