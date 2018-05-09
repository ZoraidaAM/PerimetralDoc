
/**
  * Clase rectangulo
  * @author Zoraida Alonso Muñoz
  * @version 1.1
  */
public class Rectangulo_ZAM extends FiguraGeometrica_ZAM {
	private double l1;
	private double l2;
	
	/**
	  * Metodo para definir un rectangulo
	  * @param tipoFigura (rectangulo, circulo o triangulo)
	  * @param lG longitud lado grande
	  * @param lP longitud lado pequeño
	  */
	public Rectangulo_ZAM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	  * Metodo que calcula el area de un rectangulo
	  * @param l1 longitud lado grande
	  * @param l2 longitud lado pequeño
	  */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	  * Metodo que calcula el perimetro de un rectangulo
	  * @param l1 longitud lado grande
	  * @param l2 longitud lado pequeño
	  */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
