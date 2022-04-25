package usuario.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Home() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuarioNombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String lugarFavorito = request.getParameter("lugarFavorito");
		String ciudad = request.getParameter("ciudad");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Nombre Usuario " + usuarioNombre + "</h1>");
		out.write("<h1>Apellido Usuario " + apellido + "</h1>");
		out.write("<h1>Lugar Favorito " + lugarFavorito + "</h1>");
		out.write("<h1>Ciudad " + ciudad + "</h1>");
		// request.getParameter("Unknown");
		if (usuarioNombre == null) {
			usuarioNombre = "Unknown";
		} else if (apellido == null) {
			apellido = "Unknown";
		} else if (lugarFavorito == null) {
			lugarFavorito = "Unknown";
		} else if (ciudad == null) {
			ciudad = "Unknown";
		}

	}

}
