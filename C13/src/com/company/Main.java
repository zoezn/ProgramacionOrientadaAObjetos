package com.company;

import com.company.cuentas.Cuenta;
import com.company.cuentas.CuentaCajaDeAhorro;
import com.company.cuentas.CuentaComitente;
import com.company.cuentas.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente= new Cliente(123, "Lopez", "123123", "12312311" );
        CuentaComitente clientenuevo= new CuentaComitente( cliente, 200.0, "ABC");

        clientenuevo.depositar(100.0);
        clientenuevo.extraer(200.0);
        clientenuevo.extraer(200.0, "ABC");

    }
}
