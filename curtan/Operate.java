package curtain;

public class Operate {
	
	public String toggle(Curtain c) {
		if(c.status=false) {
			c.status=true;
			return "open";
		}
		else {
			c.status=true;
			return "closed";
		}
	}

}
