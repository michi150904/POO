package clase1;

public class Ave extends Animal{
    private String envergadura;
    //constructor

    public Ave(){}
    public Ave(String name,int age,String envergadura){
        super(name,age);
        this.envergadura=envergadura;
    }

    //metodos accesores
    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }
    
    //metodos propios
    public void mostrarAve(){
        System.out.println("El nombre del animal es: "+getNombre()+" La edad es: "+getEdad()+"La envergadura de la ave es: "+envergadura);
    }
}
