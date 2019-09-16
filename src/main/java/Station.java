import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Station {
	
	private int ID;
	private String name;
	private int bikes;
	private int pedelacs;
	private int availableDocks;
	private int mReq;
	private int capacity;
	private boolean hasKiosk;
	private String address;
	private int count=0;
	
	public Station(int ID, String name, int bikes, int pedelacs, int aDocks, int mReq, int capacity,
			boolean hasKiosk, String address) throws IOException {
		this.ID = ID; 
		this.name = name;
		this.bikes = bikes; 
		this.pedelacs = pedelacs;
		this.availableDocks = aDocks;
		this.mReq = mReq;
		this.capacity = capacity;
		this.hasKiosk = hasKiosk;
		this.address = address;
		FileWriter csvWriter = new FileWriter("data-files/station-data.csv",true);

	
		csvWriter.append(Integer.toString(ID));
	    csvWriter.append(',');
		csvWriter.append(name);
		csvWriter.append(',');
		csvWriter.append(address);
		csvWriter.append(',');
		csvWriter.append(Integer.toString(pedelacs));
		csvWriter.append(',');
		csvWriter.append(Integer.toString(bikes));
		csvWriter.append(',');
		csvWriter.append(Integer.toString(availableDocks));
		csvWriter.append(',');
		csvWriter.append(Integer.toString(mReq));
		csvWriter.append(',');
		csvWriter.append(Integer.toString(capacity));
		csvWriter.append(',');
		csvWriter.append(fromBool(hasKiosk));
		
		csvWriter.append("\n");



		csvWriter.flush();
		csvWriter.close();
		
	}
	public static String fromBool(Boolean b) {
		if(b == true) {
			return "1";
		} else {
			return "0";
		}
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBikes(int bikes) {
		this.bikes = bikes;
	}
	
	public void setPedelacs(int pedelacs) {
		this.pedelacs = pedelacs;
	}
	
	public void setAvailableDocks(int availableDocks) {
		this.availableDocks = availableDocks;
	}
	
	public void setMaintenanceRequests(int mReq) {
		this.mReq = mReq;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setHasKiosk(boolean hasKiosk) {
		this.hasKiosk = hasKiosk;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public int getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBikes() {
		return this.bikes;
	}
	
	public int getPedelacs() {
		return this.pedelacs;
	}
	
	public int getAvailableDocks() {
		return this.availableDocks;
	}
	
	public int getMaintainenceReq() {
		return this.mReq;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public boolean getHasKiosk() {
		return this.hasKiosk;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	

}
