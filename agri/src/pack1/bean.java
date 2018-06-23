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
