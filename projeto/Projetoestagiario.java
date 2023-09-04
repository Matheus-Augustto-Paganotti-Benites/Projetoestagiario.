package projeto;

public abstract class Projetoestagiario {
        private int codigo;
        private string nome;
        private string email;
        protected string telefone;
        protected data datanascimento;
        public string usuario;
        public string senha;
        
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
        public string getEmail() {
            return email;
        }
        public void setEmail(string email) {
            this.email = email;
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
        public Projetoestagiario(int codigo, string nome, string email, string telefone, data datanascimento,
                string usuario, string senha) {
            this.codigo = codigo;
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.datanascimento = datanascimento;
            this.usuario = usuario;
            this.senha = senha;
        }
    
}
