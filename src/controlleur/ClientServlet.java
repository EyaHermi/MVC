package controlleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
String nom = request.getParameter("nomClient");
String prenom = request.getParameter("prenomClient");
String adresse = request.getParameter("adresseClient");
String telephone = request.getParameter("telephoneClient");
String email = request.getParameter("emailClient");

modele.Client client = new modele.Client();
client.Setnom(nom);
client.Setprenom(prenom);
client.setadresse(adresse);
client.settelephone(telephone);
client.setemail(email);

request.setAttribute("client", client);

this.getServletContext().getRequestDispatcher("ex3.jsp").forward(request, response);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}