package Sistema;

//bibliotecas
import java.time.LocalDateTime;

public class Cartao {
    private Double valor;
    private int numeroCartao;
    private String validadeCartao;
    private String nomeCartao;
    private Double parcela;
    private LocalDateTime dataHoraPagamento;

    //constructor
    public Cartao (double valor, int numeroCartao, String nomeCartao, String validadeCartao, Double parcela, LocalDateTime dataHoraPagamento)
    {
        this.valor = valor;
        this.numeroCartao = numeroCartao;
        this.validadeCartao = validadeCartao;
        this.nomeCartao = nomeCartao;
        this.parcela = parcela;
        this.dataHoraPagamento = dataHoraPagamento;
    }

    //getters and setters
    public Double getValor ()
    {
        return valor;
    }
    public void setValor (Double valor)
    {
        this.valor = valor;
    }
    public int getNumeroCartao ()
    {
        return numeroCartao;
    }
    public void setNumeroCArtao (int numeroCartao)
    {
        this.numeroCartao = numeroCartao;
    }
    public String getVAlidadeCartao ()
    {
        return validadeCartao;
    }
    public void setvalidadeCartao (String validadeCartao)
    {
        this.validadeCartao = validadeCartao;
    }
    public String getNomeCartao ()
    {
        return nomeCartao;
    }
    public void setNomeCartaoet(String nomeCartao)
    {
        this.nomeCartao = nomeCartao;
    }
    public Double getParcela ()
    {
        return parcela;
    }
    public void setParcela (Double parcela)
    {
        this.parcela = parcela;
    }
    public LocalDateTime getDataHoraPagamento ()
    {
        return dataHoraPagamento;
    }
    public void setDataHoraPagamento (LocalDateTime dataHoraPagamento)
    {
        this.dataHoraPagamento = dataHoraPagamento;
    }
   @Override
    public String toString()
    {}

}