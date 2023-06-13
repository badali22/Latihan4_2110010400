package penilaian;

public class NilaiAkhir {
    protected int uts, uas, tugas;
    
    public NilaiAkhir (int uts, int uas, int tugas){
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    NilaiAkhir(String m_Amin_Badali, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double hitungNilaiAkhir() {
        double nilaiAkhir = (0.4 * uts) + (0.5 * uas) + (0.1 * tugas);
        return nilaiAkhir;
    }
    
}
