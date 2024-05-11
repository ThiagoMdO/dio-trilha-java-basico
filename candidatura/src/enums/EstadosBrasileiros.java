package enums;

public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo", 245),

    BAHIA ("BA", "Bahia", 778),

    CEARA ("CE", "Ceará", 841);

    private final String sigla;

    private final String nome;

    private final Integer numeroSerial;

    EstadosBrasileiros(String sigla, String nome, Integer numeroSerial){
        this.sigla = sigla;
        this.nome = nome;
        this.numeroSerial = numeroSerial;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public Integer getNumeroSerial(){
        return numeroSerial;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do estado: " + nome + "\n");
        sb.append("Sigla do estado: " + sigla + "\n");
        sb.append("Numero Serial do estado: " + numeroSerial);
        return sb.toString();
    }
}
