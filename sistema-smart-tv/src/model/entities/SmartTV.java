package model.entities;

public class SmartTV {

    private boolean ligada;

    private int canal;

    private int volume;

    public SmartTV(boolean ligada, int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public boolean getLigada(){
        return ligada;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getVolume(){
        return volume;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Canal: " + canal + "\n");
        sb.append("Volume: " + volume + "\n");
        sb.append("Ligada? " + ligada);
        return sb.toString();
    }
}
