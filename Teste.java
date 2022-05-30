package one.digitalinovation.singleton;

public class Teste {

    //Singleton
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonFaster faster = SingletonFaster.getInstancia();
        System.out.println(faster);
        faster = SingletonFaster.getInstancia();
        System.out.println(faster);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);
    }
}
