public enum TipoForma {

    RETTANGOLO("Rettangolo",4),
    TRIANGOLO("Triangolo", 3);

    private String nome;
    private int lati;

    TipoForma(String nome, int lati){
        this.nome = nome;
        this.lati = lati;
    }

    public String getNome() {
        return nome;
    }

    public int getLati() {
        return lati;
    }
}
