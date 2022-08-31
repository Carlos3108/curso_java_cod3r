package classes_metodos;

public class Usuario {
    String nome;
    String email;
    
    //Gerado pelo Intellij
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
//    Gerado na aula 
//    public boolean equals(Object objeto) {
//        if(objeto instanceof Usuario){
//            Usuario outro = (Usuario) objeto;
//            boolean nomeIgual = outro.nome.equals(this.nome);
//           boolean emailIgual = outro.email.equals(this.email);
//            return nomeIgual && emailIgual;
//        }else{
//           return false;
//        }       
//   }
}
