/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package pemesanan_hotel_posttest;


import java.util.ArrayList;
import java.util.Scanner;

public class PEMESANAN_HOTEL_POSTTEST {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMENU PEMESANAN HOTEL:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("\nPilihan Anda: ");
            
            int pill = scanner.nextInt();
            
            switch (pill) {
                case 1:
                    System.out.print("Nama pemesan: ");
                    String name = scanner.next();
                    System.out.print("harga kamar: ");
                    int harga = scanner.nextInt();
                    System.out.print("nomer kamar: ");
                    int nomer = scanner.nextInt();
                    System.out.print("nomer hp: ");
                    int nomorhp = scanner.nextInt();
                    Item its = new Item(name, harga, nomer,nomorhp);
                    items.add(its);
                    System.out.println("Data berhasil ditambahkan.");
                    break;
                case 2:
                    if (items.size() == 0) {
                        System.out.println("\nData masih kosong.");
                    } else {
                        System.out.println("Data:");
                        for (int i = 0; i < items.size(); i++) {
                            Item p = items.get(i);
                            System.out.println("\nData ke " + (i+1) + ". " + 
                                               "\nNama pemesan : " + p.getName() +
                                               "\nharga kamar : " +"Rp"+ p.getHarga()+"K" +
                                               "\nnomer kamar:" + p.getnomer()+
                                               "\nnomer Hp   :" + p.getnomorhp());
                        }
                    }
                    break;
                case 3:
                    if (items.size() == 0) {
                        System.out.println("\nData kosong.");
                    } else {
                        System.out.print("\nNomor data yang ingin diubah: ");
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
                            System.out.print("nomer hp: ");
                            int newnomorhp = scanner.nextInt();
                            Item newItem = new Item(newName, newharga,newnomer,newnomorhp);
                            items.set(index-1, newItem);
                            System.out.println("\nData berhasil diubah.");
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


class Item {
    private String name;
    private int harga;
    private int nomer;
    private int nomorhp;
    
    public Item(String name, int harga,int nomer, int nomorhp) {
        this.name = name;
        this.harga = harga;
        this.nomer = nomer;
        this.nomorhp = nomorhp;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHarga() {
        return harga;
    }
    public int getnomer(){
        return nomer;
    }
    public int getnomorhp(){
        return nomorhp;
    }
}

