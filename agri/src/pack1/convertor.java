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
public class convertor {
	
	
	
	private String country;
	private String province;
	private String city;
	private String area;
	private String intersection;
	private String longitude;
	private String latitude;
	private String menu;
	private String submenu;
	private String price;
	private String phone;
	private UploadedFile uploadeFile;

	private String accid;
	private String fileName;
	private String vlongitude;
	private String vlatitude;
	private String vmenu;
	private String vsubmenu;
	private String vage;
	private String vgender;
	
	private String delprodid;
	private String acountbal;
	private String pin_num;
	private String dist;
	private String rec1;
	private String vrec;
	private String delsponid;
	
	private String age;
	private String gender;
	private String prodcount;
	private String produpcount;
	private String prodvalcount;
	private String prodvalval;
	private String uploadrate;
	private int uploadratevalue;
	private String uploadvdispl;
	private String sumpaiement;
	private String balance;
	
	
	public String getProdvalval() {
		return prodvalval;
	}

	public void setProdvalval(String prodvalval) {
		this.prodvalval = prodvalval;
	}

	public String getProdupcount() {
		return produpcount;
	}

	public void setProdupcount(String produpcount) {
		this.produpcount = produpcount;
	}

	public String getRec1() {
		return rec1;
	}

	public void setRec1(String rec1) {
		this.rec1 = rec1;
	}


	double delta ;
	private String vdistance;
	private String vlongitude2;
	
	public String getdist() {
		return dist;
	}

	public void setdist(String dist) {
		this.dist = dist;
	}


	private String tdist="500";
	double longinum;
	//private List displProd = new ArrayList();
	
	double balancenum;
	
	
	
	
	//delta = 9*(distnum /800) ;

	java.sql.Connection con = null;
	String url = "jdbc:mysql://localhost:3306/vex";
	String driver ="com.mysql.jdbc.Driver";
	String userName ="enfant1";
	String password="!Muepu$2016!";
	int sumcount =0;
	
	java.sql.Statement st;
	
	
	String query = "select * from countries";
	
	
	
	//String query2 = "select * from province where country_id = '" +country +"'";
	HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest(); 
	String username = request.getRemoteUser(); 
	
	String query10 = "select * from accountup where user_name = '"+ username+"'";
	String sql12= "insert into productup (account_id,prod_menu,prod_submenu,prod_price,prod_longitude,prod_latitude,prod_status,prod_pic_id,prod_telephone)values (?,?,?,?,?,?,?,?,?)";
	String sql12s= "insert into sponsor (account_id,picture_id,status,s_longitude,s_latitude,s_age,s_gender)values (?,?,?,?,?,?,?)";
	
	
	
	
    
    
    
    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }
    public String getprovince() {
        return province;
    }
    public void setprovince(String province) {
        this.province = province;
    }
    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
    }
    public String getarea() {
        return area;
    }
    public void setarea(String area) {
        this.area = area;
    }
    
    public String getintersection() {
        return intersection;
    }
    public void setintersection(String intersection) {
        this.intersection = intersection;
    }
    
    public String getlongitude() {
        return longitude;
    }
    public void setlongitude(String longitude) {
        this.longitude = longitude;
    }
    
    public String getlatitude() {
        return latitude;
    }
    public void setlatitude(String latitude) {
        this.latitude = latitude;
    }
    
    public String getmenu() {
        return menu;
    }
    public void setmenu(String menu) {
        this.menu = menu;
    }
    
    public String getsubmenu() {
        return submenu;
    }
    public void setsubmenu(String submenu) {
        this.submenu = submenu;
    }
    
    public String getprice() {
        return price;
    }
    public void setprice(String price) {
        this.price = price;
    }
    
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    
    public String getpin_num() {
        return pin_num;
    }
    public void setpin_num(String pin_num) {
        this.pin_num =pin_num;
    }
    
    
    public UploadedFile getUploadeFile() {
		return uploadeFile;
	}

	public void setUploadeFile(UploadedFile uploadeFile) {
		this.uploadeFile = uploadeFile;
	} 
	
	public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }
	
    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }
	
    //age and gender
    
    public List<SelectItem> getages(){
    	String queryage = "select * from ages";
    	ArrayList<SelectItem> ages = new ArrayList<SelectItem>();
    	ages.add(new SelectItem("0","--- Select AgeTarget ---"));
    	try {
    		
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(queryage);
    		while (rs.next()) {
    			ages.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return ages;
    }
    
    
    public List<SelectItem> getgenders(){
    	String querygender = "select * from genders";
    	ArrayList<SelectItem> genders = new ArrayList<SelectItem>();
    	genders.add(new SelectItem("0","--- Select GenderTarget ---"));
    	try {
    		
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(querygender);
    		while (rs.next()) {
    			genders.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return genders;
    }
    
    
	// menues choices
	
	public List<SelectItem> getdistances(){
    	String query9 = "select * from distance";
    	ArrayList<SelectItem> distances = new ArrayList<SelectItem>();
    	distances.add(new SelectItem("0","--- Select Distance ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query9);
    		while (rs.next()) {
    			distances.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return distances;
    }     
	
    // record
	
	public List<SelectItem> getrecords(){
    	String query9 = "select * from record";
    	ArrayList<SelectItem> records = new ArrayList<SelectItem>();
    	records.add(new SelectItem("0","--- Select number of records ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query9);
    		while (rs.next()) {
    			records.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return records;
    }     
    public List<SelectItem> getcountries(){
    	ArrayList<SelectItem> countries = new ArrayList<SelectItem>();
    	countries.add(new SelectItem("0","--- Select country ---"));
    	try {
    		
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query);
    		while (rs.next()) {
    			countries.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return countries;
    }
    public List<SelectItem> getprovinces(){
    	String query2 = "select * from province where country_id = '" +country +"'";
    	ArrayList<SelectItem> provinces = new ArrayList<SelectItem>();
    	provinces.add(new SelectItem("0","--- Select province ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query2);
    		while (rs.next()) {
    			provinces.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return provinces;
    } 
    public List<SelectItem> getcities(){
    	String query3 = "select * from city where province_id = '" +province +"'";
    	ArrayList<SelectItem> cities = new ArrayList<SelectItem>();
    	cities.add(new SelectItem("0","--- Select city ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query3);
    		while (rs.next()) {
    			cities.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return cities;
    } 
   
    public List<SelectItem> getareas(){
    	String query4 = "select * from area where city_id = '" +city +"'";
    	ArrayList<SelectItem> areas = new ArrayList<SelectItem>();
    	areas.add(new SelectItem("0","--- Select area ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query4);
    		while (rs.next()) {
    			areas.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return areas;
    } 
    
    public List<SelectItem> getintersections(){
    	String query5 = "select * from intersection where area_id = '" +area +"'";
    	ArrayList<SelectItem> intersections = new ArrayList<SelectItem>();
    	intersections.add(new SelectItem("0","--- Select intersection ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query5);
    		while (rs.next()) {
    			intersections.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return intersections;
    } 
    
    public List<SelectItem> getlongitudes(){
    	String query6 = "select * from gps where intersection_id = '" +intersection +"'";
    	ArrayList<SelectItem> longitudes = new ArrayList<SelectItem>();
    	longitudes.add(new SelectItem("0","--- Select longitude ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query6);
    		while (rs.next()) {
    			longitudes.add(  new SelectItem(rs.getString(1),rs.getString(4)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return longitudes;
    }     
    
    public List<SelectItem> getlatitudes(){
    	String query7 = "select * from gps where intersection_id = '" +intersection +"'";
    	ArrayList<SelectItem> latitudes = new ArrayList<SelectItem>();
    	latitudes.add(new SelectItem("0","--- Select latitude ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query7);
    		while (rs.next()) {
    			latitudes.add(  new SelectItem(rs.getString(1),rs.getString(5)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return latitudes;
    }     
    
    public List<SelectItem> getmenues(){
    	String query8 = "select * from menu";
    	ArrayList<SelectItem> menues = new ArrayList<SelectItem>();
    	menues.add(new SelectItem("0","--- Select Category ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query8);
    		while (rs.next()) {
    			menues.add(  new SelectItem(rs.getString(1),rs.getString(2)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return menues;
    }   
    
    public List<SelectItem> getsubmenues(){
    	String query9 = "select * from sub_menu where menus_id = '" +menu +"'";
    	ArrayList<SelectItem> submenues = new ArrayList<SelectItem>();
    	submenues.add(new SelectItem("0","--- Select Subcategory ---"));
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query9);
    		while (rs.next()) {
    			submenues.add(  new SelectItem(rs.getString(1),rs.getString(3)));
    		}
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		return submenues;
    }     
    public void submit() throws IOException{
		File file = null;
		File file2 = null;
        OutputStream output = null;
        OutputStream output2 = null;
     // Just to demonstrate what information you can get from the uploaded file.
        System.out.println("File type: " + uploadeFile.getContentType());
        System.out.println("File name: " + uploadeFile.getName());
        System.out.println("File size: " + uploadeFile.getSize() + " bytes");

        // Prepare filename prefix and suffix for an unique filename in upload folder.
        String prefix = FilenameUtils.getBaseName(uploadeFile.getName());
        String suffix = FilenameUtils.getExtension(uploadeFile.getName());
        // get account ID
        try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

		try {
			// Create file with unique name in upload folder and write to it.
            file = File.createTempFile(prefix + "_", "." + suffix, new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/upload/images"));
            String prefix2 = FilenameUtils.getBaseName(file.getName());
            String suffix2 = FilenameUtils.getExtension(file.getName());
            file2 =  new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/images/"+prefix2+"."+suffix2);
            output = new FileOutputStream(file);
            output2 = new FileOutputStream(file2);
            IOUtils.copy(uploadeFile.getInputStream(), output);
            IOUtils.copy(uploadeFile.getInputStream(), output2);
            fileName = file.getName();
            fileName = file2.getName();
            // Show succes message.
            FacesContext.getCurrentInstance().addMessage("country", new FacesMessage(
                FacesMessage.SEVERITY_INFO, "File upload succeed!", null));
			
		}finally {
			 IOUtils.closeQuietly(output);	
		}
		
		//Get longitude
		try{
			String query13 = "select * from gps where gps_id = '" +longitude +"'";
			Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query13);
                rs.next();
                vlongitude = rs.getString(4);
                rs.close();
                st.close();
                con.close();
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		// get latitude
try{
	String query14 = "select * from gps where gps_id = '" +latitude +"'";
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query14);
        rs.next();
        vlatitude = rs.getString(5);
        rs.close();
        st.close();
        con.close();	
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

// get menu
try{
	String query15 = "select * from menu where menus_id = '" +menu +"'";
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query15);
        rs.next();
        vmenu = rs.getString(2);
        rs.close();
        st.close();
        con.close();	
	
}catch(Exception ex) {
    System.out.println(ex.getMessage());
}
// get submenu
try{
	String query16 = "select * from sub_menu where sub_menu_id = '" +submenu +"'";
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query16);
        rs.next();
        vsubmenu = rs.getString(3);
        rs.close();
        st.close();
        con.close();		
	
}catch(Exception ex) {
    System.out.println(ex.getMessage());
}
		
		//insert record to mysql
		try {
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url,userName,password);
			java.sql.PreparedStatement pst = con.prepareStatement(sql12);
			pst.setString(1, accid);
			pst.setString(2, vmenu);
			pst.setString(3, vsubmenu);
			pst.setString(4, price);
			pst.setString(5, vlongitude);
			pst.setString(6, vlatitude);
			pst.setString(7, "on");
			pst.setString(8, fileName);
			pst.setString(9, phone);

			int numRowsChange = pst.executeUpdate();
			pst.close();
            con.close();
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
	}
    
    //Display and delete products
    public List getdisplProd(){
    	ArrayList  displProd = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
                acountbal = rs.getString(4);
    		rs.close();
            st.close();
            con.close();
            balancenum = Double.parseDouble(acountbal);
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    	if (balancenum > 0){
    	try {
    		String query17 = "select * from productup where account_id = '" +accid +"'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			displProd.add(  new ProdInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	}
    	    	
    	return displProd;	
    }
    
    // Display request
    
    public List getreqProd(){
    	
    	
    	ArrayList  reqProd = new ArrayList();
    	//Get longitude
    			try{
    				String query13 = "select * from gps where intersection_id = '"+intersection+"'";
    				Class.forName(driver).newInstance();
    	    		con = DriverManager.getConnection(url,userName,password);
    	    		st = con.createStatement();
    	    		java.sql.ResultSet rs = st.executeQuery(query13);
    	                rs.next();
    	                vlongitude = rs.getString(4);
    	                // longinum = Double.valueOf(vlongitude);
    	                rs.close();
    	                st.close();
    	                con.close();
    	                
    			}catch(Exception ex) {
    	            System.out.println(ex.getMessage());
    	        }
    			// get latitude
    	try{
    		String query14 = "select * from gps where intersection_id = '"+intersection+"'";
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query14);
    	        rs.next();
    	        vlatitude = rs.getString(5);
    	        rs.close();
    	        st.close();
    	        con.close();	
    				
    			}catch(Exception ex) {
    	            System.out.println(ex.getMessage());
    	        }
    	// get distance
    	try{
    		String query25 = "select * from distance where distance_id = '"+dist+"'" ;
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query25);
    	        rs.next();
    	        vdistance= rs.getString(2);
    	        rs.close();
    	        st.close();
    	        con.close();	
    		
    	}catch(Exception ex) {
    	    System.out.println(ex.getMessage());
    	}
// record
    	
    	
    	

    	
    	
    	// get submenu
    	try{
    		String query16 = "select * from sub_menu where sub_menu_id = '" +submenu +"'";
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query16);
    	        rs.next();
    	        vsubmenu = rs.getString(3);
    	        rs.close();
    	        st.close();
    	        con.close();		
    		
    	}catch(Exception ex) {
    	    System.out.println(ex.getMessage());
    	}
    	
    	// get record number
    	
    	try{
    		String query16 = "select * from record where record_id = '" +rec1 +"'";
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query16);
    	        rs.next();
    	        vrec = rs.getString(2);
    	        rs.close();
    	        st.close();
    	        con.close();		
    		
    	}catch(Exception ex) {
    	    System.out.println(ex.getMessage());
    	}
    	
    	   // testing zone
try {
	String sql122= "insert into templong (longit)values (?)";
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url,userName,password);
			java.sql.PreparedStatement pst = con.prepareStatement(sql122);
			pst.setString(1, vrec);
			
			int numRowsChange = pst.executeUpdate();
			pst.close();
            con.close();
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    	// end testing

// condition do display account balance>0

try {
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query10);
        rs.next();
        acountbal = rs.getString(4);
	
	rs.close();
    st.close();
    con.close();
    balancenum = Double.parseDouble(acountbal);
}
catch(Exception ex) {
    System.out.println(ex.getMessage());
}

if (balancenum > 0){


    	try {
    		
    	    		
    		String query28 = "SELECT * FROM request WHERE prod_submenu = '"+vsubmenu+"'AND prod_longitude > ('"+vlongitude+"'-('"+vdistance+"'/100)) AND prod_longitude < ('"+vlongitude+"'+('"+vdistance+"'/100)) AND prod_latitude > ('"+vlatitude+"'-('"+vdistance+"'/100))AND prod_latitude < ('"+vlatitude+"'+('"+vdistance+"'/100))ORDER BY request_id DESC";
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query28);
    		
    		while (rs.next()) {
    			reqProd.add(  new ReqInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
}
		return reqProd;
    }
    
    
    
    
    public void deleteProd(ProdInfo item){
    	delprodid= item.getProduct_id();
    	// String query18 = "delete  from productup where product_id = '" +delprodid +"'";	
    	
    	 
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		
    		String query18 = "DELETE  FROM productup WHERE prod_id = ?";	
    		int prod_id = Integer.parseInt(delprodid);
       	  //  int prod_id= 40;
    		java.sql.PreparedStatement pst = con.prepareStatement(query18);
    		
    		pst.setInt(1, prod_id);
    		int numRowsChange = pst.executeUpdate();
            System.out.println(numRowsChange+ "record deleted ")  ;  
            
    		pst.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    }
    
    public List getdisplaccount(){
    	ArrayList  displaccount = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    	try {
    		String query17 = "select * from accountup where account_id = '" +accid +"'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			displaccount.add(  new AccountInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    	return displaccount;
    }
    
    public void loadpin(AccountInfo item) throws IOException{
    	try{
    		int pinValue = Integer.parseInt(pin_num);
    		accid= item.getAccount_id();
    		int accidValue = Integer.parseInt(accid);
    		
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		CallableStatement call = con.prepareCall("{call routine2(?,?)}");
    		call.setInt(1, pinValue);
    		call.setInt(2, accidValue);
    		
    		int update = call.executeUpdate();
    		System.out.println("Update: "+update);
    		con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    }
    
    
    //Display cdr
    
    public List getdisplcdr(){
    	ArrayList  displcdr = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    	try {
    		String query17 = "select * from cdr where account_id = '" +accid +"'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			displcdr.add(  new CdrInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    	
    	
    	
    	return displcdr;
    }
    
    public void submitsp() throws IOException{
		File file = null;
		File file2 = null;
		File file3 = null;
        OutputStream output = null;
        OutputStream output2 = null;
        OutputStream output3 = null;
     // Just to demonstrate what information you can get from the uploaded file.
        System.out.println("File type: " + uploadeFile.getContentType());
        System.out.println("File name: " + uploadeFile.getName());
        System.out.println("File size: " + uploadeFile.getSize() + " bytes");

        // Prepare filename prefix and suffix for an unique filename in upload folder.
        String prefix = FilenameUtils.getBaseName(uploadeFile.getName());
        String suffix = FilenameUtils.getExtension(uploadeFile.getName());
        // get account ID
        try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
    		
    		rs.close();
            st.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

		try {
			// Create file with unique name in upload folder and write to it.
            file = File.createTempFile(prefix + "_", "." + suffix, new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/upload/images"));
            String prefix2 = FilenameUtils.getBaseName(file.getName());
            String suffix2 = FilenameUtils.getExtension(file.getName());
            
            file2 =  new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/client/images/"+prefix2+"."+suffix2);
            file3 =  new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/images/"+prefix2+"."+suffix2);
            output = new FileOutputStream(file);
            output2 = new FileOutputStream(file2);
                      
            output3 = new FileOutputStream(file3);
            
            IOUtils.copy(uploadeFile.getInputStream(), output);
            IOUtils.copy(uploadeFile.getInputStream(), output2);
            IOUtils.copy(uploadeFile.getInputStream(), output3);
            fileName = file.getName();
            fileName = file2.getName();
            fileName = file3.getName();
            // Show succes message.
            FacesContext.getCurrentInstance().addMessage("country", new FacesMessage(
                FacesMessage.SEVERITY_INFO, "File upload succeed!", null));
			
		}finally {
			 IOUtils.closeQuietly(output);	
		}
		
		//Get longitude
		try{
			String query13 = "select * from gps where gps_id = '" +longitude +"'";
			Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query13);
                rs.next();
                vlongitude = rs.getString(4);
                rs.close();
                st.close();
                con.close();
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
		// get latitude
try{
	String query14 = "select * from gps where gps_id = '" +latitude +"'";
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query14);
        rs.next();
        vlatitude = rs.getString(5);
        rs.close();
        st.close();
        con.close();	
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

// get age and gender
try{
	String query141 = "select * from ages where age_id = '" +age+"'";
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query141);
        rs.next();
        vage = rs.getString(2);
        rs.close();
        st.close();
        con.close();	
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

try{
	String query142 = "select * from genders where gender_id = '" +gender+"'";
	Class.forName(driver).newInstance();
	con = DriverManager.getConnection(url,userName,password);
	st = con.createStatement();
	java.sql.ResultSet rs = st.executeQuery(query142);
        rs.next();
        vgender = rs.getString(2);
        rs.close();
        st.close();
        con.close();	
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }


		
		//insert record to mysql
		try {
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url,userName,password);
			java.sql.PreparedStatement pst = con.prepareStatement(sql12s);
			pst.setString(1, accid);
			pst.setString(2, fileName);
			pst.setString(3, "on");
			pst.setString(4, vlongitude);
			pst.setString(5, vlatitude);
			pst.setString(6, vage);
			pst.setString(7, vgender);
			

			int numRowsChange = pst.executeUpdate();
			pst.close();
            con.close();
			
		}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
	}
    
  //Display and delete sponsor
    public List getdisplSponsor(){
    	ArrayList  displSponsor = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
                acountbal = rs.getString(4);
    		rs.close();
            st.close();
            con.close();
            balancenum = Double.parseDouble(acountbal);
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    	if (balancenum > 0){
    	try {
    		String query17 = "select * from sponsor where account_id = '" +accid +"'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			displSponsor.add(  new SponsorInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	}
    	
    	
    	return displSponsor;	
    }
    
   // Delete prod
    public void deleteSpon(SponsorInfo item){
    	delsponid= item.getSponsor_id();
    	// String query18 = "delete  from productup where product_id = '" +delprodid +"'";	
    	
    	 
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		
    		String query18 = "DELETE  FROM sponsor WHERE sponsor_id = ?";	
    		int sponsor_id = Integer.parseInt(delsponid);
       	  //  int prod_id= 40;
    		java.sql.PreparedStatement pst = con.prepareStatement(query18);
    		
    		pst.setInt(1, sponsor_id);
    		int numRowsChange = pst.executeUpdate();
            System.out.println(numRowsChange+ "record deleted ")  ;  
            
    		pst.close();
            con.close();
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    }
    
  //Display validated products
    public List getdisplProdup(){
    	ArrayList  displProdup = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
                acountbal = rs.getString(4);
    		rs.close();
            st.close();
            con.close();
            balancenum = Double.parseDouble(acountbal);
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    	if (balancenum > 0){
    	try {
    		String query17 = "select * from productup where account_id = '" +accid +"' AND prod_validation ='1'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			displProdup.add(  new ProdValInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12),rs.getString(14)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	}
    	    	
    	return displProdup;	
    }
    
    //Get productup count
    
    public String getprodcount(){
    	
    	ArrayList  Prod = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
                acountbal = rs.getString(4);
    		rs.close();
            st.close();
            con.close();
            balancenum = Double.parseDouble(acountbal);
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    	if (balancenum > 0){
    	try {
    		String query17 = "select * from productup where account_id = '" +accid +"'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			Prod.add(  new ProdInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	}
    	prodcount =""+Prod.size();
    	return prodcount;	
    }
    
    
    
    
//Get productvalup count
    
    public String getprodvalcount(){
    	
    	ArrayList  Prod = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
                acountbal = rs.getString(4);
    		rs.close();
            st.close();
            con.close();
            balancenum = Double.parseDouble(acountbal);
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    	if (balancenum > 0){
    	try {
    		String query17 = "select * from productup where account_id = '" +accid +"' AND prod_validation='1'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			Prod.add(  new ProdInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	}
    	produpcount =""+Prod.size();
    	return produpcount;	
    }
    
    //get prodvalidated value
    
public String getprodvaliamount(){
	    int uploadvalue=0;
	    // get rate
	    try {
    		String query111 = "select * from rates where rate_name = 'valprod'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query111);
    		rs.next();
    		uploadrate = rs.getString(3);
    		uploadratevalue = Integer.parseInt(uploadrate);
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
    	ArrayList  Prod = new ArrayList();
    	try {
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query10);
                rs.next();
                accid = rs.getString(1);
                acountbal = rs.getString(4);
    		rs.close();
            st.close();
            con.close();
            balancenum = Double.parseDouble(acountbal);
    	}
    	catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    	if (balancenum > 0){
    	try {
    		String query17 = "select * from productup where account_id = '" +accid +"' AND prod_validation='1'";	
    		Class.forName(driver).newInstance();
    		con = DriverManager.getConnection(url,userName,password);
    		st = con.createStatement();
    		java.sql.ResultSet rs = st.executeQuery(query17);
    		while (rs.next()) {
    			Prod.add(  new ProdInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12)));
    			
    		}
    		rs.close();
            st.close();
            con.close();
    		
    	}catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    	}
    	
    	
    	uploadvalue = uploadratevalue*Prod.size();
    	uploadvdispl = ""+uploadvalue;
    	
    	return uploadvdispl;	
    }
    // display paiements
public List getdisplPaieup(){
	ArrayList  displProduppaie = new ArrayList();
	try {
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url,userName,password);
		st = con.createStatement();
		java.sql.ResultSet rs = st.executeQuery(query10);
            rs.next();
            accid = rs.getString(1);
            acountbal = rs.getString(4);
		rs.close();
        st.close();
        con.close();
        balancenum = Double.parseDouble(acountbal);
	}
	catch(Exception ex) {
        System.out.println(ex.getMessage());
    }

	if (balancenum > 0){
	try {
		String query17 = "select * from prodpaiement where account_id = '" +accid+"'";	
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url,userName,password);
		st = con.createStatement();
		java.sql.ResultSet rs = st.executeQuery(query17);
		while (rs.next()) {
			displProduppaie.add(  new PaieInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			
		}
		rs.close();
        st.close();
        con.close();
		
	}catch(Exception ex) {
        System.out.println(ex.getMessage());
    }
	}
	    	
	return displProduppaie;	
}
// Sum the paiements
public String getSumpaiement(){
	
	try {
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url,userName,password);
		st = con.createStatement();
		java.sql.ResultSet rs = st.executeQuery(query10);
            rs.next();
            accid = rs.getString(1);
            acountbal = rs.getString(4);
		rs.close();
        st.close();
        con.close();
        balancenum = Double.parseDouble(acountbal);
	}
	catch(Exception ex) {
        System.out.println(ex.getMessage());
    }

	if (balancenum > 0){
	try {
		String query17 = "select sum(amount) from prodpaiement where account_id = '" +accid+"'";	
		
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url,userName,password);
		st = con.createStatement();
		java.sql.ResultSet rs = st.executeQuery(query17);
		rs.next();
		sumpaiement = rs.getString(1);
		rs.close();
        st.close();
        con.close();
		
	}catch(Exception ex) {
        System.out.println(ex.getMessage());
    }
	}
	    	
		
	
	return sumpaiement;
}
// balance to paie
public String getBalance(){
	Integer paiements = Integer.valueOf(sumpaiement);
	Integer uploadedv = Integer.valueOf(uploadvdispl);
	Integer balancevalue = uploadedv - paiements;
	balance =""+ balancevalue;
	return balance;
}

}


