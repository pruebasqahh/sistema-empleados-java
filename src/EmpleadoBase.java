public class EmpleadoBase {
    private int id;
    private String nombre;
    private double salario;

    public EmpleadoBase(int id, String nombre, double salario){
        this.id=id;
        this.nombre=nombre;
        this.salario=salario;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

    public double calcularBono(){
        return getSalario()*0.05;
    }
    public void mostrarInformacion(){
        System.out.println("=== Empleado Base ===");
        System.out.println("ID: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Salario: $"+getSalario());
        System.out.println("Bono anual: $"+calcularBono());
    }

}
