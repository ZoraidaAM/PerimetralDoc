
public abstract class FiguraGeometrica_ZAM {

	protected String tipoFigura;

	public FiguraGeometrica_ZAM(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
