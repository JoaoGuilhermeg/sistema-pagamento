package Sistema;

public class Produto
{
    private int codigo;
    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;

    //construtor
    public Produto(int codigo, String nome, String descricao, int quantidade, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public int getCodigo()

    {
        return codigo;
    }
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getDescricao()
    {
        return descricao;
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public int getQuantidade()
    {
        return quantidade;
    }
    public void setQuantide(int quantidade)
    {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor (double valor)
    {
        this.valor = valor;
    }

}