import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import javax.swing.JOptionPane;

public class Servidor{

	//private static final String 
	public static void main(String[] args){
		try{
			Operaciones opc = new OperacionesImp();
			LocateRegistry.createRegistry(1099);
			Naming.bind("touchme", opc);

			JOptionPane.showMessageDialog(null, "Servidor funcionando");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}	
}
