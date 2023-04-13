
package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public final class Posttest6 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<pesan_online> listonline = new ArrayList<>();
    static ArrayList<pesan_ofline> listofline = new ArrayList<>();
    
        
    static final void disply(){//final buat metod
        System.out.println("\n========================================================");
        System.out.println("|                       List Data                      |");   
    }
    
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    
    public static void tambahData() throws IOException {
        System.out.println("\n\n\t\t=========================");
        System.out.println("\t\t|   METODE PEMESANAN    |");
        System.out.println("\t\t|=======================|");
        System.out.println("\t\t|1.| PESAN ONLINE       |");
        System.out.println("\t\t|2.| PESAN OFLINE       |");
        System.out.println("\t\t=========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Tamu Pemesanan online =========");
            System.out.print("Masukkan Nama         : ");
            String nama = input.readLine();
            System.out.print("Harga Kamar           : ");
            int harga = Integer.parseInt(input.readLine());
            System.out.print("Nomer kamar           : ");
            int nomer = Integer.parseInt(input.readLine());
            System.out.print("kode Boking           : ");
            int kodeboking = Integer.parseInt(input.readLine());
            System.out.print("Tanggal Dipesan       : ");
            String tanggal = input.readLine();
            System.out.println("========================================================");
            //listonline.add(new pesan_online (nama, harga, nomer, kodeboking, tanggal));
            pesan_online onl = new pesan_online (nama, harga, nomer, kodeboking, tanggal); 
            listonline.add(onl);
            onl.lihat(nama);
           

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Tamu Pemesanan ofline ==========");
            System.out.print("Masukkan Nama         : ");
            String nama = input.readLine();
            System.out.print("Harga Kamar           : ");
            int harga = Integer.parseInt(input.readLine());
            System.out.print("Nomer kamar           : ");
            int nomer = Integer.parseInt(input.readLine());
            System.out.print("Masukan Nomer Resi    : ");
            int nomerresi = Integer.parseInt(input.readLine());
            System.out.println("==================================================");
            //listofline.add(new pesan_ofline (nama, harga, nomer, nomerresi));
            pesan_ofline ofl = new pesan_ofline (nama, harga, nomer, nomerresi);
            listofline.add(ofl);
            ofl.lihat(nama);

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("\n\n\t\t=========================");
        System.out.println("\t\t|   METODE PEMESANAN    |");
        System.out.println("\t\t|=======================|");
        System.out.println("\t\t|1.| PESAN ONLINE       |");
        System.out.println("\t\t|2.| PESAN OFLINE       |");
        System.out.println("\t\t=========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            disply();
            System.out.println("============= Data Tamu Pesanan online ================");
                for(int i = 0; i < listonline.size();i++){
                    System.out.println("========================================================");
                    System.out.println("               Data Index ke-" + (i));
                    System.out.println("========================================================");
                        listonline.get(i).tampil();
                }
                System.out.println("========================================================");

        }else if(pil == 2){
            disply();
            System.out.println("============= Data Tamu pesanan ofline ================");
                for(int i = 0; i < listofline.size();i++){
                    System.out.println("========================================================");
                    System.out.println("               Data Index ke-" + (i));
                    System.out.println("========================================================");
                    listofline.get(i).tampil();
                }
                System.out.println("========================================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void editData() throws IOException{
        System.out.println("\n\n\t\t=========================");
        System.out.println("\t\t|   METODE PEMESANAN    |");
        System.out.println("\t\t|=======================|");
        System.out.println("\t\t|1.| PESAN ONLINE       |");
        System.out.println("\t\t|2.| PESAN OFLINE       |");
        System.out.println("\t\t=========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        switch (pil) {
            case 1:
                if (listonline.isEmpty()) {
                    System.out.println("Belum ada data yang tersimpan!");
                } else {
                    System.out.print("Masukkan indeks data pesanan online yang ingin diubah: ");
                    int index = Integer.parseInt(input.readLine());
                    if (index < 0 || index >= listonline.size()) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        pesan_online htl = listonline.get(index);
                        System.out.println("Data mahasiswa dengan indeks " + index);
                        System.out.println(htl);
                        System.out.println("======= Masukkan data Pesanan online yang baru =======");
                        System.out.print("Masukkan Nama         : ");
                        htl.setName(input.readLine());
                        System.out.print("Masukkan Harga        : ");
                        htl.setHarga(Integer.parseInt(input.readLine()));
                        System.out.print("Masukkan Nomer Kamar  : ");
                        htl.setNomer(Integer.parseInt(input.readLine()));
                        System.out.print("Masukkan Kode Boking  : ");
                        htl.setKodeboking(Integer.parseInt(input.readLine()));
                        System.out.print("Tanggal Dipesan : ");
                        htl.setTanggal(input.readLine());
                        
                        System.out.println("=================================================");
                        System.out.println("Data Pesanan online berhasil diubah!");
                    }
                }   
                break;
            case 2:
                if (listofline.isEmpty()) {
                    System.out.println("Belum ada data yang tersimpan!");
                } else {
                    System.out.print("Masukkan indeks data Pesanan ofline yang ingin diubah: ");
                    int index = Integer.parseInt(input.readLine());
                    if (index < 0 || index >= listofline.size()) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        pesan_ofline ofl = listofline.get(index);
                        System.out.println("Data dosen dengan indeks " + index);
                        System.out.println(ofl);
                        System.out.println("======= Masukkan data pesanan ofline yang baru =======");
                        System.out.print("Masukkan Nama         : ");
                        ofl.setName(input.readLine());
                        System.out.print("Masukkan Harga          : ");
                        ofl.setHarga(Integer.parseInt(input.readLine()));
                        System.out.print("Masukkan Nomer Kamar    : ");
                        ofl.setNomer(Integer.parseInt(input.readLine()));
                        System.out.print("Masukkan Nomer Resi     : ");
                        ofl.setNomerresi(Integer.parseInt(input.readLine()));
                        System.out.println("=================================================");
                        System.out.println("Data Pesanan ofline berhasil diubah!");
                    }
                }   break;
            default:
                System.out.println("Input Salah");
                break;
        }
    }
    
    
    
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           \n\n\t\t|========================|
                           \t\t|     PEMESANAN HOTEL    |
                           \t\t|========================|
                           \t\t|1.| Tambah Data Pesanan |
                           \t\t|2.| Lihat Data Pesanan  |
                           \t\t|3.| Edit Data Pesanan   |
                           \t\t|4.| Hapus Data Pesanan  |
                           \t\t|5.| Keluar              |
                           \t\t|========================|
                           """);
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                System.out.println("Program dihentikan");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
        }
    }
    }
    
    public static void hapusData() throws IOException{
        System.out.println("\n\n\t\t=========================");
        System.out.println("\t\t|   METODE PEMESANAN    |");
        System.out.println("\t\t|=======================|");
        System.out.println("\t\t|1.| PESAN ONLINE       |");
        System.out.println("\t\t|2.| PESAN OFLINE       |");
        System.out.println("\t\t=========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listonline.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Pesanan Online yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listonline.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    hotel hot = listonline.get(index);
                    listonline.remove(index);
                    System.out.println("Data pesan online dengan indeks " + index + " berhasil dihapus");
                    System.out.println(hot);
                }
            }
        }else if(pil == 2){
            if (listofline.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Pesanan ofline yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listofline.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    hotel ofline = listofline.get(index);
                    listofline.remove(index);
                    System.out.println("Data pesan ofline dengan indeks " + index + " berhasil dihapus");
                    System.out.println(ofline);
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
}