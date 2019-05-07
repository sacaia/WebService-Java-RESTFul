package bd.dbos;

public class Aluno implements Cloneable
{
    private String ra;
    private String nome;
    private String email;
 
    public void setRa (String novoRa) throws Exception
    {
        if (novoRa == null || novoRa.equals(""))
            throw new Exception ("RA invalido");

        this.ra = novoRa;
    }

    public void setNome (String novoNome) throws Exception
    {
        if (novoNome==null || novoNome.equals(""))
            throw new Exception ("Nome nao fornecido");

        this.nome = novoNome;
    }

    public void setEmail (String novoEmail) throws Exception
    {
        if (novoEmail==null || novoEmail.equals(""))
            throw new Exception ("Email nao fornecido");

        this.email = novoEmail;
    }

    public String getRa ()
    {
        return this.ra;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public String getEmail ()
    {
        return this.email;
    }
    
    public Aluno()
    {
        ra    = null;
        nome  = null;
        email = null;
    }

    public Aluno (String ra, String nome, String email) throws Exception
    {
        this.setRa    (ra);
        this.setNome   (nome);
        this.setEmail  (email);
    }

    public String toString ()
    {
        String ret="";

        ret+="RA...: "+this.ra+"\n";
        ret+="Nome.: "+this.nome  +"\n";
        ret+="Email: "+this.email;

        return ret;
    }

    public String toJson()
    {
        String ret="";

        ret = "{\r\n" +
        	     "\t\"ra\" : \"" + this.ra    + "\",\r\n" +
        	   "\t\"nome\" : \"" + this.nome  + "\",\r\n" +
        	  "\t\"email\" : \"" + this.email + "\"\r\n"  +
        	  "}"; 
        
        return ret;
    }
    
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (!(obj instanceof Aluno))
            return false;

        Aluno al = (Aluno)obj;

        if (!this.ra.equals(al.ra))
            return false;

        if (!this.nome.equals(al.nome))
            return false;

        if (!this.email.equals(al.email))
            return false;

        return true;
    }

    public int hashCode ()
    {
        int ret=666;

        ret = 7*ret + this.ra.hashCode();
        ret = 7*ret + this.nome.hashCode();
        ret = 7*ret + this.email.hashCode();

        return ret;
    }


    public Aluno (Aluno modelo) throws Exception
    {
        this.ra     = modelo.ra; // nao clono, pq nao eh objeto
        this.nome   = modelo.nome;   // nao clono, pq nao eh clonavel
        this.email  = modelo.email;  // nao clono, pq nao eh objeto
    }

    public Object clone ()
    {
        Aluno ret=null;

        try
        {
            ret = new Aluno (this);
        }
        catch (Exception erro)
        {} // nao trato, pq this nunca � null e construtor de
           // copia da excecao qdo seu parametro for null

        return ret;
    }
}