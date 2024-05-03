public class SmartTv {
    public Boolean getLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    Boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligada() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume = volume + 10;

    }

    public void abaixarVolume() {
        volume = volume - 10;

    }

    public void subirCanal() {
        canal++;

    }

    public void descerCanal() {
        canal--;
    }

}
