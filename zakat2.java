/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat;

public interface zakat2 {
    double hitungZakat();
}

class ZakatMal implements zakat2 {
    private double totalHarta;

    public double getTotalHarta() {
        return totalHarta;
    }

    public void setTotalHarta(double totalHarta) {
        this.totalHarta = totalHarta;
    }

    @Override
    public double hitungZakat() {
        return totalHarta * 0.025;
    }
}

class ZakatPenghasilan implements zakat2 {
    private double penghasilanBulanan;

    public double getPenghasilanBulanan() {
        return penghasilanBulanan;
    }

    public void setPenghasilanBulanan(double penghasilanBulanan) {
        this.penghasilanBulanan = penghasilanBulanan;
    }

    @Override
    public double hitungZakat() {
        return penghasilanBulanan * 0.025;
    }
}

class ZakatFitrah implements zakat2 {
    private int jumlahAnggotaKeluarga;
    private double hargaBeras;

    public int getJumlahAnggotaKeluarga() {
        return jumlahAnggotaKeluarga;
    }

    public void setJumlahAnggotaKeluarga(int jumlahAnggotaKeluarga) {
        this.jumlahAnggotaKeluarga = jumlahAnggotaKeluarga;
    }

    public double getHargaBeras() {
        return hargaBeras;
    }

    public void setHargaBeras(double hargaBeras) {
        this.hargaBeras = hargaBeras;
    }

    @Override
    public double hitungZakat() {
        return jumlahAnggotaKeluarga * hargaBeras * 2.5;
    }
}
