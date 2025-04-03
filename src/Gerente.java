public class Gerente extends EmpleadoBase{

    private String departamento;

    public Gerente(int id, String nombre, double salario, String departamento) {
        super(id, nombre, salario);
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularBono() {
        return getSalario()*0.1+500;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("=== Gerente ===");
        System.out.println("ID: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Salario: $"+getSalario());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("Bono anual: $"+calcularBono());
    }
}
