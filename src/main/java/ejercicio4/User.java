package ejercicio4;

public class User {
    private String titulo;
    private int id;
    private String categoria;


    public User(String titulo, int id, String categoria ) {
        super();
        this.titulo = titulo;
        this.id = id;
        this.categoria = categoria;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String bornDate) {
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("titulo: " + titulo);
        System.out.println("id: " + id);
        System.out.println("categoria: " + categoria);


    }
}