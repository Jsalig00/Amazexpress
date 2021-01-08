package modelo;

public class Producto {

//Atributos de producto
	public int idProducto;
	public boolean vendido;
	
//Constructor
	public Producto(String nombre, String estado, String descripcion, String vendedor, String comprador, boolean vendido) {
		this.nombre = nombre;
		this.estado = estado;
		this.descripcion = descrip;
		this.vendedor = vendedor;
		this.comprador = comprador;
		this.vendido = vendido;
	}

//Getters
	public int getIdProducto() {
		return this.idProducto;
	}
	
	public boolean getVendido() {
		return this.vendido;
	}
	
    public String getNombre() {

        return this.nombre;
    }

    public String getEstado(){
        return this.estado;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

    public String getVendedor(){
        return this.vendedor;
    }

    public String getComprador(){
        return this.comprador;
    }
}
