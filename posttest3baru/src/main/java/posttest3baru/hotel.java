package posttest3baru;

    public class hotel {
        private String name;
        private int harga;
        private int nomer;

     public hotel(String name, int harga,int nomer) {
        this.name = name;
        this.harga = harga;
        this.nomer = nomer;
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
     /**
     * @param name the name to set
     */
     public void setName(String name) {
        this.name = name;
     }
     /**
     * @param harga the harga to set
     */
     public void setHarga(int harga) {
        this.harga = harga;
     }
     /**
     * @param nomer the nomer to set
     */
     public void setNomer(int nomer) {
            this.nomer = nomer;
           }
    }
