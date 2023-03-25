/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_project;

/**
 *
 * @author Willy MJ
 */
public class Cuenta {
    //Creacion de atributos
    private int NoCuenta;
    private int Nip;
    private float Saldo;
    
    //Modificacion de acceso get y set

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public int getNip() {
        return Nip;
    }

    public void setNip(int Nip) {
        this.Nip = Nip;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    
    //Creacion del medodo
    public void actualizarDatos( ){
        
    }
    
}
