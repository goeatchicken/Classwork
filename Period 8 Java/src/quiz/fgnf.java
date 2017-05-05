package quiz;

public class fgnf {

	private boolean purchased;
	private String description;
	
	public fgnf(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.purchased = false;
	}

	public boolean checkPurchased(){
		return purchased;
	}
	public void setPurchased(boolean p){
		this.purchased = p;
	}
	public String getDescription(){
		return description;
	}
}
