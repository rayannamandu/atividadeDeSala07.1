package Netflix;

import java.util.Date;

public class Acesso {
    private Usuario usuario;
    private Video video;
    private Date dataAcesso;

    public Acesso(Usuario usuario, Serie video) {
        this.usuario = usuario;
        this.video = video;
        this.dataAcesso = new Date();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Date getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(Date dataAcesso) {
        this.dataAcesso = dataAcesso;
    }
}

