package cinema;
import java.util.*;
import cinema.menu;


public class cinema {
	
	private Scanner teclado;
	private int identificacion;
	private int contraseña;
	private int identificacionval=100;
	private int contraseñaval=123;
	
	
	public cinema() {
		
	   	 teclado=new Scanner(System.in);
	     System.out.println("INICIAR SESION ");
	     System.out.println("Ingrese su identificacion: ");
	     identificacion=teclado.nextInt();
	     System.out.println("Ingrese su contraseña: ");
	     contraseña=teclado.nextInt();
	     
	   	}
	
	  
	
	public void validacion(){
		if((identificacion==identificacionval)&&(contraseña==contraseñaval)) {
			System.out.println("\n");
			System.out.println("!Se ha ingresado con exito al sistema¡");
			for (int i=0; i<5; i++) {
				
				   System.out.println();
				
				}
			menu m = new menu();
			m.menu1();
		
			
		}else if((identificacion!=identificacionval)&&(contraseña!=contraseñaval)){
			
			for (int i=0; i<5; i++) {
				
				   System.out.println();
				
				}
		
			System.out.println("!La identificacion o contraseña ingresadas es incorrecta¡");
			System.out.println("Digite los datos pedidos nuevamente.");
			System.out.println();
			cinema c = new cinema();
			c.validacion();
			
		}
			
			
		}
		
	
	public void cerrar() {
		
	}

	public static void main(String[] args) {
		
		
		cinema cinema1 = new cinema();
		cinema1.validacion();

	}

}
