package one.digitalinnovation.gof;

/**
 * Singleton "encapsula"
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 * @author camilahrossii
 * 
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() { 
        return InstanceHolder.instancia;
    }
}
