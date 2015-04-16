package Cajero;

import java.util.LinkedList;

public class Banco {
	private String nombreBanco;
	private LinkedList<Cuenta> misCuentas;
	private Cuenta unaCuenta;
	private long nid=456000100;
	
	public Banco(String n){
		nombreBanco=n;
		misCuentas =new LinkedList<Cuenta>();
		nid*=10;
	}
	
}
