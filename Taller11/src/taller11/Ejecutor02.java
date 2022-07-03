/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        
        ArrayList<Menu>listamenu=new ArrayList<>();
        
        //Menu del dia
        Dia mDia= new Dia();
        mDia.establecerNomPlato("Dia 001");
        mDia.establecerValorInicialM(5);
        mDia.establecerValorPostre(1);
        mDia.establecerValorBebida(1);
        mDia.calcularValorTotal();
        
        //Menu de niños
        MenuN mNinios01 = new MenuN();
        mNinios01.establecerNomPlato("Niños 01");
        mNinios01.establecerValorInicialM(2);
        mNinios01.establecerValorPorcionHelada(1);
        mNinios01.establecerValorPorcionPastel(1.50);
        mNinios01.calcularValorTotal();
        
        MenuN mNinios02 = new MenuN();
        mNinios02.establecerNomPlato("Niños 02");
        mNinios02.establecerValorInicialM(3);
        mNinios02.establecerValorPorcionHelada(1);
        mNinios02.establecerValorPorcionPastel(1.50);
        mNinios02.calcularValorTotal();
        
        //Menu economico
        Economico mEcono = new Economico();
        mEcono.establecerNomPlato("Econo 001");
        mEcono.establecerValorInicialM(4);
        mEcono.establecerPorcentajeDescuento(25);
        mEcono.calcularValorTotal();
        
        //Menu Carta
        Carta mCarta = new Carta();
        mCarta.establecerNomPlato("Carta 001");
        mCarta.establecerValorInicialM(6);
        mCarta.establecerValorGuarnicion(1.5);
        mCarta.establecerValorBebida(2);
        mCarta.establecerPorcentajeAdicional(10);
        mCarta.calcularValorTotal();
        
        // El ArrayList
        
        listamenu.add(mNinios01);
        listamenu.add(mNinios02);
        listamenu.add(mEcono);
        listamenu.add(mDia);
        listamenu.add(mCarta);
        
        Cuenta c = new Cuenta();
        
        c.establecerListaMenu(listamenu);
        c.establecerNombCli("René Elizalde");
        c.establecerIva(10);
        c.establecerValorCancelar();
        
        System.out.println("Fatura");
        System.out.println(c);
    }
    
}
