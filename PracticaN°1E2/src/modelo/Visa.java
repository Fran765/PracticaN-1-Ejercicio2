package modelo;

public class Visa extends Tarjeta {

	private int descuento;

	public Visa(int saldoMin, int saldo, int nroTarjeta, int descuento) {
		super(saldoMin, saldo, nroTarjeta);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float realizarDescuentos(Pedido unPedido) {

		return (descuento(unPedido.precioTotalBebidas(), descuento) + unPedido.precioTotalPlatos());

	}

}
