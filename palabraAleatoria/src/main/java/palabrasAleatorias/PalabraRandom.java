package palabrasAleatorias;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PalabraRandom")
public class PalabraRandom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int contador; 
	private String palabraAleatoria = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	

    public PalabraRandom() {
        super();

    }

    public void init() 
	{ 
		contador = 0;
	} 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		contador++; 
		
		HttpSession session = request.getSession();

        String texto = (String) session.getAttribute("texto");
        
        session.setAttribute("texto", texto);
        PrintWriter out = response.getWriter();
		out.write("<h1>You have generated a word "  +contador+ " times"+"</h1>");
		
		
		StringBuilder salt = new StringBuilder();
		Random r = new Random();
		while (salt.length() >= 10) { 
            int index = (int) (r.nextFloat() * palabraAleatoria.length());
            salt.append(palabraAleatoria.charAt(index));
        }
        String saltStr = salt.toString();
        out.write("<h2>"+saltStr+"<h2>");
        
        out.write("<h3>The last time you generated a word was:</h3>");
		java.util.Date fecha = new java.util.Date();
		out.write(fecha.toString());
		out.close();
		out.write("<h4>"+fecha+"</h4>");
         
	}

}
