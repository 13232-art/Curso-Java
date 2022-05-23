package juegoGreatNumber.post;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HighNumber")
public class HighNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HighNumber() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
        String texto = (String) session.getAttribute("texto");
        session.setAttribute("texto", texto);
        
        RequestDispatcher view = request.getRequestDispatcher("HighNum.jsp");
        view.forward(request, response);
        PrintWriter out = response.getWriter();     

		Random r = new Random();
		int randomInt = r.nextInt(100) + 1;
		out.write(randomInt);
		
		if (randomInt < 1) { 
			System.out.println("Numero menor a 1, demasiado bajo");
        }
		else if (randomInt > 100) {
			System.out.println("Numero mayor a 100, demasiado alto");
		}
		else {
			System.out.println("permítale al usuario jugar de nuevo");
		}
		
		//response.sendRedirect("/GreatNumber/LowNumber");

	}

}
