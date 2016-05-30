/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.saratapuy.pacientes;

/**
 *
 * @author Usuario
 */
public class clsPacientes {
   public enum  sexo{masculino, femenino};
   private int _ID;
   private String _Nombre;
   private float _Peso;
   private boolean _Seguro;
   private sexo _Sexo;

    public clsPacientes() {
    }

    public clsPacientes(int _ID, String _Nombre, float _Peso, boolean _Seguro, sexo _Sexo) {
        this._ID = _ID;
        this._Nombre = _Nombre;
        this._Peso = _Peso;
        this._Seguro = _Seguro;
        this._Sexo = _Sexo;
    }

   
    public int ID() {
        return _ID;
    }

    public void ID(int ID) {
        this._ID = ID;
    }

    public String Nombre() {
        return _Nombre;
    }

    public void Nombre(String Nombre) {
        this._Nombre = Nombre;
    }

    public float Peso() {
        return _Peso;
    }

    public void Peso(float Peso) {
        this._Peso = Peso;
    }

    public boolean Seguro() {
        return _Seguro;
    }

    public void Seguro(boolean Seguro) {
        this._Seguro = Seguro;
    }

    public sexo Sexo() {
        return _Sexo;
    }

    public void Sexo(sexo Sexo) {
        this._Sexo = Sexo;
    }
   
}
