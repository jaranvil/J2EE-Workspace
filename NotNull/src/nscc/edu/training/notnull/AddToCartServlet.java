package nscc.edu.training.notnull;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/tocart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product = request.getParameter("product");
		String price = request.getParameter("price");
		String user = "1";
		writeToFile(user+":"+product+":"+price);
		
		//request.getRequestDispatcher("products.jsp").forward(request, response);
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.sendRedirect("products.jsp");
		
		return;
		
	}
	
	public void writeToFile(String content)
	{
	    try {
            File file = new File("C:/servers/apache-tomcat-8.0.26/wtpwebapps/NotNull/WEB-INF/cart.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content + "\r\n");
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        String temp = "";
         try (BufferedReader bfr = new BufferedReader(new FileReader("C:/servers/apache-tomcat-8.0.26/wtpwebapps/NotNull/WEB-INF/cart.txt")))
            {
                while ((temp = bfr.readLine()) != null)
                {                
                    String[] data = temp.split(" ");
                    System.out.println(data[0] + " " + data[1] + " " + data[2]);
                }
            }
            catch (FileNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
	}

}