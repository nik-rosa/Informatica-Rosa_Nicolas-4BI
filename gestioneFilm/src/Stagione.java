public class Stagione {
    private int numero_episodi;
    private String nome_sceneggiatore;
    private String trama;
    private int numero_stagione;

    public Stagione() {}

    public Stagione(int numero_episodi, String nome_sceneggiatore, String trama, int numero_stagione) {
        this.numero_episodi = numero_episodi;
        this.nome_sceneggiatore = nome_sceneggiatore;
        this.trama = trama;
        this.numero_stagione = numero_stagione;
    }

    public int getNumero_episodi() {
        return numero_episodi;
    }

    public String getNome_sceneggiatore() {
        return nome_sceneggiatore;
    }

    public String getTrama() {
        return trama;
    }

    public int getNumero_stagione() {
        return numero_stagione;
    }

    @Override
    public String toString() {
        return "Stagione{" +
                "numero_episodi=" + numero_episodi +
                ", nome_sceneggiatore='" + nome_sceneggiatore + '\'' +
                ", trama='" + trama + '\'' +
                ", numero_stagione=" + numero_stagione +
                '}';
    }
 
}