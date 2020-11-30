package duongbo;

import java.util.ArrayList;

import duongbean.tintucbean;
import duongdao.tintucdao;

public class tintucbo {
	tintucdao ttdao=new tintucdao();
	ArrayList<tintucbean> ds;
	public ArrayList<tintucbean> getTinTuc() {
		ds=ttdao.getTin();
		return ds;	
	}
	public ArrayList<tintucbean> TimSachTheoTieuDe(String tieude,String noidungtin){
		ArrayList<tintucbean> tam=new ArrayList<tintucbean>();
		for(tintucbean s: ds) 
			if(s.getTieude().toLowerCase().contains(tieude.toLowerCase()) || s.getNoidungtin().toLowerCase().contains(noidungtin.toLowerCase()))
				tam.add(s);
			return tam;
	}
	

}
