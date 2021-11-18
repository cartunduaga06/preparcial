public class Veleros extends Embarcacion{
    private int mastiles;

    public Veleros(Capitan capitan, double precio, double valorAdicional, int anioFabricacion, int eslora, int mastiles) {
        super(capitan, precio, valorAdicional, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public boolean esGrande() {
        return mastiles>4;
    }

    @Override
    public void navegar() {
        System.out.println("\nSoy un velero y estoy navegando :3");
        System.out.println("           /|\\\n" +
                "         /__| )\n" +
                "       /____| ))\n" +
                "     /______| )))\n" +
                "   /________|  )))\n" +
                "           _|____))\n" +
                "   \\======| o o /\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Los datos de mi capitan son:" + datosCapitan());
    }
}
