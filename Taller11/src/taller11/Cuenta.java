
package taller11;

import java.util.ArrayList;


public class Cuenta {
    private String nombCli;
    private ArrayList<Menu> listaMenu = new ArrayList<>();
    private double valorCancelar;
    private double subTotal;
    private double iva;
    
    public void establecerNombCli(String n){
        nombCli = n;
    }
    public void establecerListaMenu(ArrayList<Menu> lm){
        listaMenu = lm;
    }
    public void establecerSubTotal(double s){
        subTotal = s;
    }
    public void establecerIva(double s){
        iva = s;
    }
    public void establecerValorCancelar(){
        double ivad;
        for(int i = 0; i < listaMenu.size(); i++){
            subTotal = subTotal + listaMenu.get(i).obtenerValorMenu();
        }
        
        ivad = (iva / 100 );
        ivad = ivad * subTotal;
        valorCancelar = subTotal + ivad;
    }
    
    public String obtenerNombCli(){
        return nombCli;
    }
    public ArrayList<Menu> obtenerListaMenu(){
        return listaMenu;
    }
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    public double obtenerSubTotal(){
        return subTotal;
    }
    public double obtenerIva(){
        return iva;
    }

    @Override
    public String toString() {
        String c = String.format("Datos de la cuenta\n"
                + "Nombre del cliente: %s\n"
                ,obtenerNombCli()
        );
        
        for(int i = 0; i < obtenerListaMenu().size();i++){
            c = String.format("%s"
//                    + "%d"
                    + "%s\n"
                    ,c
//                    ,i+1
                    ,obtenerListaMenu().get(i)
            );
        }
        
        c = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total a pagar: %.2f\n"
                ,c
                ,obtenerSubTotal()
                ,iva
                ,obtenerValorCancelar()
        );
        
        return c;
    }   
}