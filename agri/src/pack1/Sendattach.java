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
@WebServlet(description = "send pw from db", urlPatterns = { "/Sendattach" })

public class Sendattach extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public Sendattach() {
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
	      
	      try{
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
	       // Create the message part
	          BodyPart messageBodyPart = new MimeBodyPart();
	       // Now set the actual message
	          messageBodyPart.setText("This is message body");

	          
	       // Create a multipar message
	          Multipart multipart = new MimeMultipart();
	       // Set text message part
	         
	       // Set text message part
	          multipart.addBodyPart(messageBodyPart);
	       // Part two is attachment
	          
	          messageBodyPart = new MimeBodyPart();
	          String filename = "C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/agri_temp/report_8484906813680779464.csv";
	          DataSource source = new FileDataSource(filename);
	          messageBodyPart.setDataHandler(new DataHandler(source));
	          messageBodyPart.setFileName(filename);
	          multipart.addBodyPart(messageBodyPart);
	       // Send the complete message parts
	          message.setContent(multipart);
	       // Send message
	          Transport.send(message);
	          System.out.println("Sent message successfully....");
	          
	          
	          
	      }catch(MessagingException mex){
	    	  mex.printStackTrace();
	      }
	      
	   
	
	      
	}
}
