package modelo;

public class Viedma extends Tarjeta {

	private int descuento;

	public Viedma(int saldoMin, int saldo, int nroTarjeta, int descuento) {
		super(saldoMin, saldo, nroTarjeta);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float realizarDescuentos(Pedido unPedido) {

		return (unPedido.precioTotal());

	}

}
