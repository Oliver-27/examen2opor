/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;

import java.time.LocalDate;

public class sim {
	public sim(int numero, int saldo, int ultimaRecarga, LocalDate fechaUltimaRecarga) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.ultimaRecarga = ultimaRecarga;
		this.fechaUltimaRecarga = fechaUltimaRecarga;
	}

	/**
	 * Description of the property numero .
	 */
	private int numero = 0;

	/**
	 * Description of the property saldo.
	 */
	private int saldo = 0;

	/**
	 * Description of the property ultimaRecarga.
	 */
	private int ultimaRecarga = 0;

	/**
	 * Description of the property fechaUltimaRecarga.
	 */
	private java.time.LocalDate fechaUltimaRecarga = null;

	// Start of user code (user defined attributes for sim)

	// End of user code

	/**
	 * The constructor.
	 */
	public sim() {
		// Start of user code constructor for sim)
		super();
		// End of user code
	}

	/**
	 * Description of the method hacerRecarga.
	 * @param cantidad 
	 */
	public int hacerRecarga(int cantidad) {
		int  ultimaRecarga= this.saldo+this.ultimaRecarga;
		return ultimaRecarga;
	}

	public int getNumero() {
		return this.numero;
	}

	/**
	 * Sets a value to attribute numero . 
	 * @param newNumero  
	 */
	public void setNumero(int newNumero) {
		this.numero = newNumero;
	}


	public int getSaldo() {
		return this.saldo;
	}

	/**
	 * Sets a value to attribute saldo. 
	 * @param newSaldo 
	 */
	public void setSaldo(int newSaldo) {
		this.saldo = newSaldo;
	}

	/**
	 * Returns ultimaRecarga.
	 * @return ultimaRecarga 
	 */
	public int getUltimaRecarga() {
		return this.ultimaRecarga;
	}

	/**
	 * Sets a value to attribute ultimaRecarga. 
	 * @param newUltimaRecarga 
	 */
	public void setUltimaRecarga(int newUltimaRecarga) {
		this.ultimaRecarga = newUltimaRecarga;
	}

	/**
	 * Returns fechaUltimaRecarga.
	 * @return fechaUltimaRecarga 
	 */
	public java.time.LocalDate getFechaUltimaRecarga() {
		return this.fechaUltimaRecarga;
	}

	/**
	 * Sets a value to attribute fechaUltimaRecarga. 
	 * @param newFechaUltimaRecarga 
	 */
	public void setFechaUltimaRecarga(java.time.LocalDate newFechaUltimaRecarga) {
		this.fechaUltimaRecarga = newFechaUltimaRecarga;
	}

	@Override
	public String toString() {
		return "sim [numero=" + numero + ", saldo=" + saldo + ", ultimaRecarga=" + ultimaRecarga
				+ ", fechaUltimaRecarga=" + fechaUltimaRecarga + "]";
	}

}
