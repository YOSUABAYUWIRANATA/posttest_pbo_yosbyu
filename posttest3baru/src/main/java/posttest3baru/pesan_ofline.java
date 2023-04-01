package posttest3baru;
    public class pesan_ofline extends hotel {
         private int nomerresi;


    public pesan_ofline (String nama, int harga, int nomer,int nomerresi){
        super (nama, harga, nomer);
        this.nomerresi = nomerresi;

     }
     /**
     * @return the nomerresi
     */
    public int getNomerresi() {
        return nomerresi;
     }
     /**
     * @param nomerresi the nomerresi to set
     */
    public void setNomerresi(int nomerresi) {
        this.nomerresi = nomerresi;
     }
    }
