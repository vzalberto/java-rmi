public class PruebaOperaciones{
	public static void main(String[] arg){
		int[] x = {4, 1, 11, 13, 2, 7};

		OperyacionesImp oi = new OperacionesImp();

		System.out.println("Suma: " + oi.sumaDatos(x));
		System.out.printf("Promedio: %.2f", oi.promedio(x));
		System.out.printf("Desviacion: %.2f", oi.desv(x));

		s.mostrarDatos(x);

	}

}