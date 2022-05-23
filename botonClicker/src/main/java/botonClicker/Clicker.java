package botonClicker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/Clicker")
public class Clicker extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int contador; 

    public Clicker() {
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
		out.write("<h1>You have clicked this button "  +contador+ " times"+"</h1>");
        
        
	}

}
