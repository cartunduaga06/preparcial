public class Main {

    public static void main(String[] args) {
            Capitan carlos = new Capitan("carlos", "artunduaga", "123");
            Capitan andrea = new Capitan("andrea", "dali", "124");

            Embarcacion velero1 = new Veleros(carlos, 10.,5,2020,6,7);

            velero1.navegar();
            System.out.println("\nEl velero 1 es grande: " + ((Veleros)velero1).esGrande());
                 System.out.println("\nEl velero 1 precio: " + velero1.calcularMontoAlquiler());

                 Embarcacion yate1 = new Yates(andrea,1500.,500.,2019,5,10);
                    Embarcacion yate2 = new Yates(carlos, 7500, 1500, 2021, 80, 3);
            yate1.navegar();
        System.out.println("#########################");
        System.out.println("\nEl yate 1 es más lujoso que el yate 2: " + ((Yates)yate1).compareTo(yate2));
        System.out.println("El yate 2 es más lujoso que el yate 1: " + ((Yates)yate2).compareTo(yate1));

    }
}
