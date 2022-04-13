package package1;

import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ej04 {

	public static void main(String[] args) {
		
		int control2=0;

		while (control2==0) {
		
		String num = JOptionPane.showInputDialog("Que quieres hacer? \n(1) Comprar producto \n(2) Gestion de stock \n(3) Salir \nPon el numero");
		

		switch (num) {
		case "1":
			comprar();
			break;
		case "2":
			stock();
			break;
		default: 
			control2=1;
			System.out.println("Pon 1, 2 o 3");
		}
	}
		


	}
	
	public static void comprar() {
		
		Hashtable<String, Integer> producto=new Hashtable<String, Integer>();

		producto.put("pera", 10);
		producto.put("manzana", 15);
		producto.put("melon", 20);
		producto.put("mandarina", 8);
		producto.put("melon", 5);
		producto.put("platano", 7);
		producto.put("patata", 2);
		producto.put("cebolla", 3);
		producto.put("tomate", 4);
		
		System.out.println("Productos disponibles: "+producto);
		
		Hashtable<String, Double> iva=new Hashtable<String, Double>();

		iva.put("pera", 1.21);
		iva.put("manzana", 1.04);
		iva.put("melon", 1.21);
		iva.put("mandarina", 1.04);
		iva.put("melon", 1.21);
		iva.put("platano", 1.04);
		iva.put("patata", 1.04);
		iva.put("cebolla", 1.21);
		iva.put("tomate", 1.04);
		
		//System.out.println("IVA de productos: "+iva);
		
		
		
		ArrayList<String> c1=carrito();
		ArrayList<Integer> c2=recogerPrecios(c1, producto);
		ArrayList<Double> c3=recogerIvas(c1, iva);
		ArrayList<Double> c4=precioPorIva(c2, c3);
		double c5=sumaProductos(c2);
		int c6=numeroArticulos(c1);
		double c7=sumaProductosMasIva(c4);
		imprimirInformacion(c6, c1, c3, c2, c4, c5, c7);

	}
	
	public static void stock() {
		
		Hashtable<String, Integer> c1=inicio1();
		Hashtable<String, Integer> c2=inicio2();
		
		int control=0;

		while (control==0) {
		String num1 = JOptionPane.showInputDialog(
				"Que quieres hacer? \n(1) Agregar producto \n(2) Actualizar producto \n(3) Visualizar un productos \n(4) Visualizar todos los productos \n(5) Salir \nPon el numero");

		switch (num1) {
		case "1":
			agregarProducto(c1, c2);
			break;
		case "2":
			actualizarCantidadProducto(c1, c2);
			break;
		case "3":
			visualizarUnProducto(c1, c2);
			break;
		case "4":
			visualizarTodosProductos(c1, c2);
			break;
		default: 
			control=1;
			System.out.println("Pon 1, 2, 3 o 4");
		}
		}

	}



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
	
	public static ArrayList<String> carrito () {
		
		ArrayList<String> carro=new ArrayList<>();
		
		String num1=JOptionPane.showInputDialog("cuantos productos quieres comprar?");
		int num2=Integer.parseInt(num1);
		
		for(int i=0;i<num2;i++) {
			
			String num3=JOptionPane.showInputDialog("Introduce el producto");
			carro.add(num3);
		}
		
		System.out.println("Productos del carrito: "+carro);
		
		return carro;
		
	}
	
	public static ArrayList<Integer> recogerPrecios (ArrayList<String> c1, Hashtable<String, Integer> producto) {
		
		ArrayList<Integer> precios=new ArrayList<>();
		
		for (int i = 0; i < c1.size(); i++)
			precios.add(producto.get(c1.get(i)));
			
		//System.out.println(precios);
		
		return precios;
		
	}
	
	public static ArrayList<Double> recogerIvas (ArrayList<String> c1, Hashtable<String, Double> iva) {
		
		ArrayList<Double> ivas=new ArrayList<>();
		
		for (int i = 0; i < c1.size(); i++)
			ivas.add(iva.get(c1.get(i)));
			
		//System.out.println(ivas);
		
		return ivas;
		
	}
	
	public static ArrayList<Double> precioPorIva (ArrayList<Integer> c2, ArrayList<Double> c3) {
		
		ArrayList<Double> mult=new ArrayList<>();
	    
	        for (int i = 0; i < c2.size(); i++) {
	           
	        	mult.add(c2.get(i) * c3.get(i));
	    }
	       // System.out.println("La multiplicacion es: "+mult);

	    return mult;
	}
	
	public static double sumaProductos (ArrayList<Integer> c2) {
		
		double sum=0;
		
		for (int i = 0; i < c2.size(); i++) {
            sum+=c2.get(i);    
		}
		
		
		//System.out.println("La suma es: "+sum);
		
		return sum;
		
	}
	
	public static double sumaProductosMasIva (ArrayList<Double> c4) {
		
		double sum=0;
		
		for (int i = 0; i < c4.size(); i++) {
            sum+=c4.get(i);    
		}
		
		
		//System.out.println("La suma mas IVA es: "+sum);
		
		return sum;
		
	}
	
	public static int numeroArticulos (ArrayList<String> cantidad) {
		
		int num=0;
		
		num=cantidad.size();

		//System.out.println("Cantidad de productos: "+num);
		
		return num;
		
	}

	public static void imprimirInformacion (int c6, ArrayList<String> c1, ArrayList<Double> c3, ArrayList<Integer> c2, ArrayList<Double> c4, double c5, double c7) {
		

		System.out.println("Has comprado "+c6+" productos");
		
		for(int i=0;i<c1.size();i++) {
			System.out.print("El producto llamado "+c1.get(i));
			System.out.println(" tiene un iva de "+c3.get(i)+" %");
		}
		
		for(int i=0;i<c1.size();i++) {
			System.out.print("El precio del producto llamado "+c1.get(i));
			System.out.print(" es de "+c2.get(i)+" €");
			System.out.println(" y con IVA "+c4.get(i)+" €");
		}
		
		System.out.println("La suma de los productos es: "+c5+" € mas IVA "+c7+" €");
			
		System.out.println();
		
		String n1=JOptionPane.showInputDialog("Con que cantida vas a pagar?");
		int n2=Integer.parseInt(n1);
		
		double cambio=0;
		
		cambio=n2-c7;
		
		System.out.println("El cambio es: "+cambio+" €");
		
		
	}


}
