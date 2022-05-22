package padroesprojetosjava.Singleton;

/*
 *  Singleton "apressado"
 *
 *  @autor Raphael
 * */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
