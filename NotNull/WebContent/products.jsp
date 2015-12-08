<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>!null</title>
    <link rel="stylesheet" href="css/foundation.css" />
    <script src="js/vendor/modernizr.js"></script>
    
    <style>
        .nav_buttons {
	        color: #cccccc; 
	        background-color: #222222;
        }
    </style>
    
    
  </head>
  <body>
    
          <div class="row">
        <div class="large-12 columns">
       
       
      <nav class="top-bar" data-topbar>
  <ul class="title-area">
    <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
    <li class="toggle-topbar"><a href="#"><span>Menu</span></a></li>
  </ul>
  <div class="logo">
    <a href="index.html"><img src="img/null.png" /></a>
  </div>
  <section class="top-bar-section">
    <!-- Right Nav Section -->
    <ul class="center-buttons">
      <li class="divider"></li>
      <li><a href="#" class="nav_buttons" style="color: #cccccc;background-color: #222222;">Homepage</a></li>
      <li class="divider"></li>
      <li class="divider"></li>
      <li><a href="#" class="nav_buttons" style="color: #cccccc;background-color: #222222;">Products</a></li>
      <li class="divider"></li>
      <li><a href="#" class="nav_buttons" style="color: #cccccc;background-color: #222222;">Your Cart</a></li>
      <li class="divider"></li>
      <li><a href="#" class="nav_buttons" style="color: #cccccc;background-color: #222222;">Your Profile</a></li>
      <li class="divider"></li>
      <li class="divider"></li>
      <li><a href="#" class="nav_buttons" style="color: #cccccc;background-color: #222222;">Logout</a></li>
      <li class="divider"></li>
    </ul>
  </section>
</nav>
       
           
       <p>
         
     
          <div class="row">
     
       
     
            <div class="large-4 small-12 columns">
     
            
     
              <a href="#">
              <div class="panel callout radius">
 
              <h5>Your Cart</h5>
              
              <c:choose> 
	            <c:when test="${ !(cart.size() < 1) }"> 
	                <c:forEach var="x" begin="0" end="${cart.size() - 1 }">
		                
		                <table>
			                <tr>
				                <td>
				                    ${cart.get(x) }
				                </td>
				                <td>
				                    <form method="POST" action="/NotNull/tocart">
				                        <input type="hidden" value="${cart.get(x) }" name="name">
				                        <input type="hidden" value="delete" name="action">
				                        <input type="submit" value="X">
				                    </form>
				                </td>
			                </tr>
			                <tr>
                                <td>
                                    $${price.get(x) }
                                </td>
                            </tr>
		                </table>	      
		             </c:forEach>
	            </c:when>
	        </c:choose>
              
     
              </div>
              </a>
     
            </div>
     
            <div class="large-8 columns">
              <div class="row">
     
                <div class="large-4 small-6 columns">
                  <img src="img/assembly.png">
     
                  <div class="panel">
                    <h5>Visual Assembly ++</h5>
                    <h6 class="subheader">$000.00</h6>
                    
                    <form method="POST" action="/NotNull/tocart">
                        <input type="hidden" value="Visual Assembly 4.2" name="product">
                        <input type="hidden" value="111" name="price">
                        <input type="submit" class="button" value="Add To Cart">
                    </form>
                    
                  </div>
                </div>
     
                <div class="large-4 small-6 columns">
                  <img src="img/storm.png">
     
                  <div class="panel">
                    <h5>ServletStorm 4.2</h5>
                    The best IDE
                    <h6 class="subheader">$000.00</h6>
                    
                  </div>
                </div>
     
                <div class="large-4 small-6 columns">
                  <img src="img/filters.png">
     
                  <div class="panel">
                    <h5>Filters for Dummies</h5>
                    <h6 class="subheader">$000.00</h6>
                  </div>
                </div>
     
                <div class="large-4 small-6 columns">
                  <img src="http://placehold.it/500x500&text=Thumbnail">
     
                  <div class="panel">
                    <h5>Item Name</h5>
                    <h6 class="subheader">$000.00</h6>
                  </div>
                </div>
     
                <div class="large-4 small-6 columns">
                  <img src="http://placehold.it/500x500&text=Thumbnail">
     
                  <div class="panel">
                    <h5>Item Name</h5>
                    <h6 class="subheader">$000.00</h6>
                  </div>
                </div>
     
                <div class="large-4 small-6 columns">
                  <img src="http://placehold.it/500x500&text=Thumbnail">
     
                  <div class="panel">
                    <h5>Item Name</h5>
                    <h6 class="subheader">$000.00</h6>
                  </div>
                </div>
              </div>
     
         
     
     
         
              <div class="row">
                <div class="large-12 columns">
                  <div class="panel">
                    <div class="row">
     
                      <div class="large-2 small-6 columns">
                        <img src="http://placehold.it/300x300&text=Site Owner">
                      </div>
     
                      <div class="large-10 small-6 columns">
                        <strong>This Site Is Managed By<hr/></strong>
     
                        Risus ligula, aliquam nec fermentum vitae, sollicitudin eget urna. Donec dignissim nibh fermentum odio ornare sagittis
                      </div>
     
                    </div>
                  </div>
                </div>
     
         
     
              </div>
            </div>
          </div>
     
     
         
     
          <footer class="row">
            <div class="large-12 columns"><hr/>
              <div class="row">
     
                <div class="large-6 columns">
                  <p>© Copyright no one at all. Go to town.</p>
                </div>
     
                <div class="large-6 columns">
                  <ul class="inline-list right">
                    <li><a href="#">Link 1</a></li>
                    <li><a href="#">Link 2</a></li>
                    <li><a href="#">Link 3</a></li>
                    <li><a href="#">Link 4</a></li>
                  </ul>
                </div>
     
              </div>
            </div>
          </footer>
     
         
     
        </div>
      </div>
    
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
