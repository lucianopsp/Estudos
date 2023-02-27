public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume(){
        volume = ligada ? ++volume : volume;
    }
    public void diminuirVolume(){
        volume = ligada ? --volume : volume;
    }

    public void aumentarCanal(){
        canal = ligada ? ++canal : canal;
    }
    public void diminuirCanal(){
        canal = ligada ?--canal : canal;
    }

    public void selecionarCanal(int canal){
        this.canal = canal;
    }
}
