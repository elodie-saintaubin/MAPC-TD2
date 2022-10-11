package MAPC.TD2;

//test
public interface Composant {
	public String getName();
	public Composant getContenu();
	public Owner getOwner();
	public int getSize();
	public void appendContent();
	public void setOwner(Owner o);


}

