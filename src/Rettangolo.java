public class Rettangolo extends Forma{

    private TipoFormaEnum tipoForma;
    private int base;
    private int altezza;


    public Rettangolo() {
        this.tipoForma = TipoFormaEnum.RETTANGOLO;
    }

    public TipoFormaEnum getTipoForma(){
        return this.tipoForma;
    }

    public void setTipoForma(TipoFormaEnum tipoForma){
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
        int area = base * altezza;
        System.out.println("L'area del " + this.tipoForma.getNome().toLowerCase() + " è: " + this.base + " x " + this.altezza +
                " = " + area);
    }
}
