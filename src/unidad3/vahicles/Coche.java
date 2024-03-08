package unidad3.vahicles;

public class Coche extends Vehiculo {
    public Coche(String tipo, String marca, String modelo, int kilometraje, String matricula) {
        super(tipo, marca, modelo, kilometraje, matricula);
    }

    @Override
    public void setCambioDeMatricula(String nuevaMatricula) {
        super.setCambioDeMatricula(nuevaMatricula);
    }


    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public int getKM() {
        return super.getKM();
    }
}
