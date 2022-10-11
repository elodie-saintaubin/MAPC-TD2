package MAPC.TD2;

public class Fichier implements Composant{

	private String name;
	private Owner owner;
	
	//?
	private int size;
	
	public Fichier (String name, Owner owner) {
		this.name = name;
		this.owner = owner;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Composant getContenu() {
		return null;
	}

	@Override
	public Owner getOwner() {
		return this.owner;
	}

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public void appendContent() {
		
	}

	@Override
	public void setOwner(Owner o) {
		this.owner = o;
	}

}
