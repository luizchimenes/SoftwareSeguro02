public class Musica {
    private String titulo;
    private Integer duracaoSegundos;

    public Musica() {
    }

    public Musica(String titulo, Integer duracaoSegundos) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(Integer duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }


}
