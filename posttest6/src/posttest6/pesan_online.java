package posttest6;


public class pesan_online extends hotel implements tambah{
    private int kodeboking;
    private String tanggal;
    
    
    public pesan_online(String nama, int harga, int nomer, int kodeboking, String tanggal){
        super (nama, harga, nomer);
        this.kodeboking = kodeboking;
        this.tanggal = tanggal;
    } 

 
    /**
     * @return the kodeboking
     */
    public int getKodeboking() {
        return kodeboking;
    }

    /**
     * @param kodeboking the kodeboking to set
     */
    public void setKodeboking(int kodeboking) {
        this.kodeboking = kodeboking;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    
    @Override
    public void tampil(){
        System.out.println("\t\t\t "+ jos );
        System.out.println("\nNama pmesan             : " + getName() );
        System.out.println("Harga kamar             : " + getHarga() );
        System.out.println("Nomer kamar             : " + getnomer ());
        System.out.println("Nomer kode boking       : " + kodeboking);
        System.out.println("Tanggal pesanan         : " + tanggal);
        System.out.println("Lokasi Tempat           : " + lokasi());
        System.out.println("Review                  : " + review());
    }
    @Override
        public String lokasi(){
        return "jalan Swandi No5";
    }
    @Override
    public String review(){
        return "Bersih, Bagus ><";
    }
}
