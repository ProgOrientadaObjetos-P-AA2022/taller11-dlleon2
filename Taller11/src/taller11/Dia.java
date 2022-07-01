
package taller11;


public class Dia extends Menu{
    
    private double valorPostre;
    private double valorBebida;

    public void establecerValorPostre(double v) {
        valorPostre = v;
    }
    public void establecerValorBebida(double vB) {
        valorBebida = vB;
    }
    
    public double obtenerValorPostre() {
        return valorPostre;
    }
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialM + valorPostre + valorBebida;
    }
    

    @Override
    public String toString() {
        String cadena=String.format("Menu del dia\n%s",super.toString());
        cadena=String.format("%s"
                + "Valor Postre: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Valor Menu: %.2f\n"
                ,cadena
                ,obtenerValorPostre()
                ,obtenerValorBebida()
                ,obtenerValorMenu()
        );
        return cadena;
    }
}
