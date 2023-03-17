package modelo;

import Excepciones.SaldoException;

public class DispositivoElectronico {

	private Pedido miPedido;
	private float importeAbonar;

	public DispositivoElectronico() {
		super();
		this.importeAbonar = 0;
	}

	public void tomarPedido(Pedido nuevoPedido) {
		this.miPedido = nuevoPedido;
	}

	public void realizarPago(Tarjeta tarjetaDada, int propina) throws SaldoException {

		this.importeAbonar = sumarPropina(tarjetaDada.realizarDescuentos(miPedido), propina);
		tarjetaDada.efectuarPago(importeAbonar);
	}

	private float sumarPropina(float totalPedido, int propina) {
		return ((propina * totalPedido) / 100);
	}

	public float devolverImporteAPagar() {
		return (this.importeAbonar);
	}

}
