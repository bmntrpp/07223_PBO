/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;

/**
 *
 * @author stynore
 */
public class Transaksi {
    String nama_pelanggan;
    Date tanggal_masuk;
    String antrian;
    int indexpaket;
    String pegawai;
    float berat_cucian;
    Date tanggal_selesai;
    int harga;
    int bayar;
    int kembalian;
    
    public Transaksi(String nama_pelanggan,Date tanggal_masuk,String antrian,
                    int indexpaket,String pegawai,float berat_cucian,
                    Date tanggal_selesai,int harga,int bayar,int kembalian){
    
        this.nama_pelanggan=nama_pelanggan;
        this.tanggal_masuk=tanggal_masuk;
        this.antrian=antrian;
        this.indexpaket=indexpaket;
        this.pegawai=pegawai;
        this.berat_cucian=berat_cucian;
        this.tanggal_selesai=tanggal_selesai;
        this.harga=harga;
        this.bayar=bayar;
        this.kembalian=kembalian;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public Date getTanggal_masuk() {
        return tanggal_masuk;
    }

    public String getAntrian() {
        return antrian;
    }

    public int getIndexpaket() {
        return indexpaket;
    }

    public String getPegawai() {
        return pegawai;
    }

    public float getBerat_cucian() {
        return berat_cucian;
    }

    public Date getTanggal_selesai() {
        return tanggal_selesai;
    }
    
    public int getHarga() {
        return harga;
    }

    public int getBayar() {
        return bayar;
    }

    public int getKembalian() {
        return kembalian;
    }
}
