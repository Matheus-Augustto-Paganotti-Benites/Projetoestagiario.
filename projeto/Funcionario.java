package projeto;

public class Funcionario {
    
        public int codigo;
        public string nome;
        public string telefone;
        protected data datanascimento;
        public string usuario;
        protected string senha;
        protected string contacorrente;
        public string cracha;
        
        public Funcionario(int codigo, string nome, string telefone, data datanascimento, string usuario, string senha,
                string contacorrente, string cracha) {
            this.codigo = codigo;
            this.nome = nome;
            this.telefone = telefone;
            this.datanascimento = datanascimento;
            this.usuario = usuario;
            this.senha = senha;
            this.contacorrente = contacorrente;
            this.cracha = cracha;
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

        public data getDatanascimento() {
            return datanascimento;
        }

        public void setDatanascimento(data datanascimento) {
            this.datanascimento = datanascimento;
        }

        public string getUsuario() {
            return usuario;
        }

        public void setUsuario(string usuario) {
            this.usuario = usuario;
        }

        public string getSenha() {
            return senha;
        }

        public void setSenha(string senha) {
            this.senha = senha;
        }

        public string getContacorrente() {
            return contacorrente;
        }

        public void setContacorrente(string contacorrente) {
            this.contacorrente = contacorrente;
        }

        public string getCracha() {
            return cracha;
        }

        public void setCracha(string cracha) {
            this.cracha = cracha;
        }
    
        
}
