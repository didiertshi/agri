package pack1;



import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.myfaces.custom.fileupload.UploadedFile;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

@ManagedBean
@ViewScoped

public class bean {
	
	private String photo_ministre;
	private String mot_ministre;
	private String gallery1_1;
	private String gallery1_2;
	private String gallery1_3;
	private String gallery1_4;
	private String gallery1_5;
	private String gallery1_6;
	
	private String gallery1_1_desc;
	private String gallery1_2_desc;
	private String gallery1_3_desc;
	private String gallery1_4_desc;
	private String gallery1_5_desc;
	private String gallery1_6_desc;
	
	private String youtube_video1;
	private String youtube_video2;
	
	private String youtube_video1_desc;
	private String youtube_video2_desc;
	
	private String user_name;
	private UploadedFile uploadeFile;
	
	private String thefile;
	
	
	
	
	
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getYoutube_video2() {
		
String query1 ="select * from agri.agri_youtube where agri_youtube_name = 'video_1_2'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                youtube_video2 ="https://www.youtube.com/embed/"+ rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return youtube_video2;
	}

	public void setYoutube_video2(String youtube_video2) {
		this.youtube_video2 = youtube_video2;
	}

	public String getYoutube_video1_desc() {
String query1 ="select * from agri.agri_youtube where agri_youtube_name = 'video_1_1'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                youtube_video1_desc = rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return youtube_video1_desc;
	}

	public void setYoutube_video1_desc(String youtube_video1_desc) {
		this.youtube_video1_desc = youtube_video1_desc;
	}

	public String getYoutube_video2_desc() {
String query1 ="select * from agri.agri_youtube where agri_youtube_name = 'video_1_2'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                youtube_video2_desc = rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return youtube_video2_desc;
	}

	public void setYoutube_video2_desc(String youtube_video2_desc) {
		this.youtube_video2_desc = youtube_video2_desc;
	}

	
	
	
	
	
	
	public String getGallery1_1_desc() {
		
       String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_1'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_1_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_1_desc;
	}

	public void setGallery1_1_desc(String gallery1_1_desc) {
		this.gallery1_1_desc = gallery1_1_desc;
	}

	public String getGallery1_2_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_2'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_2_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_2_desc;
	}

	public void setGallery1_2_desc(String gallery1_2_desc) {
		this.gallery1_2_desc = gallery1_2_desc;
	}

	public String getGallery1_3_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_3'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_3_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_3_desc;
	}

	public void setGallery1_3_desc(String gallery1_3_desc) {
		this.gallery1_3_desc = gallery1_3_desc;
	}

	public String getGallery1_4_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_4'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_4_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_4_desc;
	}

	public void setGallery1_4_desc(String gallery1_4_desc) {
		this.gallery1_4_desc = gallery1_4_desc;
	}

	public String getGallery1_5_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_5'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_5_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_5_desc;
	}

	public void setGallery1_5_desc(String gallery1_5_desc) {
		this.gallery1_5_desc = gallery1_5_desc;
	}

	public String getGallery1_6_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_6'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_6_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_6_desc;
	}

	public void setGallery1_6_desc(String gallery1_6_desc) {
		this.gallery1_6_desc = gallery1_6_desc;
	}

	
	public String getYoutube_video1() {
		
String query1 ="select * from agri.agri_youtube where agri_youtube_name = 'video_1_1'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                youtube_video1 ="https://www.youtube.com/embed/"+ rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return youtube_video1;
	}

	public void setYoutube_video1(String youtube_video) {
		this.youtube_video1 = youtube_video;
	}

	public String getGallery1_2() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_2'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_2 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_2;
	}

	public void setGallery1_2(String gallery1_2) {
		this.gallery1_2 = gallery1_2;
	}

	public String getGallery1_3() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_3'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_3 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_3;
	}

	public void setGallery1_3(String gallery1_3) {
		this.gallery1_3 = gallery1_3;
	}

	public String getGallery1_4() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_4'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_4 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_4;
	}

	public void setGallery1_4(String gallery1_4) {
		this.gallery1_4 = gallery1_4;
	}

	public String getGallery1_5() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_5'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_5 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_5;
	}

	public void setGallery1_5(String gallery1_5) {
		this.gallery1_5 = gallery1_5;
	}

	public String getGallery1_6() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_6'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_6 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_6;
	}

	public void setGallery1_6(String gallery1_6) {
		this.gallery1_6 = gallery1_6;
	}

	public String getGallery1_1() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_1'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_1 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_1;
	}

	public void setGallery1_1(String gallery1_1) {
		this.gallery1_1 = gallery1_1;
	}

	public String getMot_ministre() {
		
		String query1 ="select * from agri.agri_text where text_name = 'mot_ministre'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                mot_ministre = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return mot_ministre;
	}

	public void setMot_ministre(String mot_ministre) {
		this.mot_ministre = mot_ministre;
	}

	public String getPhoto_ministre() {
		
		String query1 ="select * from agri.agri_pic where picture_name = 'photo_ministre'";
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                photo_ministre ="/../agri_images/images/"+ rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return photo_ministre;
	}

	public void setPhoto_ministre(String photo_ministre) {
		this.photo_ministre = photo_ministre;
	}

	java.sql.Connection con = null;
	String url = "jdbc:mysql://localhost:3306/agri";
	String driver ="com.mysql.jdbc.Driver";
	String userName ="enfant1";
	String password="!Muepu$2016!";
	int sumcount =0;
	
	java.sql.Statement st;
	
	public void submit() throws Exception{
		
		 List<String> resultSetArray=new ArrayList<>();
		
		Properties props = System.getProperties();
		// Assuming you are sending email from localhost
		// Recipient's email ID needs to be mentioned.
	      String to = "didiertshi@gmail.com";
	      String host = "smtpout.secureserver.net";
	      String from = "info@ditelnetwork.com";
	      String pass ="admin";
	     
	     // props.put("mail.smtp.starttls.enable", "true");
	     // props.put("mail.smtp.host", host);
	    //  props.put("mail.smtp.user", from);
	    //  props.put("mail.smtp.password", pass);
	    //  props.put("mail.smtp.port", "587");
	    //  props.put("mail.smtp.auth", "true");
	      
	      props.setProperty("mail.smtp.host", host);
	      props.setProperty("mail.smtp.user", from);
	      props.setProperty("mail.smtp.password", "admin");
	      props.setProperty("mail.smtp.port", "80");
	      props.setProperty("mail.smtp.auth", "true");
	      //Session session = Session.getDefaultInstance(props);
	      Session session = Session.getDefaultInstance(props,new Authenticator() {
	    	  protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication(
                          "info@ditelnetwork.com", "admin");// Specify the Username and the PassWord
              }

          
	      });
	      
		String query1 ="select * from agri.agri_youtube";
		File file = null;
		String fileName =null;
		 
		
		String prefix ="report";
		String suffix ="csv";
		try{
			Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
    		int numCols = rs.getMetaData().getColumnCount();
    		while (rs.next()) {
    			StringBuilder sb = new StringBuilder();
    			for (int i = 1; i <= numCols; i++) {
                    sb.append(String.format(String.valueOf(rs.getString(i))) + ", ");

                }
    			resultSetArray.add(sb.toString());
    			
    		}
    		rs.close();
            st.close();
            con.close();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try{
			
			file = File.createTempFile(prefix + "_", "." + suffix, new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/agri_temp"));
			FileWriter fileWriter = new FileWriter(file, false);
			for(String mapping : resultSetArray) {
	            fileWriter.write(mapping + "\n");
	         }
			fileWriter.close();
			thefile = file.getName();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
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
	          message.setSubject("attachement");
	       // Create the message part
	          BodyPart messageBodyPart = new MimeBodyPart(); 
	       // Now set the actual message
	          messageBodyPart.setText("This is message body");
	       // Create a multipar message
	          Multipart multipart = new MimeMultipart();
	       // Set text message part
	          multipart.addBodyPart(messageBodyPart);
	       // Part two is attachment
	          messageBodyPart = new MimeBodyPart();
	          String filename = "C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/agri_temp/"+thefile;
	          DataSource source = new FileDataSource(filename);
	          messageBodyPart.setDataHandler(new DataHandler(source));
	          messageBodyPart.setFileName(thefile);
	          multipart.addBodyPart(messageBodyPart);
	       // Send the complete message parts
	          message.setContent(multipart);
	       // Send message
	         // Transport transport = session.getTransport("smtp");
	         // transport.connect(host, from, pass);
	          Transport.send(message);
	          System.out.println("Sent message successfully....");
	          
	          
		}catch (AddressException ae) {
            ae.printStackTrace();
        }
		
		catch(MessagingException mex){
			mex.printStackTrace();
		}
		
		
		
	}


}
