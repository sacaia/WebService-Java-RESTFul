package bd.daos;

import java.sql.*;
import java.util.ArrayList;

import bd.*;
import bd.core.*;
import bd.dbos.*;

public class Alunos
{
    public static boolean cadastrado (int novoRa) throws Exception
    {
        if (novoRa > 99999 || novoRa < 10000)
            throw new Exception ("RA inválido");

        String ra2 = "" + novoRa;

        return cadastrado(ra2);
    }

    public static boolean cadastrado (String ra) throws Exception
    {
        boolean retorno = false;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM ALUNO " +
                  "WHERE RA = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, ra);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            retorno = resultado.first(); // pode-se usar resultado.last() ou resultado.next() ou resultado.previous() ou resultado.absotule(numeroDaLinha)

            /* // ou, se preferirmos,

            String sql;

            sql = "SELECT COUNT(*) AS QUANTOS " +
                  "FROM ALUNO " +
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
            throw new Exception ("Erro ao procurar Aluno");
        }

        return retorno;
    }

    public static void incluir (Aluno aluno) throws Exception
    {
        if (aluno==null)
            throw new Exception ("Aluno não fornecido");
        
        if (cadastrado(aluno.getRa()))
            throw new Exception ("Aluno já cadastrado");

        try
        {
            String sql;

            sql = "INSERT INTO ALUNO " +
                  "(RA,NOME,EMAIL) " +
                  "VALUES " +
                  "(?,?,?)";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, aluno.getRa ());
            BDSQLServer.COMANDO.setString (2, aluno.getNome ());
            BDSQLServer.COMANDO.setString (3, aluno.getEmail ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            //throw new Exception ("Erro ao inserir aluno");
            throw new Exception (erro);
        }
    }

    public static void excluir (int novoRa) throws Exception
    {
        if (novoRa > 99999 || novoRa < 10000)
            throw new Exception ("RA inválido");

        String ra2 = "" + novoRa;

        excluir(ra2);
    }

    public static void excluir (String ra) throws Exception
    {
        if (!cadastrado (ra))
            throw new Exception ("Aluno não cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM ALUNO " +
                  "WHERE RA=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, ra);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao excluir aluno");
        }
    }

    public static void alterar (Aluno aluno) throws Exception
    {
        if (aluno==null)
            throw new Exception ("Aluno não fornecido");

        if (!cadastrado (aluno.getRa()))
            throw new Exception ("Aluno não cadastrado");

        try
        {
            String sql;

            sql = "UPDATE ALUNO " +
                  "SET NOME=? " +
                  ", EMAIL=? " +
                  "WHERE RA = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, aluno.getNome ());
            BDSQLServer.COMANDO.setString (2, aluno.getEmail ());
            BDSQLServer.COMANDO.setString (3, aluno.getRa ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao atualizar dados de aluno");
        }
    }

    public static Aluno getAluno (int novoRA) throws Exception
    {
        if (novoRA > 99999 || novoRA < 10000)
            throw new Exception ("RA inválido");

        String ra2 = "" + novoRA;

        return getAluno(ra2);
    }

    public static Aluno getAluno (String ra) throws Exception
    {
        Aluno aluno = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM ALUNO " +
                  "WHERE RA = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, ra);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Aluno não cadastrado");

            aluno = new Aluno (resultado.getString("RA"),
                               resultado.getString("NOME"),
                               resultado.getString("EMAIL"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar aluno");
        }

        return aluno;
    }

    public static MeuResultSet getAlunos () throws Exception
    {
        MeuResultSet resultado = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM ALUNO";

            BDSQLServer.COMANDO.prepareStatement (sql);

            resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar Alunos");
        }

        return resultado;
    }
    
    public static Aluno[] listar() throws Exception
    {
    	Aluno[] Alunos = null;
        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM ALUNO ";

            BDSQLServer.COMANDO.prepareStatement (sql);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Nao existem alunos cadastrados");
            
            ArrayList<Aluno> lista = new ArrayList<Aluno>();
            int i=0;
            
            do
            {
            	lista.add(new Aluno(resultado.getString("RA"), resultado.getString("NOME"), resultado.getString("EMAIL")));
            	i++;
            }while(resultado.next() == true);
            	
            Alunos = new Aluno[i];
            for(int j=0; j<i; j++)
            {
            	Alunos[j] = lista.get(j);
            }
			
	    }
	    catch (SQLException erro)
	    {
	    	erro.printStackTrace();
	        throw new Exception ("Erro ao recuperar Alunos");
	    }
        
        return Alunos;
    }
    
    public static Aluno[] listarNome(String nome) throws Exception
    {
    	Aluno[] Alunos = null;
        try
        {
            String sql;

            sql = "SELECT * " +
                  "FROM ALUNO " + 
                  "WHERE nome LIKE ?";

            BDSQLServer.COMANDO.prepareStatement (sql);
            
            BDSQLServer.COMANDO.setString (1, "%" + nome + "%");

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            if (!resultado.first())
                throw new Exception ("Não existem alunos cadastrados com esse nome");
            
            ArrayList<Aluno> lista = new ArrayList<Aluno>();
            int i=0;
            
            do
            {
            	lista.add(new Aluno(resultado.getString("RA"), resultado.getString("NOME"), resultado.getString("EMAIL")));
            	i++;
            }while(resultado.next() == true);
            	
            Alunos = new Aluno[i];
            for(int j=0; j<i; j++)
            {
            	Alunos[j] = lista.get(j);
            }
			
	    }
	    catch (SQLException erro)
	    {
	    	erro.printStackTrace();
	        throw new Exception ("Erro ao recuperar Alunos");
	    }
        
        return Alunos;
    }
}