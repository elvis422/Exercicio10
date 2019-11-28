
public class Material {
    
    private String nome;
    private int quantidade;
    
    public Material (String n, int q ) throws QuantidadeInvalidaException{
        this.setNome(n);
        this.setQuantidade(q);
    }
    

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setQuantidade(int q) throws QuantidadeInvalidaException{
        
        if(q<0){
            
            throw new QuantidadeInvalidaException("Quantidade Inválida");
        }
        
        this.quantidade = q;
    }
    
    
}
