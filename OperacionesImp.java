import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.lang.Throwable;

public class OperacionesImp extends UnicastRemoteObject implements Operaciones {

	public OperacionesImp() throws RemoteException{

	}

	public int sumaDatos(int x[])throws RemoteException{
		int suma;
		suma = 0;
		for(int y : x){
			suma+=y;
		}

		return suma;
	}

	public double promedio(int x[])throws RemoteException{

		return (sumaDatos(x) / x.length);
	}

	public double desv(int x[])throws RemoteException{
		try{
		double prom;
		prom = promedio(x);

		double sum;
		sum = 0;

		for(int y : x){
			sum+=Math.pow(y - prom, 2.0);
		}

		return Math.sqrt(sum / (x.length - 1));
		}
		catch(Exception e){e.printStackTrace();}
		finally{return 0;}
	}


	public void mostrarDatos(int x[])throws RemoteException{
		for(int y : x){
			System.out.println(y);
		}
	}

}