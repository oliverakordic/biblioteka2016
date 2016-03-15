package biblioteka;
import java.util.LinkedList;
import biblioteka.interfejs.bibliotekainterfejs;


public class Biblioteka implements bibliotekainterfejs{
	private LinkedList <Knjiga> knjige  = new LinkedList <Knjiga>();
	//Lista knjiga u biblioteci
	public void dodajKnjigu(Knjiga knjiga){
		//Ne sme biti duplikata knjiga
		
		if(knjiga==null || knjige.contains(knjiga))
			throw new RuntimeException("Greska pri unosu knjige!");
		knjige.add(knjiga);
	}
	public void obrisiKnjigu(Knjiga knjiga){
		if(knjiga==null || !knjige.contains(knjiga))
			throw new RuntimeException("Greska pri brisanju knjige!");
		knjige.remove(knjiga);
	}
	public LinkedList<Knjiga> vratiSveKnjige(){
		return knjige;
	}
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN,String naslov, String izdavac){
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();

		if(naslov==null)
			throw new RuntimeException("Naslov ne sme biti null.");
		

		for(int i=0; i<knjige.size(); i++){
			if(knjige.get(i).getNaslov().contains(naslov))
				rezultat.add(knjige.get(i));
		}
		return rezultat;
	}

}
