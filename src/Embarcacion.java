public abstract  class Embarcacion {
    private Capitan capitan;
    private double precio;
    private double valorAdicional;
    private int anioFabricacion;
    private int eslora;
    private static final int anioLimite = 2020;

    public Embarcacion(Capitan capitan, double precio, double valorAdicional, int anioFabricacion, int eslora) {

        this.capitan = capitan;
        this.precio = precio;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public  double calcularMontoAlquiler (){
        if (anioFabricacion > anioLimite ){
            return  valorAdicional+precio;
        }else  {
            return precio;
        }

    }
    public abstract void navegar();

    public String datosCapitan() {
        return this.capitan.toString();
    }
}
