package posttest5;

public class pesan_ofline extends hotel {
    private int nomerresi;
    
    
    public pesan_ofline (String nama, int harga, int nomer,int nomerresi){
        super (nama, harga, nomer);
        this.nomerresi = nomerresi;
        
    }

    public int getNomerresi() {
        return nomerresi;
    }

    
    
    public void setNomerresi(int nomerresi) {
        this.nomerresi = nomerresi;
    }
    
    
    
    
    @Override
    public void tampil(){
        System.out.println("\t\t\t " + jos );
        System.out.println("\nNama pemesan            : " + getName() );
        System.out.println("Harga kamar             : " + getHarga() );
        System.out.println("Nomer kamar             : " + getnomer ());
        System.out.println("Nomor Resi              : " + nomerresi);
       }
       
}
