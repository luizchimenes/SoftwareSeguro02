import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Musica> musicas = new ArrayList<>();

        System.out.println("-------EXERCICIO 02-------");

        System.out.println("Quantas músicas o novo álbum possui?");
        int quantidadeMusicas = scanner.nextInt();

        for (int i = 0; i < quantidadeMusicas; i++) {

            System.out.println("Digite o título da música " + (i + 1) + ":");
            String titulo = scanner.next();
            scanner.nextLine();

            System.out.println("Digite a duração da música " + (i + 1) + " em segundos:");
            int duracao = scanner.nextInt();
            scanner.nextLine();

            Musica musica = new Musica(titulo, duracao);

            musicas.add(musica);
            scanner.nextLine();
        }

        System.out.println("Digite o ano do álbum:");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do álbum:");
        String nomeAlbum = scanner.nextLine();

        Album album = new Album();
        album.setAnoLancamento(anoAlbum);
        album.setName(nomeAlbum);
        album.setMusicas(musicas);

        System.out.println("\nAlbum:");
        System.out.println("Nome do album: " + album.getName());
        System.out.println("Ano: " + album.getAnoLancamento());
        System.out.println("Músicas:");
        for (Musica musica : album.getMusicas()) {
            System.out.println("- Título: " + musica.getTitulo() + "\n Duração: " + musica.getDuracaoSegundos() + " segundos");
        }

        scanner.close();

    }
}
