package package1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Hashtable;

public class Ej01 {

	public static void main(String[] args) {


		ArrayList<Integer> Alumno1=new ArrayList<>();	
		
		for(int i=0;i<3;i++) {
			
			String num1=JOptionPane.showInputDialog("Introduce la nota del alumno1");
			int num2=Integer.parseInt(num1);
			
			Alumno1.add(num2);
				System.out.print(Alumno1);
			
		}
		
		System.out.println();
		
		ArrayList<Integer> Alumno2=new ArrayList<>();	
		
		for(int i=0;i<3;i++) {
			
			String num1=JOptionPane.showInputDialog("Introduce la nota del alumno2");
			int num2=Integer.parseInt(num1);
			
			Alumno2.add(num2);
				System.out.print(Alumno2);
			
			}
		
		System.out.println();
		
		ArrayList<Integer> Alumno3=new ArrayList<>();	
		
		for(int i=0;i<3;i++) {
			
			String num1=JOptionPane.showInputDialog("Introduce la nota del alumno3");
			int num2=Integer.parseInt(num1);
			
			Alumno3.add(num2);
				System.out.print(Alumno3);
			
			}
		
		System.out.println();
		
		double media1=media(Alumno1);
		double media2=media(Alumno2);
		double media3=media(Alumno3);
			
		notas(media1, media2, media3);
		
		}
	
	public static double media (ArrayList<Integer> Alumno) {
		
		int sum=0;
		
		for (int i = 0; i < Alumno.size(); i++) {
            sum+=Alumno.get(i);    
		}
		
		double media=sum/Alumno.size();
		
		System.out.println("La media es: "+media);
		
		return media;
		
	}
	
	public static void notas (double media1, double media2, double media3) {
		
		Hashtable<String, Double> nota=new Hashtable<String, Double>();

		nota.put("Alumno1", media1);
		nota.put("Alumno2", media2);
		nota.put("Alumno3", media3);
		
		System.out.println("Las notas son: "+nota);
		
	}
		
}
	

