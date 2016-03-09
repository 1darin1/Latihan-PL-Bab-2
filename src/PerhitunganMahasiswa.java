package tugaspemlan2;
/*
* Nama : Darin Nadhifah
* NIM : 155150207111063
* Kelas : TI-H
*/
public class PerhitunganMahasiswa {
    int jumlahPutaran,jumlah_waktu,jTempuh,panjang = 100,lebar = 20,kllLapangan;
    String nim,nama_mahasiswa;
    double wTercepat;
    public void Perhitungan(String nim,String nama_mahasiswa,int jumlahPutaran, int jumlah_waktu){
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
        this.jumlahPutaran = jumlahPutaran;
        this.jumlah_waktu = jumlah_waktu;
    }
    public int keliling(){
        this.kllLapangan = 2*(panjang+lebar);
        return kllLapangan;
    }
    public int JarakTempuh(){ 
        this.jTempuh = jumlahPutaran*kllLapangan;
        return jTempuh;
    }
    public double WaktuTercepat(){
        wTercepat = jumlah_waktu/jTempuh;
        return wTercepat;
    }
    public void Display(){
        keliling();
        JarakTempuh();
        System.out.println("");
        System.out.println("Nama              : "+nama_mahasiswa);
        System.out.println("Jarak Tempuh      : "+jTempuh);
        System.out.println("");
    }
}
