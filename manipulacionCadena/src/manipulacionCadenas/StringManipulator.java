package manipulacionCadenas;

public class StringManipulator {
	
	public String trimAndConcat(String s, String i) {
		return (s.concat(i).trim());
	}
	
	public int getIndexOrNull(String x, char m) {
		x.indexOf("NTT",m);
		x.indexOf("ndo",m);
		x.indexOf("no se ha encontrado",m);
		return m;
		
	}

	public int getIndexOrNull(String i, String e) {
		//i.indexOf("rd",e);	
		return 0;
		
	}
	
	public String concatSubstring(String x, int n, int v, String c) {
		x.concat(c).substring(n, v);
		return c;
		
	}
}
