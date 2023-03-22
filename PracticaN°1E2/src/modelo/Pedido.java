package modelo;

import java.util.List;

public class Pedido {

	private List<Bebidas> bebida;
	private List<Platos> plato;

	public Pedido(List<Bebidas> bebida, List<Platos> plato) {
		this.bebida = bebida;
		this.plato = plato;
	}

	public Double precioTotalBebidas() {
		Double total = 0.0;
		for (Bebidas unaBebida : bebida) {
			total = total + unaBebida.devolverPrecio();
		}
		return total;
	}

	public Double precioTotalPlatos() {
		Double total = 0.0;
		for (Platos unPlato : plato) {
			total = total + unPlato.devolverPrecio();
		}
		return total;
	}

	public Double precioTotal() {
		return (this.precioTotalPlatos() + this.precioTotalBebidas());
	}

}
