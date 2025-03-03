package curtain;

public class Curtain {
	static Boolean status = false;
	
	Curtain(Boolean Status){
		this.status = status;
		
	}
	
	public String getStatus(){
		if(status==false) {
			return "closed";
		}
		else {
			return "open";
		}
	}
}
