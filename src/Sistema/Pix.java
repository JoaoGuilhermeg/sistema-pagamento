package Sistema;

import java.time.LocalDateTime;

public class Pix {
    private String chavePix;
    private String nomeTitular;
    private Double valor;
    private LocalDateTime dataHoraTransferencia;

    //constructor
    public Pix (String chavePix, String nomeTitular, Double valor, LocalDateTime dataHoraTransferencia )
    {
        this.chavePix = chavePix;
        this.nomeTitular = nomeTitular;
        this.valor = valor;
        this.dataHoraTransferencia = dataHoraTransferencia;
    }

    //getters and setters
    public String getChavePix ()
    {
        return chavePix;
    }
    public void setChavePix (String chavePix)
    {
        this.chavePix = chavePix;
    }
    public String getNomeTitular ()
    {
        return nomeTitular;
    }
    public void setNomeTitular (String nomeTitular)
    {
        this.nomeTitular = nomeTitular;
    }
    public Double getValor ()
    {
        return valor;
    }
    public void setValor (Double valor)
    {
        this.valor = valor;
    }
    public LocalDateTime getDataHoraTrasnferencia ()
    {
        return dataHoraTransferencia;
    }
    public void setDataHoraTransferencia(LocalDateTime dataHoraTransferencia)
    {
        this.dataHoraTransferencia = dataHoraTransferencia;
    }
    @Override
    public String toString()
    {}
}
