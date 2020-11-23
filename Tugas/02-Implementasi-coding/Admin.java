public class admin{
    String nama_pelanggan;
    String tanggal_masuk;
    int antrian;
    String paket;
    String pegawai;
    Flaot berat_cucian;

    void incomeTransaction(String name_customer, String date_entry, String queue, String package, String employe,String laundy_weight)
    {
        pelanggan = name_customer;
        tanggal_masuk = date_entry;
        antrian = queue;
        pegawai = employe;
        berat_cucian = laundy_weight;
    }

    String printStruk()
    {
        return "Nama Pelanggan:"+nama_pelanggan+
                "Tanggal Masuk:"+tanggal_masuk+
                "Antrian:"+antrian
                "Paket:"+paket
                "Kasir:"+pegawai
                "Berat:"+berat_cucian;
    }
     
}