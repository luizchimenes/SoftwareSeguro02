public class Album {
    private String name;
    private int anoLancamento;
    private String[] musicas;

    public Album(String name, int anoLancamento, String[] musicas) {
        this.name = name;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String[] getMusicas() {
        return musicas;
    }

    public void setMusicas(String[] musicas) {
        this.musicas = musicas;
    }
}
