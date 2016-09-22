package parser;

import java.util.ArrayList;
import java.util.List;

public class Clase {
	
	public String nombre;
	public List<Metodo> metodos;
	
	public Clase()
	{
		metodos = new ArrayList<Metodo>();
	}
	
	public Clase(String nombre, List<Metodo> metodos)
	{
		this.nombre = nombre;
		this.metodos = metodos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Metodo> getMetodos() {
		return metodos;
	}

	public void setMetodos(List<Metodo> metodos) {
		this.metodos = metodos;
	}
	
	
}
