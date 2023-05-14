import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloI extends UnicastRemoteObject implements  Hello {
    private static final  long serialVersionID = 1L;

    protected HelloI() throws RemoteException {
        super();
    }


    @Override
    public String Hello() throws RemoteException {
        return "ola";
    }
}
