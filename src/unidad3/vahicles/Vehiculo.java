package unidad3.vahicles;

/*
 * Representa un auto
 * @author mat490
 * @version 1.0
 */
public class Vehiculo {
    public String tipo;
    public String marca;
    public String modelo;
    protected int kilometraje;
    private String matricula;

    public Vehiculo(String tipo, String marca, String modelo, int kilometraje, String matricula) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.matricula = matricula;
    }

    private void cambioDeMatricula(String nuevaMatricula) {
        this.matricula = nuevaMatricula;
    }

    public void setCambioDeMatricula(String nuevaMatricula){
        cambioDeMatricula(nuevaMatricula);
    }

    public String getMatricula() {
        return this.matricula;
    }
    public int getKM(){
        return this.kilometraje;
    }
}


