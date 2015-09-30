import java.rmi.Naming;

public class Cliente{
	public static void main(String[] args){
		try{
			Operaciones opc = (Operaciones)	Naming.lookup("rmi://127.0.0.1/touchme");
			int[] x = {4, 1, 11, 13, 2, 7};

			System.out.println(opc.sumaDatos(x));
			System.out.println(opc.promedio(x));
			System.out.println(opc.desv(x));
			//System.out.println(opc.mostrarDatos(x));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}