
package taller11;

public abstract class Menu {
    
    protected String nombPlato;
    protected double valorMenu;
    protected double valorInicialM;
    
    public void establecerNomPlato(String n){
        nombPlato = n;
    }
    public void establecerValorMenu(double v){
        valorMenu = v;
    }
    public void establecerValorInicialM(double vi){
        valorInicialM = vi;
    }
    
    public abstract void calcularValorTotal();
    
    public String obtenerNombPlato(){
        return nombPlato;
    }
    public double obtenerValorMenu(){
        return valorMenu;
    }
    public double obtenerValorInicialM(){
        return valorInicialM;
    }

    @Override
    public String toString() {
        String c = String.format("Nombre del plato: %s\n"
                + "Valor del menu inicial: %.2f\n"
                ,obtenerNombPlato()
                ,obtenerValorInicialM()
        );
        return c;
    }
}