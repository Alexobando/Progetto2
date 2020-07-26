package mieiBean;
public class Smartphone implements java.io.Serializable
{
	private String telefono = null;
	private String memoria = null;
	private String nome = null;
	public  int costo = 0;


	public String getTelefono() {
		return telefono;
	}
	public String getMemoria() {
		return memoria;
	}
	public String getNome() {
		return nome;
	}
	public void setTelefono(String telefono) {
		this.nome = telefono;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public void setNome(String Nome) {
		this.nome = nome;
	}
	//calcolo costo smartphone
	public int setCosto(int costo){
	switch(telefono) {

	  case "Samsung s10":
	   costo+=800;
	   switch(memoria) {
		   case "64gb":
		   	   costo+=50;
		   	break;
		   	case "128gb":
			   costo+=100;
		   	break;
		   	case "256gb":
		       costo+=300;
		   	break;


		   	   }


	    break;

	  case "Samsung s10+":
	   costo+=1000;
	   switch(memoria) {
		   case "64gb":
		   		   	   costo+=70;
		   		   	break;
		   		   	case "128gb":
		   			   costo+=120;
		   		   	break;
		   		   	case "256gb":
		   		       costo+=230;
		   	break;

	   }
	  break;
	  case "Samsung s20":
		costo+=1150;
		switch(memoria) {
			case "64gb":
					   	   costo+=80;
					   	break;
					   	case "128gb":
						   costo+=140;
					   	break;
					   	case "256gb":
					       costo+=270;
		   	break;

		}
	  break;
	  case "Samsung s20 ultra":
		costo+=1200;
		switch(memoria) {
			case "64gb":
					   	   costo+=100;
					   	break;
					   	case "128gb":
						   costo+=150;
					   	break;
					   	case "256gb":
					       costo+=300;
		   	break;

		}
	  break;
	  case "Iphone 11":
	  	 costo+=890;
	  	 switch(memoria) {
			 case "64gb":
			 		   	   costo+=10;
			 		   	break;
			 		   	case "128gb":
			 			   costo+=100;
			 		   	break;
			 		   	case "256gb":
			 		       costo+=300;
		   	break;

		 }
	  break;
	  case "Iphone 11 pro":
	  	 costo+=1100;
	  	 switch(memoria) {
			 case "64gb":
			 		   	   costo+=50;
			 		   	break;
			 		   	case "128gb":
			 			   costo+=190;
			 		   	break;
			 		   	case "256gb":
			 		       costo+=350;
		   	break;

		 }
	  break;
}
return costo;
}
}


