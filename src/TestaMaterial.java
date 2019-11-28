
public class TestaMaterial {
    
    public static void main(String [] args){
        
        try {
            Material m1= new Material ("Cimento", -2);    
        }catch(QuantidadeInvalidaException mat){
             System.out.println(mat.getMessage());
        }
        
    }
    
}
