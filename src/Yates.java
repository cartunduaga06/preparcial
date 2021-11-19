public class Yates extends Embarcacion implements Comparable{
    private int camarotes;

    public Yates(Capitan capitan, double precio, double valorAdicional, int anioFabricacion, int eslora, int camarotes) {
        super(capitan, precio, valorAdicional, anioFabricacion, eslora);
        this.camarotes = camarotes;

    }

    @Override
    public int compareTo(Object o) {
        Yates otroYate = (Yates) o;

        return this.camarotes - otroYate.camarotes;

    }

    @Override
    public void navegar() {
        System.out.println("\nSoy un yate y estoy navegando :33");
        System.out.println("                  __/___\n" +
                "            _____/______|\n" +
                "    _______/_____\\_______\\_____\n" +
                "    \\              < < <       |\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Los datos de mi capitan son:" + datosCapitan());
    }

}
