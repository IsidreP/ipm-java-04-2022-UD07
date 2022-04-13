package package1;

import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ej02 {

	public static void main(String[] args) {
		
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
