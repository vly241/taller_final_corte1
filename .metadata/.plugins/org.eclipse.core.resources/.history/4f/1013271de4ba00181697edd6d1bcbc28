package cinema;
import java.util.*;
import cinema.menu;

public class boletas {
	
	menu p = new menu();
	//atributos
	   private Scanner sc;
	    String[] nombre_b = new String[30];
	    String[] id= new String[30];
	    String[] peli= new String[30];
	    int a;
	    int b,cont;
       int n=0;

	    public boletas() {
	        // TODO Auto-generated constructor stub
	        nombre_b[0]= "";
	        id[0]="";
	        peli[0]="";
	        a=0;
	        b=0;
	        cont=0;
	        

	    }

	    public void CrearBoleta() {
	        sc =new Scanner(System.in);
	        System.out.println("Usted decidio Crear un boleto nuevo.\n");
	        System.out.println("Ingrese el numero de usuarios que desea crear:");
	        if(a>0) {
	            b=sc.nextInt();
	            cont=a+b;
	            for(int i=a+1;i<=cont;i++) {
	                sc.nextLine();
	                System.out.println(i+".) Ingrese el nombre del boleto: ");
	                nombre_b[i]=sc.nextLine();
	                System.out.println(i+".) Ingrese el id del boleto: ");
	                id[i]=sc.nextLine();
	                System.out.println(i+".) Ingrese la pelicula a ver : ");
	                peli[i]=sc.nextLine();
	                System.out.println("");
	                n=n+b;
	            }
	        }else {
	            a=sc.nextInt();
	            for(int i=1;i<=a;i++) {
	            	sc.nextLine();
	                System.out.println(i+".) Ingrese el nombre del boleto: ");
	                nombre_b[i]=sc.nextLine();
	                System.out.println(i+".) Ingrese el id del boleto: ");
	                id[i]=sc.nextLine();
	                System.out.println(i+".) Ingrese la pelicula a ver : ");
	                peli[i]=sc.nextLine();
	                System.out.println("");
	                n=n+a;
	            }
	        }
	        System.out.println("Los boletoa se han creado con exito.");

	    }
	
	
	public void ListarBoleta() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio listar los boletos ingresados.");
		
		if(n==0) {
			System.out.println("los datos no han sido ingresados ");
		}else {
			for(int i=1;i<=n;i++) {
				System.out.println(i+".)El nombre del boleto es: "+this.nombre_b[i]);
				System.out.println(i+".)La id del boleto es: "+this.id[i]);
				System.out.println(i+".)La pelicula a ver es: "+this.peli[i]);
				System.out.println(" ");
			}
			System.out.println("Los datos de los boletos  se han mostrado correctamente.");
		}
		
	}
	
	public void EditarBoletas() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio editar los boletos.");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para editar el usuario determinado.");
		for(int i=1;i<=n;i++) {
			System.out.println(i+".)El nombre del boleto: "+this.nombre_b[i]);
			System.out.println(i+".)La id del boleto es: "+this.id[i]);
			System.out.println(i+".)La pelicula a ver es: "+this.peli[i]);
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println(i+".) Cambie el nombre del boleto: ");
		nombre_b[i]=sc.nextLine();
		System.out.println("Cambie el id de el boleto: ");
		id[i]=sc.nextLine();
		System.out.println("Cambie la pelicula a ver : ");
		peli[i]=sc.nextLine();
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}
	
	public void EliminarBoletas() {
		
		sc =new Scanner(System.in);
		System.out.println("Usted decidio eliminar los boletos: ");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para eliminar el usuario determinado.");
		for(int i=1;i<=n;i++) {
			System.out.println(i+".)El nombre del boleto es: "+this.nombre_b[i]);
			System.out.println("el id del boleto  es: "+this.id[i]);
			System.out.println("La pelicula a ver es: "+this.peli[i]);
			System.out.println(" ");
		}
		sc.nextLine();
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		nombre_b[i]="";
		id[i]="";
		peli[i]="";
		System.out.println("");
		System.out.println("Los datos han sido eliminados correctamente.");
	
	}
	
	

}
