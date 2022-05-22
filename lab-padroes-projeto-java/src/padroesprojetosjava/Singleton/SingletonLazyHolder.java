package padroesprojetosjava.Singleton;

/*
 *  Singleton "Lazy Holder"
 *
 *  @autor Raphael
 * */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}