
public class TestaConversao {
    
    public static void main(String [] args){
        
        try{
            ConversorDeTemperatura temp= new ConversorDeTemperatura ();
            temp.converterParaCelsius(-459.68);
            temp.converterParaFarenheit(-273.16);
        }catch(MenorQueZeroAbsolutoException t){
             System.out.println(t.getMessage());
        }
    }
    
}
