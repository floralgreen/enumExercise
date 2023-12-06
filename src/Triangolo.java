public class Triangolo extends Forma{

    private TipoForma tipoForma;
    private int base;
    private int altezza;


    public Triangolo() {
        this.tipoForma = TipoForma.TRIANGOLO;
    }

    public TipoForma getTipoForma(){
        return this.tipoForma;
    }

    public void setTipoForma(TipoForma tipoForma){
        this.tipoForma = tipoForma;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void stampaArea() {
        int area = (base * altezza)/2;
        System.out.println("L'area del " + this.tipoForma.getNome().toLowerCase() + " è: (" + this.base + " x " + this.altezza +
                ") / 2 = " + area);
    }
}
