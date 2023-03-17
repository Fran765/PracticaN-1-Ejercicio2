package modelo;

public class ComarcaPlus extends Tarjeta {

	private int descuento;

	public ComarcaPlus(int saldoMin, int saldo, int nroTarjeta, int descuento) {
		super(saldoMin, saldo, nroTarjeta);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float realizarDescuentos(Pedido unPedido) {

		return (descuento(unPedido.precioTotal(), descuento) + (unPedido.precioTotalBebidas()));

	}

}
