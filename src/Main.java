public class Main {
    public static void main(String[] args) {
        EmpleadoBase e = new EmpleadoBase(1, "Ana López", 3000.0);
        e.mostrarInformacion();
        System.out.println((e instanceof EmpleadoBase) ? "Es un EmpleadoBase\n" : "No es un empleado");

        Gerente g = new Gerente(2, "Carlos Ruiz", 5000.0, "Ventas");
        g.mostrarInformacion();
        System.out.println((g instanceof Gerente) ? "Es un Gerente\n" : "No es un empleado");
    }
}