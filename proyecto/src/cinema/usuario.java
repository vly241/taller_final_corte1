package cinema;
import java.util.*;
public class usuario {

	private Scanner teclado;
    private String[] nombre;
    private int[] id;
    private int n;
    private int c=1,c1=1;
    
    
    public void  crear() {
    	
    	teclado = new Scanner(System.in);
    	System.out.println("cuantos desea registrar: ");
    	n=teclado.nextInt();
    	nombre=new String [n];
    	id=new int[n];
    	for(int x=0; x<n;x++) {
    		System.out.println("ingrese el nombre del usuario "+c+" :");
        	nombre[x]=teclado.next();
        	System.out.println("ingrese la identificacion usuario"+c+" :");
        	id[x]=teclado.nextInt();
        	c++;
    	}
    	
    }

    public void imprimir() {
    	
    	for(int i=0;i<n;i++) {
    		System.out.println("nombre usuario "+c1+" :"+ nombre[i]);
        	System.out.println("identificacion usuario "+c1+" :"+ id[i]);
        	System.out.println();
        	c1++;
    	}
    	
    }




public void usuario1() {
	int opc;
	System.out.println("MENU USUARIO \n\n");
	System.out.println("ingrese el numero segun lo siguiente:\n");
	
	
	System.out.println("1). listar usuarios.");
	System.out.println("2). crear usuario");
	System.out.println("3).editar usuario");
	System.out.println("4). eliminar usuario.");
	System.out.println("5). menu principal\n");
	Scanner sc = new Scanner(System.in);
	opc = sc.nextInt();
	
	
	switch(opc) {
	
	case 1:
		imprimir();
		 usuario1();
		break;
		
	case 2:
		
	    crear();
	    usuario1();
		
		
		break;
		
	case 3:
	
	
		break;
		
	case 4:
	
	
		break;
	case 5:
		menu m = new menu();
		m.menu1();
		
		break;
		
	
		
	default:
		break;
		
	}
	sc.close();
	}

}
