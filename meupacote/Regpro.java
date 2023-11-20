package txtatv;

public class Regpro {
    
    private int codigo;
    private String descricao;
    private double preco;
    private int qtd;
    private int categoria;
    private String linha;
    static private String caminhoArquivo = "C:\\temp\\Produto.txt";
    
    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

   
    
    public static String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public static void setCaminhoArquivo(String caminhoArquivo) {
        Regpro.caminhoArquivo = caminhoArquivo;
    }



    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Regpro(int codigo, String descricao, double preco, int qtd, int categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
