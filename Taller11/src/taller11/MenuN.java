
package taller11;

public class MenuN extends Menu{
    
    private double valorPorcionHelada;
    private double valorPorcionPastel;

    public void establecerValorPorcionHelada(double v) {
        valorPorcionHelada = v;
    }
    public void establecerValorPorcionPastel(double va) {
        valorPorcionPastel = va;
    }

    public double obtenerValorPorcionHelada() {
        return valorPorcionHelada;
    }
    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialM + valorPorcionHelada + valorPorcionPastel;
    }   

    @Override
    public String toString() {
        String c = String.format("Menu de Ninos\n%s\n"
                , super.toString()
        );
        c = String.format("%s\n"
                + "Valor Porcion Helado: %.2f\n"
                + "Valor Porcion Pastel: %.2f\n"
                + "Valor Menu: %.2f\n"
                ,c
                ,obtenerValorPorcionHelada()
                ,obtenerValorPorcionPastel()
                ,obtenerValorMenu()
        );
        return c;
    }
}