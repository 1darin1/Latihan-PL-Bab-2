package tugaspemlan2;
/*
* Nama : Darin Nadhifah
* NIM : 155150207111063
* Kelas : TI-H
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        PerhitunganMahasiswa Mahasiswa = new PerhitunganMahasiswa();
        PerhitunganMahasiswa Mahasiswa1 = new PerhitunganMahasiswa();
        PerhitunganMahasiswa Mahasiswa2 = new PerhitunganMahasiswa();
        int a = 0;
        for (a = 0; a < 3; a++) {
            System.out.print("NIM               : ");
            String nim = in.next();
            System.out.print("Nama              : ");
            String nama_mahasiswa = in2.nextLine();
            System.out.print("Jumlah Putaran    : ");
            int jumlahPutaran = in.nextInt();
            System.out.print("Jumlah Waktu      : ");
            int jumlah_waktu = in.nextInt();
            if (a == 0) {
                Mahasiswa.Perhitungan(nim, nama_mahasiswa, jumlahPutaran, jumlah_waktu);
            } else if (a == 1) {
                Mahasiswa1.Perhitungan(nim, nama_mahasiswa, jumlahPutaran, jumlah_waktu);
            } else if (a == 2) {
                Mahasiswa2.Perhitungan(nim, nama_mahasiswa, jumlahPutaran, jumlah_waktu);
            }
        }
        Mahasiswa.Display();
        Mahasiswa1.Display();
        Mahasiswa2.Display();
        if (Mahasiswa.wTercepat > Mahasiswa1.wTercepat) {
            System.out.println(Mahasiswa.nama_mahasiswa);
        } else if (Mahasiswa1.wTercepat>Mahasiswa.wTercepat){
            System.out.println(Mahasiswa1.nama_mahasiswa);
        } else if (Mahasiswa1.wTercepat>Mahasiswa2.wTercepat){
            System.out.println(Mahasiswa1.nama_mahasiswa);
        } else if (Mahasiswa.wTercepat>Mahasiswa2.wTercepat){
            System.out.println(Mahasiswa.nama_mahasiswa);
        } else {
            System.out.println(Mahasiswa2.nama_mahasiswa);
        }
    }
}
