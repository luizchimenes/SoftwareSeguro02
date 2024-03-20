import java.util.ArrayList;

public class Album {
    private String name;
    private int anoLancamento;
    private ArrayList<Musica> musicas;

    public Album(String name, int anoLancamento, ArrayList<Musica> musicas) {
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

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
