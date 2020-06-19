import java.util.Scanner;

public class AddQueUsaPessoa {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		

		
		Pessoa p = new Pessoa("Isidro","Isidro@isi.com", 1000);
		
		
		System.out.println(p.getNome());
		System.out.println(p.getEmail());
		System.out.println(p.getSalario());
	}

}
