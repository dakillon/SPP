
public class DocumentStatisticVisitor implements Visitor {

    private int numarTabele = 0;
    private int numarParagrafe = 0;
    private int numarImagini = 0;
    private int numarSectiuni = 0;
    
    private int pretTabel=0;
    private int pretParagrafe=0;
    private int pretImagini=0;
    private int pretSectiuni=0;
    
	
	public void visitimagineProxy(ImaginePorxy img) {
	System.out.println(img);
	 numarImagini++;
	 pretTabel=5*numarImagini;
	 
		
	}


	public void visitImagine(Imagine img) {
		System.out.println(img);
		 numarImagini++;
		 pretImagini=4*numarImagini;
		
	}


	public void visitParagraf(Paragraf parag) {
		System.out.println(parag);
		numarParagrafe++;
		pretParagrafe=2*numarParagrafe;
	}


	public void visitTabel(Tabel tabl) {
		System.out.println(tabl);
		numarTabele++;
		pretTabel=3*numarTabele;
		
	}


	public void visitSectiune(Sectiune sect) {
		System.out.println(sect);
		 numarSectiuni++;
		 pretSectiuni=6*numarSectiuni;
	}
	
	  public int getNumarTabele()
	    {
	        return numarTabele;
	    }
	    
	    public int getNumarParagrafe()
	    {
	        return numarParagrafe;
	    }
	    
	    public int getNumarImagini()
	    {
	        return numarImagini;
	    }
	    
	    public int getNumarSectiuni()
	    {
	        return numarSectiuni;
	    }
	    public int getPretTabele()
	    {
	        return pretTabel;
	    }
	    public int getPretImagini()
	    {
	        return pretImagini;
	    }
	    public int getPretSectiune()
	    {
	        return pretSectiuni;
	    }
	    public int getPretParagrafe()
	    {
	        return pretParagrafe;
	    }

	    public String toString(){
	    return "Totalul pentru imagini este "+this.getPretImagini()+"\n"+"Totalul este ";
	
}

		
		

}
