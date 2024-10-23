package Biblio;
public class Relacao {

	public static void main(String[] args) {
		
	
		Biblioteca tipo = new Biblioteca (null, null);
		Livro livro = new Livro ("minecraft", "marcos");
		
		
		System.out.println("O livro sendo procurado é "+livro.getTitulo()+" do autor "+livro.getAutor());
		
	
	}

}
