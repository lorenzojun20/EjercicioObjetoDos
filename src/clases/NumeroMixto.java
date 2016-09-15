/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lorenzo
 */
public class NumeroMixto {
     private int numerador;
    private int denominador;
    private int mixto;

    public NumeroMixto(int numerador, int denominador, int mixto)throws DenominadorCeroException{ 
        this.numerador = numerador;
        this.denominador = denominador;
        this.mixto = mixto;
        
        if (denominador == 0){
            throw new DenominadorCeroException();
        }
    }
    

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getMixto() {
        return mixto;
    }

    public void setMixto(int mixto) {
        this.mixto = mixto;
    }
    
    public NumeroMixto sumar (NumeroMixto f2) throws DenominadorCeroException{
        int mixto , mixto2, suma , num , den , ent , mixtoden ,mixto2den ,sumaden;
        NumeroMixto f;
        
        mixto = this.mixto * this.denominador + this.numerador ;
        mixtoden = this.denominador;
        mixto2 = f2.mixto * f2.denominador + f2.numerador;
        mixto2den = f2.denominador;
        
        suma = mixto * mixto2den + mixtoden * mixto2;
        sumaden = mixtoden * mixto2den;
        
        
        den = sumaden;
        ent = suma / sumaden;
        num = suma % ent;
        
        f = new NumeroMixto (num , den ,ent);
        return f;
    }
    public NumeroMixto Resta (NumeroMixto f2) throws DenominadorCeroException{
        int mixto , mixto2, resta , num , den , ent , mixtoden ,mixto2den ,restaden;
        NumeroMixto f;
        
        mixto = this.mixto * this.denominador + this.numerador ;
        mixtoden = this.denominador;
        mixto2 = f2.mixto * f2.denominador + f2.numerador;
        mixto2den = f2.denominador;
        
        resta = mixto * mixto2den - mixtoden * mixto2;
        restaden = mixtoden * mixto2den;
        
        
        den = restaden;
        ent = resta / restaden;
        num = resta % ent;
        
        f = new NumeroMixto (num , den ,ent);
        return f;
    }
    public NumeroMixto Multiplicacion (NumeroMixto f2) throws DenominadorCeroException{
        int mixto , mixto2, multi , num , den , mix , mixtoden ,mixto2den ,multden;
        NumeroMixto f;
        
        mixto = this.mixto * this.denominador + this.numerador ;
        mixtoden = this.denominador;
        mixto2 = f2.mixto * f2.denominador + f2.numerador;
        mixto2den = f2.denominador;
        
        multi = mixto * mixto2;
        multden = mixtoden * mixto2den;
        
        
        den = multden;
        mix = multi / multden;
        num = multi % mix;
        
        f = new NumeroMixto (num , den , mix);
        return f;
    }
    public NumeroMixto Division (NumeroMixto f2) throws DenominadorCeroException{
        int mixto , mixto2, division , num , den , mix , mixtoden ,mixto2den ,dividen;
        NumeroMixto f;
        
        mixto = this.mixto * this.denominador + this.numerador ;
        mixtoden = this.denominador;
        mixto2 = f2.mixto * f2.denominador + f2.numerador;
        mixto2den = f2.denominador;
        
        division = mixto * mixto2den;
        dividen = mixtoden * mixto2;
        
        
        den = dividen;
        mix = division / dividen;
        num = division % mix;
        
        f = new NumeroMixto (num , den ,mix);
        return f;
    }
}
