public class Capitan {
    public Capitan(String nombre, String apellido, String matriculaDeNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    private String nombre;
    private String apellido;
    private String matriculaDeNavegacion;

    @Override
    public String toString() {
        return "\nCapitan" +
                "\n\tNombre: '" + this.nombre + "'" +
                "\n\tApellido: '" + this.apellido + "'" +
                "\n\tMatricula de Navegacion: " + this.matriculaDeNavegacion;
    }

}
