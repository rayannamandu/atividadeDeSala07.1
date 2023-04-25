package Netflix;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Filme> filmesFavoritos;
    private List<Serie> seriesFavoritas;
    private List<Acesso> historico;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.filmesFavoritos = new ArrayList<>();
        this.seriesFavoritas = new ArrayList<>();
        this.historico = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean verificaSenha(String senha) {
        return this.senha.equals(senha);
    }

    public void adicionarFilmeFavorito(Filme filme) {
        if (!filmesFavoritos.contains(filme)) {
            filmesFavoritos.add(filme);
        }
    }

    public void removerFilmeFavorito(Filme filme) {
        filmesFavoritos.remove(filme);
    }

    public void adicionarSerieFavorita(Serie serie) {
        if (!seriesFavoritas.contains(serie)) {
            seriesFavoritas.add(serie);
        }
    }

    public void removerSerieFavorita(Serie serie) {
        seriesFavoritas.remove(serie);
    }

    public boolean podeAssistir(Filme filme) {
        return filme.getClassificacaoIndicativa() <= 18; // Exemplo: permitido para maiores de 18 anos
    }

    public boolean podeAssistir(Serie serie) {
        return serie.getClassificacaoIndicativa() <= 14; // Exemplo: permitido para maiores de 14 anos
    }

    public void registrarAcesso(Acesso acesso) {
        historico.add(acesso);
    }

    public List<Filme> getFilmesFavoritos() {
        return filmesFavoritos;
    }

    public List<Serie> getSeriesFavoritas() {
        return seriesFavoritas;
    }

    public List<Acesso> getHistorico(Acesso acesso) {
        return historico;
    }
}
