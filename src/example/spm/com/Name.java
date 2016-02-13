package example.spm.com;

public class Name {
	
	static String name;
	
	public Name(){
		name = "Joana";
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static String getName(){
		return name;
	}

}
