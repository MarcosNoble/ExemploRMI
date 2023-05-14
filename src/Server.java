import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/Ola", new HelloI());
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
