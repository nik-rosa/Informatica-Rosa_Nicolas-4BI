public class Telefilm {
    private String nome_telefilm;
    private String genere_film;
    private boolean in_corso;
    private int[] serie;

    public Telefilm() {}

    public Telefilm(String nome_telefilm, String genere_film, boolean in_corso, int[] numero_stagioni) {
        this.nome_telefilm = nome_telefilm;
        this.genere_film = genere_film;
        this.in_corso = in_corso;
        this.numero_stagioni = getNumero_stagioni;
    }

    public int media_episodi(int [] insieme_stagioni) {
        int somma = 0; // Variabile per la somma degli episodi
        for (int numero_episodi : insieme_stagioni) { // Itera attraverso l'array di stagioni
            somma += numero_episodi; // Aggiunge il numero di episodi alla somma
        }
        return somma / insieme_stagioni.length; // Calcola e restituisce la media degli episodi
    }

    public boolean presente_in_telefilm(String nome_sceneggiatore2) {
        boolean presente = false;
        for(int numero_episodi : insieme_stagioni){
            if(nome_sceneggiatore2.equals(getNome_sceneggiatore)){
                presente = true;
            }
        }
        return presente;
    }

    public int[] bubble_stagioni(int[] insieme_stagioni) {
        int n = insieme_stagioni.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (insieme_stagioni[j] > insieme_stagioni[j + 1]) {
                    // Scambia insieme_stagioni[j] e insieme_stagioni[j+1]
                    int temp = insieme_stagioni[j];
                    insieme_stagioni[j] = insieme_stagioni[j + 1];
                    insieme_stagioni[j + 1] = temp;
                }
            }
        }
        return insieme_stagioni;
    }



    public String getNome_telefilm() {
        return nome_telefilm;
    }

    public String getGenere_film() {
        return genere_film;
    }

    public boolean isIn_corso() {
        return in_corso;
    }

    public int getNumero_stagioni() {
        return numero_stagioni;
    }

    @Override
    public String toString() {
        return "Telefilm{" +
                "nome_telefilm='" + nome_telefilm + '\'' +
                ", genere_film='" + genere_film + '\'' +
                ", in_corso=" + in_corso +
                ", numero_stagioni=" + numero_stagioni +
                '}';
    }
}