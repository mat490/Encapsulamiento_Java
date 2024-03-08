package unidad3.vahicles;

public class Moto extends Vehiculo {
    public Moto(String tipo, String marca, String modelo, int kilometraje, String matricula) {
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

