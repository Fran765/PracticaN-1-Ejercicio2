package modelo;

import Excepciones.SaldoException;

public class DispositivoElectronico {

	private Pedido miPedido;
	private Double importeAbonar;

	public DispositivoElectronico() {
		super();
		this.importeAbonar = 0.0;
	}

	public void tomarPedido(Pedido nuevoPedido) {
		this.miPedido = nuevoPedido;
	}

	public void realizarPago(Tarjeta tarjetaDada, int propina) throws SaldoException {

		this.importeAbonar = sumarPropina(tarjetaDada.realizarDescuentos(miPedido), propina);
		tarjetaDada.efectuarPago(importeAbonar);
	}

	private Double sumarPropina(Double totalPedido, int propina) {
		return (((propina * totalPedido) / 100) + (totalPedido));
	}

	public Double devolverImporteAPagar() {
		return (this.importeAbonar);
	}

}
