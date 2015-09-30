import java.rmi.*;
import java.rmi.RemoteException;

public interface Operaciones extends Remote{
	abstract public int sumaDatos(int x[]) throws RemoteException;
	abstract public double promedio(int x[]) throws RemoteException;
	abstract public double desv(int x[]) throws RemoteException;
	//public String mostrarDatos(int x[]) throws RemoteException;
}