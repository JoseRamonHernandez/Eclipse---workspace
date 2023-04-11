package org.ejemplo.pojo;

public class TestPojo {

	public static void main(String[] args) {
		// INSTANCIA DE LA CLASE PRODUCTO
		
		Producto producto = new Producto();
		
		// ASIGNAR VALORES CON (SET)
		producto.setId(100);
		producto.setNombre("PC");
		producto.setPrecio(15000.0);
		producto.setComentario("Marca HP");
		
		
		// OBTENER VALORES CON (GET)
		System.out.println(producto.getId()+", "+producto.getNombre()+ ", "+producto.getPrecio()+", "+
		producto.getComentario());
	}
	
}
