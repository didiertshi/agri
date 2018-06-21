package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 * Servlet implementation class Sendemail
 */
@WebServlet(description = "send pw from db", urlPatterns = { "/Sendemail" })

public class Sendemail extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public Sendemail() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		java.sql.Connection con = null;
		String url = "jdbc:mysql://localhost:3306/vex";
		String driver ="com.mysql.jdbc.Driver";
		String userName ="enfant1";
		String password="!Muepu$2016!";
		int sumcount =0;
		String vusername;
		String vpassword;
		String vemail;
		java.sql.Statement st;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// get the variable entered on the form
		String uemail = request.getParameter("email");
		String query = "select * from accountup where email = '"+ uemail+"'";	
		
		
		// email variables
		
		// Recipient's email ID needs to be mentioned.
	      String to = "didiertshi@gmail.com";
	   // Sender's email ID needs to be mentioned
	      String from = "info@ditelnetwork.com";
	   // Assuming you are sending email from localhost
	      String host = "smtpout.secureserver.net";
	   // Get system properties
	      Properties properties = System.getProperties();
	   // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      properties.setProperty("mail.smtp.user", from);
	      properties.setProperty("mail.smtp.password", "admin");
	      properties.setProperty("mail.smtp.port", "80");
	      properties.setProperty("mail.smtp.auth", "true");
	      
	   // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties,new Authenticator() {
	    	  protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication(
                          "info@ditelnetwork.com", "admin");// Specify the Username and the PassWord
              }

          
	      });
	      
	     
		
		try {
			// Load the database driver
			Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query);
    		rs.next();
    		vusername = rs.getString(2);
    		vpassword = rs.getString(3);
    		vemail = rs.getString(8);
    		
    		to = vemail;			
						
						// add data into the database
				// email part
						
						// Create a default MimeMessage object.
				          MimeMessage message = new MimeMessage(session);
				       // Set From: header field of the header.
				          message.setFrom(new InternetAddress(from)); 
				       // Set To: header field of the header.
				          message.addRecipient(Message.RecipientType.TO,
				                                   new InternetAddress(to));
				       // Set Subject: header field
				          message.setSubject("Account info!");
				       // Now set the actual message
				          message.setText("User Name :"+vusername+" ;password :"+vpassword);
				       // Send message
				          Transport.send(message);
				          System.out.println("Sent message successfully....");   
				          out.println("Sent message successfully....");
		}catch (MessagingException mex) {
	          mex.printStackTrace();
	      }
		catch(ClassNotFoundException e){
			out.println("could not load database driver:" + e.getMessage());
			
		}catch(SQLException e){
			out.println("No record found:" + e.getMessage());
			
		}catch(Exception e){
			out.println(e);
		}finally {
			// Allways close the db connection
			try{
				if (con != null) con.close();
				
			}
			catch (SQLException ignored){
				out.println(ignored);
			}
	 }
	}

}
