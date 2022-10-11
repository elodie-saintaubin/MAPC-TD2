package MAPC.TD2;
import java.util.*;

public abstract class Composite<T extends Composant> implements Composant{

	private String name;
	private List<T> elements;
	
	public Composite (String name, List<T> e) {
		this.name = name;
		this.elements = e;
	}
	
	//Fonctions du composite
	public void addChild() {
		
	}
	
	public List<T> getChildren() {
		return this.elements;
	}
	
	public void removeChild(T child) {
		this.elements.remove(child);
	}
	
	public void removeChildren() {
		
	}

	
	
}
