package duongdao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import duongbean.tintucbean;

public class tintucdao {
	DungChung dc=new DungChung();
	public ArrayList<tintucbean> getTin() {
		ArrayList<tintucbean> ds=new ArrayList<tintucbean>();
		try {

			dc.KetNoi();
			//buoc 2: thiet lap cau lenh sql
			String sql="select * from hovanduong";
			//lay du lieu ve
			PreparedStatement cmd=dc.cn.prepareStatement(sql);
			ResultSet rs=cmd.executeQuery();
			//b4: duye qua cac don vi 
			while(rs.next()) {
				int matin=rs.getInt("matin");
				String tieude=rs.getString("tieude");
				String tomtat=rs.getString("tomtat");
				Date ngayduatin=rs.getDate("ngayduatin");
				String noidungduatin=rs.getString("noidungtin");
				tintucbean tintuc=new tintucbean(matin, tieude, tomtat, ngayduatin, noidungduatin);
				ds.add(tintuc);
			
	}
			// dong ket noi 
			rs.close();
			dc.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ds;
	}
	
}

