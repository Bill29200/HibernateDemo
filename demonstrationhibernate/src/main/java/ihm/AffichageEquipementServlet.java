package ihm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.EquipementManager;
import bo.Equipement;


@WebServlet("/AffichageEquipementServlet")
public class AffichageEquipementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EquipementManager manager = new EquipementManager();
		List<Equipement> equipements = manager.selectAll();
		
		 request.setAttribute("equipements",equipements);
	     request.getRequestDispatcher("/WEB-INF/JSP/accueil.jsp").forward(request, response);
			/*
			 * for (Equipement current : equipements) {
			 * System.out.println(current.toString()); }
			 */
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
