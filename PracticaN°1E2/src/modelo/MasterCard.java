package modelo;

public class MasterCard extends Tarjeta {

	private int descuento;

	public MasterCard(int saldoMin, int saldo, int nroTarjeta, int descuento) {
		super(saldoMin, saldo, nroTarjeta);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float realizarDescuentos(Pedido unPedido) {

		return ((descuento(unPedido.precioTotalPlatos(), descuento)) + (unPedido.precioTotalBebidas()));

	}

}
