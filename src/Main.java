import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Autor> autori=new ArrayList<Autor>();
		Autor a1=new Autor("Gica");
		Autor a2=new Autor("Marian");
		autori.add(a1);
		autori.add(a2);
		Carte c1 = new Carte("Aripi",autori);
		
		AbstractElement img =new Imagine("img");
		AbstractElement tabel =new Tabel("tabel");
		AbstractElement paragraf =new Paragraf("Paragraf");
		DocumentStatisticVisitor v=new DocumentStatisticVisitor();
		img.acceptVisitor(v);
		tabel.acceptVisitor(v);
		paragraf.acceptVisitor(v);
		
		System.out.println(v);
		
		AlignStrategy aliniere=new AliniereNoua();
		aliniere.printAligned("cuvant");
		
		
		}

}
