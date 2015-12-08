package nscc.edu.training.notnull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class cartFilter
 */
@WebFilter("/products.jsp")
public class cartFilter implements Filter {
    private List<String> cart = new ArrayList<String>();
    private List<String> price = new ArrayList<String>();
    
    /**
     * Default constructor. 
     */
    public cartFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
	    loadCart();
	   	    	   
	    request.setAttribute("cart", cart);
	    request.setAttribute("price", price);
		chain.doFilter(request, response);
	}

	public void loadCart()
	{
	    cart.clear();
	    price.clear();
	    
	    String user = "1"; // TODO link to Michaels user system
	    
	    String temp = "";
        try (BufferedReader bfr = new BufferedReader(new FileReader("C:/servers/apache-tomcat-8.0.26/wtpwebapps/NotNull/WEB-INF/cart.txt")))
           {
               while ((temp = bfr.readLine()) != null)
               {                
                   String[] data = temp.split(":");
                   if (data[0].equals(user)) {
                       cart.add(data[1]);
                       price.add(data[2]);
                   }
                       
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
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
