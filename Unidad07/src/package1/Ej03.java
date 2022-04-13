package package1;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ej03 {

	public static void main(String[] args) {

		Hashtable<String, Integer> c1=inicio1();
		Hashtable<String, Integer> c2=inicio2();
		
		int control=0;
		//Loop:{
		while (control==0) {
		String num1 = JOptionPane.showInputDialog("Que quieres hacer? \n(1) Agregar producto \n(2) Actualizar producto \n(3) Visualizar un productos \n(4)Visualizar todos los productos \n(5)Salir \nPon el numero");

		switch (num1) {
		case "1":
			agregarProducto(c1, c2);
			break;// Loop;
		case "2":
			actualizarCantidadProducto(c1, c2);
			break;// Loop;
		case "3":
			visualizarUnProducto(c1, c2);
			break;// Loop;
		case "4":
			visualizarTodosProductos(c1, c2);
			break;// Loop;
		default: 
			control=1;
			System.out.println("Pon 1, 2, 3 o 4");
		}
		}
	}
		

//}

	public static Hashtable<String, Integer> inicio1() {

		Hashtable<String, Integer> productoPrecio = new Hashtable<String, Integer>();

		productoPrecio.put("camisa", 10);
		productoPrecio.put("camiseta", 15);
		productoPrecio.put("abrigo", 20);
		productoPrecio.put("chaqueta", 8);
		productoPrecio.put("pantalon", 5);
		productoPrecio.put("calcetines", 7);
		productoPrecio.put("gorro", 2);
		productoPrecio.put("sudadera", 3);
		productoPrecio.put("bufanda", 4);
		productoPrecio.put("gorra", 4);

		
		return productoPrecio;
	}
		public static Hashtable<String, Integer> inicio2() {

		Hashtable<String, Integer> productoCantidades = new Hashtable<String, Integer>();

		productoCantidades.put("camisa", 100);
		productoCantidades.put("camiseta", 150);
		productoCantidades.put("abrigo", 200);
		productoCantidades.put("chaqueta", 125);
		productoCantidades.put("pantalon", 150);
		productoCantidades.put("calcetines", 200);
		productoCantidades.put("gorro", 300);
		productoCantidades.put("sudadera", 130);
		productoCantidades.put("bufanda", 400);
		productoCantidades.put("gorra", 250);

		
		return productoCantidades;

	}

	public static void agregarProducto(Hashtable<String, Integer> c1, Hashtable<String, Integer> c2) {
		
		System.out.println("productos ya creados " + c1.keySet());
		
		String s1 = JOptionPane.showInputDialog("Que producto quieres agregar \nComprueba que no esté en la lista?");
		String n1 = JOptionPane.showInputDialog("Pon el precio");
		int n2=Integer.parseInt(n1);
		String n3 = JOptionPane.showInputDialog("Pon la cantidad");
		int n4=Integer.parseInt(n3);
		
		c1.put(s1, n2);
		c2.put(s1, n4);
		
		System.out.println("producto-precio " + c1);
		System.out.println("producto-cantidad " + c2);
	}

	public static void actualizarCantidadProducto(Hashtable<String, Integer> c1, Hashtable<String, Integer> c2) {

		System.out.println("Productos disponibles " + c1.keySet());
		
		String s2 = JOptionPane.showInputDialog("Que producto quieres actualizar? \nComprueba que esté en la lista");
		String n5 = JOptionPane.showInputDialog("Pon el precio");
		int n6=Integer.parseInt(n5);
		String n7 = JOptionPane.showInputDialog("Pon la cantidad");
		int n8=Integer.parseInt(n7);
		
		c1.replace(s2, n6);
		c2.replace(s2, n8);
		
		System.out.println("producto-precio " + c1);
		System.out.println("producto-cantidad " + c2);
	}
	
	public static void visualizarUnProducto (Hashtable<String, Integer> c1, Hashtable<String, Integer> c2) {
		
		System.out.println("Productos disponibles " + c1.keySet());
		
		String num1 = JOptionPane.showInputDialog("Que producto quieres visualizar?");
		
		System.out.println("El precio es: "  + c1.get(num1));
		System.out.println("Cantidad disponible: "  + c2.get(num1));
		

		
	}

	public static void visualizarTodosProductos (Hashtable<String, Integer> c1, Hashtable<String, Integer> c2) {
		
		System.out.println("Precios de los productos: " + c1);
		System.out.println("Cantidades de los productos: " + c2);
	
		
	}
	
	

}
