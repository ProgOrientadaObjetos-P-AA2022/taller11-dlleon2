
package taller11;

import java.util.ArrayList;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        ArrayList<Menu>listamenu=new ArrayList<>();
        
        //Menu Carta
        Carta mCarta= new Carta();
        mCarta.establecerNomPlato("Pollo con champiñones");
        mCarta.establecerValorInicialM(2);
        mCarta.establecerValorGuarnicion(1.50);
        mCarta.establecerValorBebida(2.50);
        mCarta.establecerPorcentajeAdicional(10);
        mCarta.calcularValorTotal();
        
        //Menu del dia
        Dia mDia= new Dia();
        mDia.establecerNomPlato("patacones con atun");
        mDia.establecerValorInicialM(2.60);
        mDia.establecerValorPostre(1.75);
        mDia.establecerValorBebida(2.56);
        mDia.calcularValorTotal();
        
        //Menu de niños
        MenuN mNinios01 = new MenuN();
        MenuN mNinios02 = new MenuN();
        mNinios01.establecerNomPlato("salchipapas");
        mNinios01.establecerValorInicialM(3.80);
        mNinios01.establecerValorPorcionHelada(3.50);
        mNinios01.establecerValorPorcionPastel(4.50);
        mNinios01.calcularValorTotal();
        
        mNinios02.establecerNomPlato("Cereal con Leche");
        mNinios02.establecerValorInicialM(2.75);
        mNinios02.establecerValorPorcionHelada(2.50);
        mNinios02.establecerValorPorcionPastel(5.50);
        mNinios02.calcularValorTotal();

        //Menu economico
        Economico mEcono = new Economico();
        mEcono.establecerNomPlato("Arroz con huevo");
        mEcono.establecerValorInicialM(2.30);
        mEcono.establecerPorcentajeDescuento(10);
        mEcono.calcularValorTotal();
        
        
        // El ArrayList
        listamenu.add(mCarta);
        listamenu.add(mDia);
        listamenu.add(mNinios01);
        listamenu.add(mNinios02);
        listamenu.add(mEcono);
        
        Cuenta c= new Cuenta();
        
        c.establecerListaMenu(listamenu);
        c.establecerNombCli("David Leon");
        c.establecerValorCancelar();
        
        System.out.println(c);
    }
    
}