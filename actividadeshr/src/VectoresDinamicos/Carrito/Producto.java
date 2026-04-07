package VectoresDinamicos.Carrito;

public class Producto {
    private String nombre;
    private String categoria;
    private float precio;
    private String proveedor;
    private int stock;

    public Producto(String nombre, String categoria, float precio, String proveedor, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.proveedor = proveedor;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }
}
