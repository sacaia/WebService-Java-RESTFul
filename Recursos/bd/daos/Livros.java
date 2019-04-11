package bd.daos;

import java.sql.*;
import java.util.ArrayList;

import bd.*;
import bd.core.*;
import bd.dbos.*;

public class Livros
{
    public static boolean cadastrado (int codigo) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM LIVRO " +
                  "WHERE codLivro = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); // pode-se usar resultado.last() ou resultado.next() ou resultado.previous() ou resultado.absotule(numeroDaLinha)

            /* // ou, se preferirmos,

            String sql;

            sql = "SELECT COUNT(*) AS QUANTOS " +
                  "FROM LIVROS " +
                  "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            resultado.first();

            retorno = resultado.getInt("QUANTOS") != 0;

            */
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar livro");
        }

        return retorno;
    }

    public static void incluir (Livro livro) throws Exception
    {
        if (livro==null)
            throw new Exception ("Livro nao fornecido");

        try
        {
            String sql;

            sql = "INSERT INTO LIVRO " +
                  "(codLivro,NOME,PRECO) " +
                  "VALUES " +
                  "(?,?,?)";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt    (1, livro.getCodigo ());
            BDSQLServer.COMANDO.setString (2, livro.getNome ());
            BDSQLServer.COMANDO.setFloat  (3, livro.getPreco ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao inserir livro");
        }
    }

    public static void excluir (int codigo) throws Exception
    {
        if (!cadastrado (codigo))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM LIVRO " +
                  "WHERE codLivro=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir livro");
        }
    }

    public static void alterar (Livro livro) throws Exception
    {
        if (livro==null)
            throw new Exception ("Livro nao fornecido");

        if (!cadastrado (livro.getCodigo()))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "UPDATE LIVRO " +
                  "SET NOME=? " +
                  ", PRECO=? " +
                  "WHERE codLivro = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, livro.getNome ());
            BDSQLServer.COMANDO.setFloat  (2, livro.getPreco ());
            BDSQLServer.COMANDO.setInt    (3, livro.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados de livro");
        }
    }

    public static Livro getLivro (int codigo) throws Exception
    {
        Livro livro = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM LIVRO " +
                  "WHERE codLivro = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Nao cadastrado");

            livro = new Livro (resultado.getInt   ("codLivro"),
                               resultado.getString("NOME"),
                               resultado.getFloat ("PRECO"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar livro");
        }

        return livro;
    }

    public static MeuResultSet getLivros () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM LIVRO";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar livros");
        }

        return resultado;
    }
    
    public static Livro[] listar() throws Exception
    {
    	Livro livro = null;
    	Livro[] livros = null;
        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM LIVRO ";

            BDSQLServer.COMANDO.prepareStatement (sql);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Nao existem livros cadastrados");
            
            ArrayList<Livro> lista = new ArrayList<Livro>();
            int i=0;
            
            do
            {
            	lista.add(new Livro(resultado.getInt("codLivro"), resultado.getString("NOME"), resultado.getFloat("PRECO")));
            	i++;
            }while(resultado.next() == true);
            	
            livros = new Livro[i];
            for(int j=0; j<i; j++)
            {
            	livros[j] = lista.get(j);
            }
			
	    }
	    catch (SQLException erro)
	    {
	    	erro.printStackTrace();
	        throw new Exception ("Erro ao recuperar livros");
	    }
        
        return livros;
    }
}