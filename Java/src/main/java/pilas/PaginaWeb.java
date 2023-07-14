package pilas;

public class PaginaWeb {

    String url;
    String titulo;
    String dispositivo;
    String fechaCierre;

    public PaginaWeb(String url, String titulo, String dispositivo, String fechaCierre) {
        this.url = url;
        this.titulo = titulo;
        this.dispositivo = dispositivo;
        this.fechaCierre = fechaCierre;
    }

    public String getUrl() {
        return url;
    }

    public String setUrl(String url) {
        return this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String setTitulo(String titulo) {
        return this.titulo = titulo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public String setDispositivo(String dispositivo) {
        return this.dispositivo = dispositivo;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public String setFechaCierre(String fechaCierre) {
        return this.fechaCierre = fechaCierre;
    }

    @Override
    public String toString() {
        return "url=" + url + ", titulo=" + titulo + ", dispositivo=" + dispositivo + ", fechaCierre=" + fechaCierre
                + "\n";
    }
}
