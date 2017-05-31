import java.util.*;

public class Receta 
{

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	public ArrayList<String> getConstructor1() {
		return Constructor1;
	}
	public void setConstructor1(ArrayList<String> constructor1) {
		Constructor1 = constructor1;
	}
	public ArrayList<String> getConstructor2() {
		return Constructor2;
	}
	public void setConstructor2(ArrayList<String> constructor2) {
		Constructor2 = constructor2;
	}
	String nombre;
	String ingredientes;
	String preparacion;
	
	ArrayList<String> Constructor1 = new ArrayList<String>();
	ArrayList<String> Constructor2 = new ArrayList<String>();
	
	
	public class Ingredientes
	{
		public String getCantidad() {
			return cantidad;
		}
		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		String cantidad;
		String nombre;
		
	}
	
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
