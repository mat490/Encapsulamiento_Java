package unidad3;
import unidad3.vahicles.Coche;
import unidad3.vahicles.Moto;

public class act2{
    public static void main (String[] args) throws Exception {
         Coche jetta = new Coche("coche", "volkswagen", "jetta", 0, "ABC123");
        Moto MT = new Moto("moto", "yamaha", "MT-09", 0, "DEF456");

        System.out.println("Datos del coche: " + jetta.tipo + " " + jetta.marca + " " + jetta.modelo + " " + jetta.getKM());
        System.out.println("Matricula del coche: " + jetta.getMatricula());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Datos de la moto: " + MT.tipo + " " + MT.marca + " " + MT.modelo + " " + MT.getKM());
        System.out.println("Matricula de la moto: " + MT.getMatricula());
        System.out.println("------------------------------------------------------------------");

        jetta.setCambioDeMatricula("GHI789");
        System.out.println("Nueva matricula del coche: " + jetta.getMatricula());
    }
    
}
