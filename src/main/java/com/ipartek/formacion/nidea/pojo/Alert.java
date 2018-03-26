package com.ipartek.formacion.nidea.pojo;

public class Alert {

	private String mensaje;
	private String tipo;

	// Tipos de alertas

	public static final String TIPO_DANGER = "danger";
	public static final String TIPO_WARNING = "warning";
	public static final String TIPO_SUCCESS = "success";

	public Alert() {
		super();
		this.mensaje = "Sentimos las molestias. Tenemos un error inesperado";
		this.tipo = "danger";
	}

	public Alert(String mensaje) {
		this();
		this.mensaje = mensaje;

	}

	public Alert(String mensaje, String tipo) {
		this();
		this.mensaje = mensaje;
		this.tipo = tipo;

	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
