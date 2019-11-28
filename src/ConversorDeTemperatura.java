
public class ConversorDeTemperatura {
    
    public double converterParaCelsius(double farenheit)throws MenorQueZeroAbsolutoException{
        if(farenheit < -459.67){
           throw new MenorQueZeroAbsolutoException("Temperatura Inválida");
        }
        double conversao= (farenheit - 32) / 1.8;
        return conversao;
    }
    
    public double converterParaFarenheit(double celsius)throws MenorQueZeroAbsolutoException{
        if(celsius < -273.15){
           throw new MenorQueZeroAbsolutoException("Temperatura Inválida");
        }
        double conversao= (celsius * 1.8) + 32;
        return conversao;
    }
}
