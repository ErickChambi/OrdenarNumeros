package odenarSerie.action;

import java.io.IOException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("pit")
public class OrdenarNumeros extends ActionSupport{

//	Variables que están relacionadas con mis cajas de texto, obteniendo 
//	el valor para poder usarlas en mi método “ordenarNumeros”
	
	private String nr1,nr2,nr3,nr4,nr5,nr6,nr7,nr8,nr9;
	private String mostrarNum;
	private String mostrarNumOrdenados;
	private String mensaje1;
	private String mensaje2;
	
	//Si el método retorna “ok” entonces muestra el "ordenarNumeros.jsp"
	@Action(value="/ordenarNumeros",results={@Result(name="ok",location="/ordenarNumeros.jsp"),
			@Result(name="error",location="/ordenarNumeros.jsp")})
	
	public String ordenarNumeros()throws IOException{
		
		int v1=0,v2=0,v3=0,v4=0,v5=0,v6=0,v7=0,v8=0,v9=0;
		int n1,n2,n3,n4,n5,n6,n7,n8,n9;	

		//Validaciones
		if(nr1.matches("\\D*")&& nr1.equals("")){		
			return "error";
		}
		else if(nr2.matches("\\D*")&& nr2.equals("")){		
			return "error";
		}
		else if(nr3.matches("\\D*")&& nr3.equals("")){		
			return "error";
		}
		else if(nr4.matches("\\D*")&& nr4.equals("")){		
			return "error";
		}
		else if(nr5.matches("\\D*")&& nr5.equals("")){		
			return "error";
		}
		else if(nr6.matches("\\D*")&& nr6.equals("")){		
			return "error";
		}
		else if(nr7.matches("\\D*")&& nr7.equals("")){		
			return "error";
		}
		else if(nr8.matches("\\D*")&& nr8.equals("")){		
			return "error";
		}
		else if(nr9.matches("\\D*")&& nr9.equals("")){		
			return "error";
		}
		
		else{
			//los numeros ingresados se convierten a Int
			//para poder ordenarlos en el For
			n1 = Integer.parseInt(nr1);	
			n2 = Integer.parseInt(nr2);
			n3 = Integer.parseInt(nr3);
			n4 = Integer.parseInt(nr4);
			n5 = Integer.parseInt(nr5);
			n6 = Integer.parseInt(nr6);
			n7 = Integer.parseInt(nr7);
			n8 = Integer.parseInt(nr8);
			n9 = Integer.parseInt(nr9);
		
			//Muestra los numeros Ingresados en el mismo orden
			mensaje1 = "Numeros Ingresados";
			mostrarNum = nr1 +"\t"+ nr2 +"\t"+ nr3 +"\t"+ nr4 +"\t"
			+ nr5 +"\t"+ nr6 +"\t"+ nr7 +"\t"+ nr8 +"\t"+ nr9;
		
			//El arreglo "numeros" obtiene los valores ya convertidos en Int
			int [] numeros = {n1,n2,n3,n4,n5,n6,n7,n8,n9};
			int temporal = 0;
			//En este For se ordenan los numeros de menor a mayor
			for(int i=numeros.length-1; i>0 ; i--)
			{
				for (int j=0; j<i ; j++ ) {
					if(numeros[j] > numeros[j+1]){
						temporal = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = temporal;
					}
				}
			}
			//En este otro For se obtienen los numeros y se guardan en 
			//su variable correspondiente
			for (int i = 0; i<numeros.length ; i++) {
				
				if(i == 0)
					v1 = numeros[i];
				else if(i == 1)
					v2 = numeros[i];
				else if(i == 2)
					v3 = numeros[i];
				else if(i == 3)
					v4 = numeros[i];
				else if(i == 4)
					v5 = numeros[i];
				else if(i == 5)
					v6 = numeros[i];
				else if(i == 6)
					v7 = numeros[i];
				else if(i == 7)
					v8 = numeros[i];
				else if(i == 8)
					v9 = numeros[i];	
			}
			//Muestra los numeros ya Ordenados
			mensaje2 = "Numeros Ordenados";
			mostrarNumOrdenados = ""+v1+"\t"+v2+"\t"+v3+"\t"+v4+"\t"+
								 v5+"\t"+v6+"\t"+v7+"\t"+v8+"\t"+v9;
		
			return "ok";
		  }
	}

	
	
	
	
	
	
	
	
	
	//-------------------------Metodos Get y Set-----------------------//
	
	public String getMostrarNum() {
		return mostrarNum;
	}

	public void setMostrarNum(String mostrarNum) {
		this.mostrarNum = mostrarNum;
	}

	public String getMostrarNumOrdenados() {
		return mostrarNumOrdenados;
	}

	public void setMostrarNumOrdenados(String mostrarNumOrdenados) {
		this.mostrarNumOrdenados = mostrarNumOrdenados;
	}

	public String getNr1() {
		return nr1;
	}

	public void setNr1(String nr1) {
		this.nr1 = nr1;
	}

	public String getNr2() {
		return nr2;
	}

	public void setNr2(String nr2) {
		this.nr2 = nr2;
	}

	public String getNr3() {
		return nr3;
	}

	public void setNr3(String nr3) {
		this.nr3 = nr3;
	}

	public String getNr4() {
		return nr4;
	}

	public void setNr4(String nr4) {
		this.nr4 = nr4;
	}

	public String getNr5() {
		return nr5;
	}

	public void setNr5(String nr5) {
		this.nr5 = nr5;
	}

	public String getNr6() {
		return nr6;
	}

	public void setNr6(String nr6) {
		this.nr6 = nr6;
	}

	public String getNr7() {
		return nr7;
	}

	public void setNr7(String nr7) {
		this.nr7 = nr7;
	}

	public String getNr8() {
		return nr8;
	}

	public void setNr8(String nr8) {
		this.nr8 = nr8;
	}

	public String getNr9() {
		return nr9;
	}

	public void setNr9(String nr9) {
		this.nr9 = nr9;
	}

	public String getMensaje1() {
		return mensaje1;
	}

	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}
	public String getMensaje2() {
		return mensaje2;
	}
	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}
	

}
