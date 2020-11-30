package duongbean;

import java.sql.Date;

public class tintucbean {
	private int matin;
	private String tieude;
	private String tomtat;
	private Date ngauduatin;
	private String noidungtin;
	public tintucbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tintucbean(int matin, String tieude, String tomtat, Date ngauduatin, String noidungtin) {
		super();
		this.matin = matin;
		this.tieude = tieude;
		this.tomtat = tomtat;
		this.ngauduatin = ngauduatin;
		this.noidungtin = noidungtin;
	}
	public int getMatin() {
		return matin;
	}
	public void setMatin(int matin) {
		this.matin = matin;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getTomtat() {
		return tomtat;
	}
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	public Date getNgauduatin() {
		return ngauduatin;
	}
	public void setNgauduatin(Date ngauduatin) {
		this.ngauduatin = ngauduatin;
	}
	public String getNoidungtin() {
		return noidungtin;
	}
	public void setNoidungtin(String noidungtin) {
		this.noidungtin = noidungtin;
	}

}
