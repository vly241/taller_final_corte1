package cinema;
import java.util.*;
import cinema.usuario;
import cinema.salas;
import cinema.pelicula;
import cinema.boletas;


public class menu {

	
	public void menu1() {
		Scanner sc = new Scanner (System.in);
		int num=0;
		int op;
		
		
		usuario u=new usuario();
		salas s = new salas();
		pelicula p = new pelicula();
		boletas b = new boletas();
		
		do {
		System.out.println("		BIEMVENIDO AL MENU DEL CINEMA.  ");
		System.out.println("1.) Opciones de usuario.");
		System.out.println("2.) Opciones de sala.");
		System.out.println("3.) Opciones de pelicula.");
		System.out.println("4.) Opciones de boletos.");
		System.out.println("5.) Opciones de reservas.");
		System.out.println("6.) Salir del programa.");
		System.out.println("Escoja una opcion:");
		num=sc.nextInt();
		switch(num) {
		case 1:
			do {
				System.out.flush();
				System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE USUARIO.");
				System.out.println("1.) Listar usuarios.");
				System.out.println("2.) Crear usuarios.");
				System.out.println("3.) Editar usuarios.");
				System.out.println("4.) Eliminar usuarios.");
				System.out.println("5.) Regresar a menu anterior.");
				System.out.println("Escoja opcion:");
				op=sc.nextInt();
				switch(op) {
				case 1:
					System.out.flush();
					u.ListarUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					System.out.flush();
					u.CrearUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					System.out.flush();
					u.EditarUsuarios();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 4:
					System.out.flush();
					u.EliminarUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 5:
					//do {
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				}
			}while(op!=5);
			break;
			
			
		case 2:
			
			do {
			
			System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE SALA\n.");
			
			System.out.println("ingrese el numero segun lo siguiente:\n");
			
			System.out.println("1). listar salas.");
			System.out.println("2). crear salas");
			System.out.println("3).editar salas");
			System.out.println("4). eliminar salas.");
			System.out.println("5). menu principal");
			
			
			op = sc.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.flush();
				s.ListarSala();
				new java.util.Scanner(System.in).nextLine();
			
			
				break;
				
			case 2:
                System.out.flush();
				s.CrearSala();
				new java.util.Scanner(System.in).nextLine();
				
				break;
				
			case 3:
				
                System.out.flush();
				s.EditarSalas();
				new java.util.Scanner(System.in).nextLine();
				break;
				
			case 4:
                System.out.flush();
				s.EliminarSalas();
				new java.util.Scanner(System.in).nextLine();
		
				break;
			case 5:
				System.out.println("Usted decidio regresar al menu de inicio.");
				System.out.print("");
				new java.util.Scanner(System.in).nextLine();
			System.out.flush();
			
				break;
				
			
				
			default:
				System.out.println("Esa opcion no esta en el rango especificado.");
				new java.util.Scanner(System.in).nextLine();
			    System.out.flush();
				break;
				
			}
			}while(op!=5);
			break;
			
			
			
			
		case 3:
			
			do {
				System.out.println("USTED A DECIDIDO INGRESAR A LA OPCION DE PELICULA");
				System.out.println("ingrese el numero segun lo siguiente:\n");
				
				System.out.println("1). listar peliculas.");
				System.out.println("2). crear  pelicula");
				System.out.println("3).editar pelicula");
				System.out.println("4). eliminar pelicula.");
				System.out.println("5). menu principal");
				
				
				op = sc.nextInt();
				
				switch(op) {
				
				case 1:
					System.out.flush();
					p.ListarPelicula();
					new java.util.Scanner(System.in).nextLine();
				
				
					break;
					
				case 2:
	                System.out.flush();
					p.CrearPelicula();
					new java.util.Scanner(System.in).nextLine();
					
					break;
					
				case 3:
					
	                System.out.flush();
					p.EditarPelicula();
					new java.util.Scanner(System.in).nextLine();
					break;
					
				case 4:
	                System.out.flush();
					p.EliminarPelicula();
					new java.util.Scanner(System.in).nextLine();
			
					break;
				case 5:
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
				
					break;
					
				
					
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				    System.out.flush();
					break;
					
				}
				
			}while(op!=5);
			
			
			break;
		case 4:
			
			do {
				System.out.println("USTED A DECIDIDO INGRESAR A LA OPCION DE BOLETOS\n");
				System.out.println("ingrese el numero segun lo siguiente:\n");
				
				System.out.println("1). listar boletos.");
				System.out.println("2). crear  boletos");
				System.out.println("3).editar  boletos");
				System.out.println("4). eliminar boletos.");
				System.out.println("5). menu principal\n\n");
				
				
				op = sc.nextInt();
				
				switch(op) {
				
				case 1:
					System.out.flush();
					b.ListarBoleta();
					new java.util.Scanner(System.in).nextLine();
				
				
					break;
					
				case 2:
	                System.out.flush();
					b.CrearBoleta();
					new java.util.Scanner(System.in).nextLine();
					
					break;
					
				case 3:
					
	                System.out.flush();
					b.EditarBoletas();
					new java.util.Scanner(System.in).nextLine();
					break;
					
				case 4:
	                System.out.flush();
					b.EliminarBoletas();
					new java.util.Scanner(System.in).nextLine();
			
					break;
				case 5:
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
				
					break;
					
				
					
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				    System.out.flush();
					break;
					
				}
				
			}while(op!=5);
			break;
		case 5:
			System.out.println("");
			break;
		case 6:
			System.out.println("");
			break;
		}
		}while(num!=6);
		
		
	sc.close();	
	}
	
	
}
