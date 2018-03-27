package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.nidea.pojo.Alert;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RequestDispatcher dispatch;

	private static final String USER = "admin";
	private static final String PASS = "admin";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("login.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String usuario = request.getParameter("usuario");
			String password = request.getParameter("password");

			if (USER.equalsIgnoreCase(usuario) && PASS.equals(password)) {
				dispatch = request.getRequestDispatcher("backoffice/index.jsp");
				request.setAttribute("alert", new Alert("Ongi etorri", Alert.TIPO_SUCCESS));
			} else {
				dispatch = request.getRequestDispatcher("login.jsp");
				request.setAttribute("alert",
						new Alert("Credenciales incorrectas, prueba de nuevo", Alert.TIPO_WARNING));

			}

		} catch (Exception e) {
			e.printStackTrace();
			dispatch = request.getRequestDispatcher("login.jsp");
			request.setAttribute("alert", new Alert());
		} finally {

			dispatch.forward(request, response);

		}

	}

}
