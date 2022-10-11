package MAPC.TD2;

public abstract class Composite<T> implements Composant{

	private String name;
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Composant getContenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void appendContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOwner(Owner o) {
		
	}
	
	//************************************************
	//Fonctions du composite
	public void addChild() {
		
	}
	
	public Composant[] getChildren() {
		return null;
	}
	
	public void removeChild() {
		
	}
	
	public void removeChildren() {
		
	}

	
	
}
