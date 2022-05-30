package one.digitalinovation.singleton;

//Exemplo de um Singleton fácil
//@autor TaXian-jun
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
