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
	private String mot_ministre_1;
	private String mot_ministre_2;
	private String mot_ministre_3;
	private String mot_ministre_4;
	
	public String getMot_ministre_2() {
String query1 ="select * from agri.agri_text where text_name = 'mot_ministre_2'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                mot_ministre_2 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return mot_ministre_2;
	}

	public void setMot_ministre_2(String mot_ministre_2) {
		this.mot_ministre_2 = mot_ministre_2;
	}

	public String getMot_ministre_3() {
		
String query1 ="select * from agri.agri_text where text_name = 'mot_ministre_3'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                mot_ministre_3 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return mot_ministre_3;
	}

	public void setMot_ministre_3(String mot_ministre_3) {
		this.mot_ministre_3 = mot_ministre_3;
	}

	public String getMot_ministre_4() {
String query1 ="select * from agri.agri_text where text_name = 'mot_ministre_4'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                mot_ministre_4 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return mot_ministre_4;
	}

	public void setMot_ministre_4(String mot_ministre_4) {
		this.mot_ministre_4 = mot_ministre_4;
	}

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
	
	
	private String gallery1_7;
	private String gallery1_8;
	private String gallery1_9;
	private String gallery1_10;
	private String gallery1_11;
	private String gallery1_12;
	private String gallery1_13;
	private String gallery1_14;
	private String gallery1_15;
	private String gallery1_16;
	private String gallery1_17;
	private String gallery1_18;
	private String gallery1_19;
	private String gallery1_20;
	
	private String gallery1_7_desc;
	private String gallery1_8_desc;
	private String gallery1_9_desc;
	private String gallery1_10_desc;
	private String gallery1_11_desc;
	private String gallery1_12_desc;
	private String gallery1_13_desc;
	private String gallery1_14_desc;
	private String gallery1_15_desc;
	private String gallery1_16_desc;
	private String gallery1_17_desc;
	private String gallery1_18_desc;
	private String gallery1_19_desc;
	private String gallery1_20_desc;
	
	private String flash_info_1;
	private String flash_info_2;
	private String flash_info_3;
	private String flash_info_4;
	private String flash_info_5;
	private String flash_info_6;
	private String flash_info_7;
	private String flash_info_8;
	private String flash_info_9;
	private String flash_info_10;
	private String flash_info_11;
	
	
	
	public String getFlash_info_1() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_1'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_1 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_1;
	}

	public void setFlash_info_1(String flash_info_1) {
		this.flash_info_1 = flash_info_1;
	}

	public String getFlash_info_2() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_2'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_2 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_2;
	}

	public void setFlash_info_2(String flash_info_2) {
		this.flash_info_2 = flash_info_2;
	}

	public String getFlash_info_3() {
String query1 ="select * from agri.agri_text where text_name = 'flash_info_3'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_3 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_3;
	}

	public void setFlash_info_3(String flash_info_3) {
		this.flash_info_3 = flash_info_3;
	}

	public String getFlash_info_4() {
String query1 ="select * from agri.agri_text where text_name = 'flash_info_4'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_4 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_4;
	}

	public void setFlash_info_4(String flash_info_4) {
		this.flash_info_4 = flash_info_4;
	}

	public String getFlash_info_5() {
String query1 ="select * from agri.agri_text where text_name = 'flash_info_5'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_5 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_5;
	}

	public void setFlash_info_5(String flash_info_5) {
		this.flash_info_5 = flash_info_5;
	}

	public String getFlash_info_6() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_6'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_6 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_6;
	}

	public void setFlash_info_6(String flash_info_6) {
		this.flash_info_6 = flash_info_6;
	}

	public String getFlash_info_7() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_7'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_7 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_7;
	}

	public void setFlash_info_7(String flash_info_7) {
		this.flash_info_7 = flash_info_7;
	}

	public String getFlash_info_8() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_8'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_8 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_8;
	}

	public void setFlash_info_8(String flash_info_8) {
		this.flash_info_8 = flash_info_8;
	}

	public String getFlash_info_9() {
String query1 ="select * from agri.agri_text where text_name = 'flash_info_9'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_9 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_9;
	}

	public void setFlash_info_9(String flash_info_9) {
		this.flash_info_9 = flash_info_9;
	}

	public String getFlash_info_10() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_10'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_10 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_10;
	}

	public void setFlash_info_10(String flash_info_10) {
		this.flash_info_10 = flash_info_10;
	}

	public String getFlash_info_11() {
		
String query1 ="select * from agri.agri_text where text_name = 'flash_info_11'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                flash_info_11 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return flash_info_11;
	}

	public void setFlash_info_11(String flash_info_11) {
		this.flash_info_11 = flash_info_11;
	}

	public String getGallery1_7() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_7'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_7 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_7;
	}

	public void setGallery1_7(String gallery1_7) {
		this.gallery1_7 = gallery1_7;
	}

	public String getGallery1_8() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_8'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_8 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_8;
	}

	public void setGallery1_8(String gallery1_8) {
		this.gallery1_8 = gallery1_8;
	}

	public String getGallery1_9() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_9'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_9 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		
		return gallery1_9;
	}

	public void setGallery1_9(String gallery1_9) {
		this.gallery1_9 = gallery1_9;
	}

	public String getGallery1_10() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_10'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_10 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_10;
	}

	public void setGallery1_10(String gallery1_10) {
		this.gallery1_10 = gallery1_10;
	}

	public String getGallery1_11() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_11'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_11 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		
		return gallery1_11;
	}

	public void setGallery1_11(String gallery1_11) {
		this.gallery1_11 = gallery1_11;
	}

	public String getGallery1_12() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_12'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_12 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		
		return gallery1_12;
	}

	public void setGallery1_12(String gallery1_12) {
		this.gallery1_12 = gallery1_12;
	}

	public String getGallery1_13() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_13'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_13 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_13;
	}

	public void setGallery1_13(String gallery1_13) {
		this.gallery1_13 = gallery1_13;
	}

	public String getGallery1_14() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_14'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_14 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_14;
	}

	public void setGallery1_14(String gallery1_14) {
		this.gallery1_14 = gallery1_14;
	}

	public String getGallery1_15() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_15'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_15 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_15;
	}

	public void setGallery1_15(String gallery1_15) {
		this.gallery1_15 = gallery1_15;
	}

	public String getGallery1_16() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_16'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_16 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_16;
	}

	public void setGallery1_16(String gallery1_16) {
		this.gallery1_16 = gallery1_16;
	}

	public String getGallery1_17() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_17'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_17 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_17;
	}

	public void setGallery1_17(String gallery1_17) {
		this.gallery1_17 = gallery1_17;
	}

	public String getGallery1_18() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_18'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_18 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_18;
	}

	public void setGallery1_18(String gallery1_18) {
		this.gallery1_18 = gallery1_18;
	}

	public String getGallery1_19() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_19'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_19 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_19;
	}

	public void setGallery1_19(String gallery1_19) {
		this.gallery1_19 = gallery1_19;
	}

	public String getGallery1_20() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_20'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_20 ="../../agri_images/"+ rs.getString(5);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_20;
	}

	public void setGallery1_20(String gallery1_20) {
		this.gallery1_20 = gallery1_20;
	}

	public String getGallery1_7_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_7'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_7_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return gallery1_7_desc;
	}

	public void setGallery1_7_desc(String gallery1_7_desc) {
		this.gallery1_7_desc = gallery1_7_desc;
	}

	public String getGallery1_8_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_8'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_8_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_8_desc;
	}

	public void setGallery1_8_desc(String gallery1_8_desc) {
		this.gallery1_8_desc = gallery1_8_desc;
	}

	public String getGallery1_9_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_9'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_9_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_9_desc;
	}

	public void setGallery1_9_desc(String gallery1_9_desc) {
		this.gallery1_9_desc = gallery1_9_desc;
	}

	public String getGallery1_10_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_10'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_10_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_10_desc;
	}

	public void setGallery1_10_desc(String gallery1_10_desc) {
		this.gallery1_10_desc = gallery1_10_desc;
	}

	public String getGallery1_11_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_11'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_11_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_11_desc;
	}

	public void setGallery1_11_desc(String gallery1_11_desc) {
		this.gallery1_11_desc = gallery1_11_desc;
	}

	public String getGallery1_12_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_12'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_12_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_12_desc;
	}

	public void setGallery1_12_desc(String gallery1_12_desc) {
		this.gallery1_12_desc = gallery1_12_desc;
	}

	public String getGallery1_13_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_13'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_13_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_13_desc;
	}

	public void setGallery1_13_desc(String gallery1_13_desc) {
		this.gallery1_13_desc = gallery1_13_desc;
	}

	public String getGallery1_14_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_14'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_14_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_14_desc;
	}

	public void setGallery1_14_desc(String gallery1_14_desc) {
		this.gallery1_14_desc = gallery1_14_desc;
	}

	public String getGallery1_15_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_15'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_15_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_15_desc;
	}

	public void setGallery1_15_desc(String gallery1_15_desc) {
		this.gallery1_15_desc = gallery1_15_desc;
	}

	public String getGallery1_16_desc() {
		
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_16'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_16_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_16_desc;
	}

	public void setGallery1_16_desc(String gallery1_16_desc) {
		this.gallery1_16_desc = gallery1_16_desc;
	}

	public String getGallery1_17_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_17'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_17_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_17_desc;
	}

	public void setGallery1_17_desc(String gallery1_17_desc) {
		this.gallery1_17_desc = gallery1_17_desc;
	}

	public String getGallery1_18_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_18'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_18_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_18_desc;
	}

	public void setGallery1_18_desc(String gallery1_18_desc) {
		this.gallery1_18_desc = gallery1_18_desc;
	}

	public String getGallery1_19_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_19'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_19_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_19_desc;
	}

	public void setGallery1_19_desc(String gallery1_19_desc) {
		this.gallery1_19_desc = gallery1_19_desc;
	}

	public String getGallery1_20_desc() {
String query1 ="select * from agri.agri_gallery_image where image_name = 'gallery1_20'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                gallery1_20_desc = rs.getString(6);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return gallery1_20_desc;
	}

	public void setGallery1_20_desc(String gallery1_20_desc) {
		this.gallery1_20_desc = gallery1_20_desc;
	}

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

	public String getMot_ministre_1() {
		
		String query1 ="select * from agri.agri_text where text_name = 'mot_ministre_1'";
		
		try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query1);
                rs.next();
                mot_ministre_1 = rs.getString(3);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		
		return mot_ministre_1;
	}

	public void setMot_ministre_1(String mot_ministre_1) {
		this.mot_ministre_1 = mot_ministre_1;
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
