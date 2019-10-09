import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

@WebServlet(name = "ProductDiscountCalcultorServlet", urlPatterns = "/calculator")
public class ProductDiscountCalcultorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        PrintWriter writer = response.getWriter();
        String des = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount_percent"));
        float discountAmount = price * discount * 0.01f;
        float discountPrice = price - discountAmount;

        writer.println("<html>\n" +
                " <head>\n" +
                "<title>Calculator</title>\n"+
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n" +
                "</head>\n"+
                "<body>\n"+
                "<div class=\"content\">\n"+
                "    <h1>Calculator</h1>\n" +
                "      <label>Product Description:</label><br/>\n" +
                "      <label>" + des + "</label><br/>\n" +
                "      <label>List Price:</label><br/>\n" +
                "      <label>" + decimalFormat.format(price) + "</label><br/>\n" +
                "      <label>Discount Percent:</label><br/>\n" +
                "      <label>" + decimalFormat.format(discount) + "%"+"</label><br/>\n" +
                "      <label>Discount Amount:</label><br/>\n" +
                "      <label>" + decimalFormat.format(discountAmount) + "</label><br/>\n" +
                "      <label>Discount Price:</label><br/>\n" +
                "      <label>" + decimalFormat.format(discountPrice) + "</label><br/>\n" +
                "  </div>\n" +
                "  </body>\n" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
