package MAPC.TD2;

public class FSFactory {
	
	public enum ComposantType{
		FICHIER, 
		REPERTOIRE
	}
	
	public FSFactory(ComposantType c, StringBuffer s, Owner o) {
		this.c = c;
		this.nameElm = s;
		this.o = o;
	}
	
	
	private ComposantType c;
	private StringBuffer nameElm;
	private Owner o;
	
	public FSFactory createComposant(ComposantType c, StringBuffer s, Owner o) {
		return new FSFactory(c, s, o);
	}
	
	public void appendContent(StringBuffer s) {
		
	}
	
	public FSFactory getInstance() {
		return this;
	}
}
