package com.ipartek.formacion.nidea;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import com.ipartek.formacion.nidea.model.MaterialDAO;

public class DataBaseTest {

	@Test
	public void testDriver() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			assertTrue(true);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			fail("No existe driver para mysql, ¿ Tienes el .JAR ?");
		}
	}

	@Test
	public void testConexion() {

		final String URL = "jdbc:mysql://192.168.0.42/spoty?user=alumno&password=alumno";
		try {
			Connection con = DriverManager.getConnection(URL);
			assertTrue(con != null);

		} catch (SQLException e) {
			e.printStackTrace();
			fail("No se pudo establecer conexion " + URL);
		}

	}

	@Test
	public void testMaterialDAO() {

		MaterialDAO dao = new MaterialDAO();
		assertNotNull(dao.getAll());

	}

}