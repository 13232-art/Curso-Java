package mascotas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.animal.Animal;


@WebServlet("/ServletCat")
public class ServletCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletCat() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/webapp/Cat.jsp");
		Animal animal = new Animal();
		view.forward((ServletRequest) animal, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nameCat = animal.getName();
		String breedCat = animal.getBreed();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("Your "+breedCat+ " cat, " +nameCat +"looked at you with some affection. You think.");
	}

}
