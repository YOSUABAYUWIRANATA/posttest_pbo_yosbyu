package yosua;


public class pesan_online extends hotel {
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
        super.tampil();
        System.out.println("Nomer kode boking       : " + kodeboking);
        System.out.println("Tanggal pesanan         : " + tanggal);
    }
    
}
