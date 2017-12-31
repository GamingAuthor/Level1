
public class TeaParty {
	public String welcome(String string, boolean b, boolean c) {
			if(b == true) {
				if(c == false) {
					return "Hello Ms. " + string;
				}else{
					return "Hello Lady " + string;
				}
			}else{
				if(c == false) {
					return "Hello Mr. " + string;
				}else{
					return "Hello Sir " + string;
				}
			}
	

}
}