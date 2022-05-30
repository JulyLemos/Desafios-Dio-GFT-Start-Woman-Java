package subsistemacep;
import one.digitalinovation.singleton.SingletonFaster;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi() {
        super();
    }
    public static  CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Vitória";
    }
    public String recuperarEstado(String cep){
        return "Espírito Santo";
    }
}
