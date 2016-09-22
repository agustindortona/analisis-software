package parser;

public class Metodo {

	public String nombre;
	public String cuerpoMetodo;
	public Integer cantidadLineas;
	
	public Metodo()
	{
		
	}
	
	public Integer getCantidadLineas() {
		return cantidadLineas;
	}

	public void setCantidadLineas(int cantidadLineas) {
		this.cantidadLineas = cantidadLineas;
	}

	public Metodo(String nombre, String cuerpo, int cant)
	{
		this.nombre = nombre;
		this.cuerpoMetodo = cuerpo;
		this.cantidadLineas = cant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuerpoMetodo() {
		return cuerpoMetodo;
	}

	public void setCuerpoMetodo(String cuerpoMetodo) {
		this.cuerpoMetodo = cuerpoMetodo;
	}
	
	
}
