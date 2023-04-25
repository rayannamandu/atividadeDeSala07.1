package Netflix;

public class Main {
    public static void main(String[] args) {
        // cria um usuário
        Usuario usuario = new Usuario("João", "joao@gmail.com", "123456");

        // cria um filme
        Filme filme = new Filme("O Poderoso Chefão", "Francis Ford Coppola", "Marlon Brando, Al Pacino, James Caan", "Drama", "Sinopse do filme", 1972, "16 anos");

        // adiciona filme aos favoritos do usuário
        usuario.adicionarFilmeFavorito(filme);

        // tenta assistir ao filme
        if (usuario.podeAssistir(filme)) {
            System.out.println("Usuário pode assistir ao filme");
            Acesso acesso = new Acesso(usuario, filme);
            usuario.getHistorico(acesso);
        } else {
            System.out.println("Usuário não pode assistir ao filme");
        }

        // cria uma série
        Serie serie = new Serie("Friends", "David Crane, Marta Kauffman", "Jennifer Aniston, Courteney Cox, Lisa Kudrow", "Comédia", "Sinopse da série", 1994, "Livre");

        // adiciona série aos favoritos do usuário
        usuario.adicionarSerieFavorita(serie);

        // tenta assistir à série
        if (usuario.podeAssistir(serie)) {
            System.out.println("Usuário pode assistir à série");
            Acesso acesso = new Acesso(usuario, serie);
            usuario.getHistorico(acesso);
        } else {
            System.out.println("Usuário não pode assistir à série");
        }

        // remove filme dos favoritos do usuário
        usuario.removerFilmeFavorito(filme);

        // remove série dos favoritos do usuário
        usuario.removerSerieFavorita(serie);

        // imprime histórico do usuário
        System.out.println("Histórico do usuário:");
        for (Acesso acesso : usuario.getHistorico(acesso)) {
            System.out.println(acesso.getVideo().getTitulo() + " - " + acesso.getDataAcesso());
        }
    }
}
