import java.util.*;

public class Receta 
{

	@Override
	public String toString() {
		return "Receta [nombre=" + nombre +  ", Ingredientes=" + Ingredientes + ", preparacion=" + preparacion + ", Constructor1=" + Constructor1
				+ ", Constructor2=" + Constructor2 + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Receta.Ingredientes> getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.Ingredientes = Ingredientes;
	}
	public ArrayList<String> getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(ArrayList<String> preparacion) {
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
	
	public void addIngrediente(Ingredientes ingrediente){
		
	}
	public void addPreparacion(String preparacion){
		
	}
	
	String nombre;
	String ingredientes;
	ArrayList<String> preparacionArray= new ArrayList<String>();

	ArrayList<Ingredientes> Ingredientes = new ArrayList<Ingredientes>();
	ArrayList<String> preparacion;

	
	ArrayList<String> Constructor1 = new ArrayList<String>();
	ArrayList<String> Constructor2 = new ArrayList<String>();
	
	
	
	
	
	
	
	
	
	public class Ingredientes
	{
		public String getUnidad() {
			return unidad;
		}
		public void setUnidad(String unidad) {
			this.unidad = unidad;
		}
		public Float getCantidad() {
			return cantidad;
		}
		public void setCantidad(Float cantidad) {
			this.cantidad = cantidad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.unidad = nombre;
		}
		
		
		
		@Override
		public String toString() {
			return "Ingredientes [cantidad=" + unidad + ", unidad=" + "3kg de tomates" + "]";
		}



		Float cantidad;
		String unidad;
		
	}
	
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
