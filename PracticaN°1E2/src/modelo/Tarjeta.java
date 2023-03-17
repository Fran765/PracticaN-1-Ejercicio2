package modelo;

import Excepciones.SaldoException;

public abstract class Tarjeta {

	protected float saldo;
	protected int saldoMin;
	protected int nroTarjeta;

	public Tarjeta(int saldoMin, int saldo, int nroTarjeta) {

		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.nroTarjeta = nroTarjeta;
	}

	public abstract float realizarDescuentos(Pedido unPedido);

	protected void efectuarPago(float precioFinal) throws SaldoException {

		if (this.saldo - precioFinal < this.saldoMin) {
			this.saldo = this.saldo - precioFinal;

		} else {

			throw new SaldoException("Fondos negativos alcanzados.");
		}
	}

	protected float descuento(float precio, int descuento) {
		return (precio - ((descuento * precio) / 100));
	}

}
