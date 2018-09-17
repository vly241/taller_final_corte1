package cinema;
import java.util.*;
public class pelicula {
	menu p = new menu();
	//atributos
	   private Scanner sc;
	    String[] nombre_p = new String[30];
	    String[] genero= new String[30];
	    
	    int a;
	    int b,cont;
       int n=0;

	    public pelicula() {
	        // TODO Auto-generated constructor stub
	        nombre_p[0]= "";
	        genero[0]="";
	      
	        a=0;
	        b=0;
	        cont=0;
	        

	    }

	    public void CrearPelicula() {
	        sc =new Scanner(System.in);
	        System.out.println("Usted decidio adregar una pelicula nueva.");
	        System.out.println("Ingrese el numero de peliculas que desea ingresar:");
	        if(a>0) {
	            b=sc.nextInt();
	            cont=a+b;
	            for(int i=a+1;i<=cont;i++) {
	                sc.nextLine();
	                System.out.println(i+".) Ingrese el nombre del usuario: ");
	                nombre_p[i]=sc.nextLine();
	                System.out.println(i+".) Ingrese la cedula del usuario: ");
	                genero[i]=sc.nextLine();
	               
	                System.out.println("");
	                n=n+b;
	            }
	        }else {
	            a=sc.nextInt();
	            for(int i=1;i<=a;i++) {
	            	 sc.nextLine();
		                System.out.println(i+".) Ingrese el nombre del usuario: ");
		                nombre_p[i]=sc.nextLine();
		                System.out.println(i+".) Ingrese la cedula del usuario: ");
		                genero[i]=sc.nextLine();
		               
	                System.out.println("");
	                n=n+a;
	            }
	        }
	        System.out.println("Las peliculas se han agregado con exito.");

	    }
	
	
	public void ListarPelicula() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio listar las peliculas ingresados.");
		
		if(n==0) {
			System.out.println("los datos no han sido ingresados.. ");
		}else {
			for(int i=1;i<=n;i++) {
				System.out.println(i+".)El nombre de la peliculas  es: "+this.nombre_p[i]);
				System.out.println(i+".)el genero de la pelicula  es: "+this.genero[i]);
			
				System.out.println(" ");
			}
			System.out.println("Los datos de la pelicula se han mostrado correctamente.");
		}
		
	}
	
	public void EditarPelicula() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio editar las peliculas.");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para editar el usuario determinado.");
		for(int i=1;i<=n;i++) {
			System.out.println(i+".)El nombre de la pelicula es: "+this.nombre_p[i]);
			System.out.println(i+".)el genero de la pelicula  es: "+this.genero[i]);
			
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println(i+".) Cambie el nombre de la pelicula: ");
		nombre_p[i]=sc.nextLine();
		System.out.println("Cambie el genero de la pelicula: ");
		genero[i]=sc.nextLine();
		
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}
	
	public void EliminarPelicula() {
		
		sc =new Scanner(System.in);
		System.out.println("Usted decidio eliminar los usuarios: ");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para eliminar el usuario determinado.");
		for(int i=1;i<=n;i++) {
			System.out.println(i+".)El nombre de la pelicula es : "+this.nombre_p[i]);
			System.out.println("el genero de la pelicula  es: "+this.genero[i]);
			
			System.out.println(" ");
		}
		sc.nextLine();
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		nombre_p[i]="";
		genero[i]="";
		
		System.out.println("");
		System.out.println("Los datos han sido eliminados correctamente.");
	
	}
	
	
}
