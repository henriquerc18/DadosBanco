import tools.DBConnection;
import java.util.Scanner;

public class DadosBanco {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o email para pesquisa: ");
		
		String busca = scan.nextLine();
		
		DBConnection conn = new DBConnection();
		
		conn.executeSQL("select * from Alunos where Email = '"+busca+"'");

	}

}
