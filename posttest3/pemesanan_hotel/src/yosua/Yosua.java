
package yosua;


import java.util.ArrayList;
import java.util.Scanner;

public class Yosua {
    public static void main(String[] args) {
        ArrayList<hotel> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("===================");
            System.out.println("|       MENU      |");
            System.out.println("===================");
            System.out.println("|1. Tambah Data   |");
            System.out.println("|2. Tampilkan Data|");
            System.out.println("|3. Ubah Data     |");
            System.out.println("|4. Hapus Data    |");
            System.out.println("|5. Keluar        |");
            System.out.println("===================");    
            System.out.print("Pilihan Anda: ");
            
            int pill = scanner.nextInt();
            
            switch (pill) {
                case 1:
                    System.out.print("Nama pemesan: ");
                    String name = scanner.next();
                    System.out.print("harga kamar: ");
                    int harga = scanner.nextInt();
                    System.out.print("nomer kamar: ");
                    int nomer = scanner.nextInt();
                    hotel its = new hotel(name, harga, nomer);
                    items.add(its);
                    System.out.println("Data berhasil ditambahkan.");
                    break;
                case 2:
                    if (items.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.println("Data:");
                        for (int i = 0; i < items.size(); i++) {
                            hotel p = items.get(i);
                            
                            System.out.println("=========================" );       
                            System.out.println("Data ke " + (i+1) + ". " );
                            System.out.println("=========================" );        
                            System.out.println("\nNama pemesan : " + p.getName() +
                                               "\nharga kamar : " +"Rp"+ p.getHarga()+"K" +
                                               "\nnomer kamar:" + p.getnomer());
                            System.out.println("=========================" );
                        }
                    }
                    break;
                case 3:
                    if (items.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.print("Nomor data yang ingin diubah: ");
                        int index = scanner.nextInt();
                        if (index > items.size() || index <= 0) {
                            System.out.println("Nomor data tidak valid.");
                        } else {
                            System.out.print("Nama baru: ");
                            String newName = scanner.next();
                            System.out.print("harga baru: ");
                            int newharga = scanner.nextInt();
                            System.out.print("nomer kamar baru: ");
                            int newnomer = scanner.nextInt();
                            hotel newItem = new hotel(newName, newharga,newnomer);
                            items.set(index-1, newItem);
                            System.out.println("Data berhasil diubah.");
                        }
                    }
                    break;
                case 4:
                    if (items.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.print(" data yang mau dihapus: ");
                        int index = scanner.nextInt();
                        if (index > items.size() || index <= 0) {
                            System.out.println(" data tidak valid.");
                        } else {
                            items.remove(index-1);
                            System.out.println("Data berhasil dihapus.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}



