import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
   public static void main(String[] args) throws SQLException {
	
		ConnectionFactory connectionFactory = new ConnectionFactory(); 
		Connection connection = connectionFactory.recuperarconexao();
		
	    Statement stm = connection.createStatement();
	    boolean resultado=
	    		stm.execute("INSERT INTO PRODUTO (nome, descricacao) VALUES ('Mouse', 'Mouse sem fio')",Statement.RETURN_GENERATED_KEYS);       

	    ResultSet rst = stm.getGeneratedKeys();
	    while(rst.next()) {
	    	Integer id= rst.getInt(1);
	    	System.out.println("o id é "+id);
	    }
   
   }
}
