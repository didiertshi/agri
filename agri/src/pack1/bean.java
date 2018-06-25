package pack1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;




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
	
	public String getGallery1_2() {
String query1 ="select * from vex.agri_gallery_image where image_name = 'gallery1_2'";
		
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
String query1 ="select * from vex.agri_gallery_image where image_name = 'gallery1_3'";
		
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
String query1 ="select * from vex.agri_gallery_image where image_name = 'gallery1_4'";
		
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
String query1 ="select * from vex.agri_gallery_image where image_name = 'gallery1_5'";
		
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
		
String query1 ="select * from vex.agri_gallery_image where image_name = 'gallery1_6'";
		
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
String query1 ="select * from vex.agri_gallery_image where image_name = 'gallery1_1'";
		
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
		
		String query1 ="select * from vex.agri_text where text_name = 'mot_ministre'";
		
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
		
		String query1 ="select * from vex.agri_pic where picture_name = 'photo_ministre'";
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
	String url = "jdbc:mysql://localhost:3306/vex";
	String driver ="com.mysql.jdbc.Driver";
	String userName ="enfant1";
	String password="!Muepu$2016!";
	int sumcount =0;
	
	java.sql.Statement st;
	

}
