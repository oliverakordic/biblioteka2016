package biblioteka.interfejs;
import biblioteka.Knjiga;
import java.util.LinkedList;
import biblioteka.Autor;

public interface bibliotekainterfejs {
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public LinkedList <Knjiga> vratiSveKnjige();
	public LinkedList <Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);
	
}
