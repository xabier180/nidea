package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.nidea.pojo.Mesa;

/**
 * Servlet implementation class MesaController
 */
public class MesaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Mesa m = new Mesa();

		// Recoger parametros *** SIEMPRE String ***
		String sPatas = request.getParameter("patas");
		String sDimension = request.getParameter("dimension");
		String bColor = request.getParameter("color-checkbox");

		// Si parametros no son NULL recoger y crear mesa a medida
		if (sPatas != null) {
			int patas = Integer.parseInt(sPatas);

			m.setNumeroPatas(patas);

			int dimension = Integer.parseInt(sDimension);

			m.setDimension(dimension);
		}

		int color = Integer.parseInt(bColor);

		if (bColor.equals("false")) {
			m.setColor(color);
		}

		// Crear mesa

		// Enviar atributos a la JSP
		request.setAttribute("mesa", m);

		// Ir a la JSP
		request.getRequestDispatcher("mesa.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
