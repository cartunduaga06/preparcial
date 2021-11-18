public class Main {

    public static void main(String[] args) {
            Capitan carlos = new Capitan("carlos", "artunduaga", "123");
            Capitan andrea = new Capitan("andrea", "dali", "124");

            Embarcacion velero1 = new Veleros(carlos, 10.,5,2020,6,7);

            velero1.navegar();
            System.out.println("\nEl velero 1 es grande: " + ((Veleros)velero1).esGrande());
                 System.out.println("\nEl velero 1 precio: " + velero1.calcularMontoAlquiler());

    }
}
