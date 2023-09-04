ackage projeto;

public class Passgeiro {

    public int codigo;
    public string nome;
    public string telefone;
    public string usuario;
    protected string numerocartao;
    protected string documento;
    protected string registro;
    private string email;
    public Passgeiro(int codigo, string nome, string telefone, string usuario, string numerocartao, string documento,
            string registro, string email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = usuario;
        this.numerocartao = numerocartao;
        this.documento = documento;
        this.registro = registro;
        this.email = email;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public string getNome() {
        return nome;
    }
    public void setNome(string nome) {
        this.nome = nome;
    }
    public string getTelefone() {
        return telefone;
    }
    public void setTelefone(string telefone) {
        this.telefone = telefone;
    }
    public string getUsuario() {
        return usuario;
    }
    public void setUsuario(string usuario) {
        this.usuario = usuario;
    }
    public string getNumerocartao() {
        return numerocartao;
    }
    public void setNumerocartao(string numerocartao) {
        this.numerocartao = numerocartao;
    }
    public string getDocumento() {
        return documento;
    }
    public void setDocumento(string documento) {
        this.documento = documento;
    }
    public string getRegistro() {
        return registro;
    }
    public void setRegistro(string registro) {
        this.registro = registro;
    }
    public string getEmail() {
        return email;
    }
    public void setEmail(string email) {
        this.email = email;
    }

    

}

