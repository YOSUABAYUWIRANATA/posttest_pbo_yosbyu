
package yosua;


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

    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Nomor Resi              : " + nomerresi);
       }
    
    // overloading
    public void tampil(boolean showID){
        if(showID) tampil();
        else super.tampil();
    }
    
}
