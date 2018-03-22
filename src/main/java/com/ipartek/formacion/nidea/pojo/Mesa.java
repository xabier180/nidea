//1.Definición package
package com.ipartek.formacion.nidea.pojo;

//2. Imports => Ahora mismo no tenemos ninguno

//3. Definición de la clase
public class Mesa {

	// Precio en €
	public static final int PRECIO_PATA = 1;

	public static final int PRECIO_M2 = 5;
	public static final int PRECIO_MATERIAL_MADERA = 4;
	public static final int PRECIO_MATERIAL_ACERO = 6;
	public static final int PRECIO_MATERIAL_ALUMINIO = 5;
	public static final int PRECIO_MATERIAL_PLASTICO = 2;
	public static final int PRECIO_COLOR_CUSTOM = 23;
	public static final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	public static final int MATERIAL_MADERA = 1;
	public static final int MATERIAL_ACERO = 2;
	public static final int MATERIAL_ALUMINIO = 3;
	public static final int MATERIAL_PLASTICO = 4;

	// 4. Atributos. Siempre van a ser private
	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;

	/*
	 * 5. Métodos 5.1 Constructores 5.2 Getters & Setters 5.3 Otros métodos
	 */

	public Mesa() {
		super();
		this.numeroPatas = 4;
		this.dimension = 1;
		this.color = "blanco";
		this.material = MATERIAL_MADERA;
	}

	public Mesa(int material) {
		this(); // Llamar siempre al constructor por defecto
		this.material = material;
	}

	public Mesa(int material, int dimension) {
		this(material); // Llamar siempre al constructor por defecto
		this.dimension = dimension;
	}

	/**
	 * 
	 * @author Ander Uraga
	 * @param numeroPatas
	 */

	public Mesa(int numeroPatas, int dimension, String color, int material) {
		super();
		this.numeroPatas = numeroPatas;
		this.dimension = dimension;
		this.color = color;
		this.material = material;
	}

	/**
	 * Si numeroPatas < 0 asignamos valor 0, else numeroPatas
	 * 
	 * @param numeroPatas
	 *            int
	 */

	public int getNumeroPatas() {
		return this.numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas <= 0) ? 1 : numeroPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + ", dimension=" + dimension + ", color=" + color + ", material="
				+ material + "]";
	}

	/**
	 * Calculamos el precio de la mesa en funcion de los materiales usados
	 * 
	 * @see consultar todas las constantes definidas para los precios
	 * @return int precio en €
	 */

	public int getPrecio() {
		int resultado = 0;
		int precioMaterial = 0;
		int precioColor = 0;
		if (material == 1) {
			precioMaterial = PRECIO_MATERIAL_MADERA;
		}
		if (material == 2) {
			precioMaterial = PRECIO_MATERIAL_ACERO;
		}
		if (material == 3) {
			precioMaterial = PRECIO_MATERIAL_ALUMINIO;
		}
		if (material == 4) {
			precioMaterial = PRECIO_MATERIAL_PLASTICO;
		}
		if (PRECIO_COLOR_NAME_CUSTOM.equalsIgnoreCase(this.color)) {
			precioColor = 23;
		} else {
			precioColor = 0;
		}
		resultado = numeroPatas * PRECIO_PATA + dimension * PRECIO_M2 + precioColor + precioMaterial;
		return resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + dimension;
		result = prime * result + material;
		result = prime * result + numeroPatas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (dimension != other.dimension)
			return false;
		if (material != other.material)
			return false;
		if (numeroPatas != other.numeroPatas)
			return false;
		return true;
	}

}
