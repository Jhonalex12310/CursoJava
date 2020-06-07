package EjerciciosClase6;

import java.util.ArrayList;

public class Main {
	static  String tipo_id, nombre_cli; 
	static int documento, crear = 0,opcion = 0, cod_produCliento = 0, cantidad = 0;
	static int opcion2 = 0, valor_parcial = 0 , valor_total = 0, contador = 0;
	static String mensaje="1 PARA CONTINUAR / PRESIONE 5 PARA FINALIZAR VENTA";
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a la tienda");
		Cliente  Client = new Cliente();
		Main     Mn = new Main();
		ArrayList<Cliente> AlCli = new ArrayList<Cliente>();
		ArrayList<registroVenta> AlRven = new ArrayList<registroVenta>();
		Mn.PrincipalMain();
		opcion = Client.teclado.nextInt();
		 
		while (opcion != 3) {		 
			switch (opcion) {
			case 1:
			  	for (int i = 0; i < AlCli.size(); i++) {
				  crear = 0;
				  tipo_id =  AlCli.get(i).tipodoc;
				  documento =  AlCli.get(i).numdoc;
				  if ((tipo_id == Client.tipodoc ) && (documento == Client.numdoc)){  
				  	System.out.println("cliente ya existe: " + AlCli.get(i).nombre);
			     	i = AlCli.size();
				  } else {
				  	crear = 1;
				  }
				}/*SI NO  EXISTEN REGISTRO EN EL ARREGLO*/
				  if (AlCli.size() < 1) {
				  	crear = 1;
				  }
				  /*CREAR EL CLIENTE*/
				  if (crear == 1) {
					  for (int i = 0; i < 2; i++) {
						   AlCli.add(Client);
					   	}
					  System.out.println("Cliente no existe , se creo el cliente.");
				  }
			  break;
			case 2:
				cod_produCliento = 0;
				cantidad = 0;
				Mn.ProdMain();
				System.out.println(mensaje);
				opcion2 = Client.teclado.nextInt();			
				while (opcion2 != 5) {
					System.out.println("SELECCIONE CODIGO DEL PRODUCTO:");
					cod_produCliento = Client.teclado.nextInt();
					Mn.valprod(cod_produCliento);
					System.out.println("INGRESE CANTIDAD:");
					cantidad = Client.teclado.nextInt();
					Mn.valcantidad(cod_produCliento, cantidad);					
					registroVenta rv = new registroVenta(Client.tipodoc, Client.numdoc, cod_produCliento,cantidad, valor_parcial);
					for (int i = 0; i < 4; i++) {
					   AlRven.add(contador,rv);
				   	}
					System.out.println(mensaje);
					opcion2 = Client.teclado.nextInt();	
					contador = contador  + 1;
				}
			  }
				if (opcion2 == 5) {
				/*LLAMADO */
					System.out.println("-COMPRADOR:-------------------------------------------------------------------------------------");
					System.out.println("-Tipo Documento: " +Client.tipodoc);
					System.out.println("-Documento: "+ Client.numdoc);
					System.out.println("-Nombre: " +Client.nombre);
					System.out.println("||--Codigo Producto--||--Nombre Producto--||--Cantidad--||--Valor Unitario--||--Valor Total--||");
					for (int i = 0; i < contador; i++) {
						cod_produCliento = AlRven.get(i).codigoProducto ;
						System.out.print("----------"+cod_produCliento + "----------------");
						Mn.nomProduCliento(cod_produCliento);
						System.out.print( "----------"+ AlRven.get(i).getcantidad() +"-------" );
						Mn.valprodUni(cod_produCliento);
						System.out.println("----------"+ AlRven.get(i).gettotal());
						valor_total= valor_total + AlRven.get(i).gettotal();
					}
					System.out.print("-TOTAL COMPRA:----------");
					System.out.println("$"+valor_total);
					System.out.println("--------------------------------------------------");
					System.out.println("");
				 } 
			contador = 0;
			opcion2=0;
			Mn.PrincipalMain();
			opcion = Client.teclado.nextInt();
			}
	}
		
	public void PrincipalMain(){
		 System.out.println("1. Consultar cliente.");
		 System.out.println("2. Vender.");
		 System.out.println("3. Salir.");
	}
	
	public void ProdMain(){
		System.out.println("  PRODUCTOS A LA VENTA : ");
	    for (Productos Prod : Productos.values())
	        System.out.println(Prod.getCodigoProducto() + ": " + Prod);
	}

	public void valprod(int codigo ){
		System.out.println("VALOR PRODUCTO: ");
	    for (Productos Prod : Productos.values())
	       if  (Prod.getCodigoProducto() == codigo)    
				System.out.println(Prod.getCodigoProducto() + ": " + Prod + " Valor: " +Prod.getValorProducto());   
	}
	
	public void valprodUni(int codigo ){		
	    for (Productos Prod : Productos.values())
	       if  (Prod.getCodigoProducto() == codigo)    
				System.out.print("---------"+Prod.getValorProducto()+"----");   
	}

	public void nomProduCliento(int codigo ){
	    for (Productos Prod : Productos.values())
	       if  (Prod.getCodigoProducto() == codigo)    
	    	   System.out.print(Prod);   
	}


	public void valcantidad(int codigo , int cantidad){
		System.out.println("TOTAL COMPRA PRODUCTOS: ");
	    for (Productos Prod : Productos.values())
	       if  (Prod.getCodigoProducto() == codigo)  
	    	   valor_parcial = Prod.getValorProducto() * cantidad ;
				System.out.println(valor_parcial);         
	}

}
