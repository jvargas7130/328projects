public class Hash {

	private String key;
	private long value;
	
	public Hash() {
		
		key = "";
		value = 0;
	}
	
	public Hash( String s, long i ) {
		
		key = s;
		value = i;
	}
	
	public void setKey( String s ) {
		
		key = s;
	}
	
	public String getKey() {
		
		return key;
	}
	
	public void setVal( long i ) {
		
		value = i;
	}
	
	public long getVal() {
		
		return value;
	}
	
	public String toString() {
		
		return "(" + key + ", " + value + ")";
	}

}
