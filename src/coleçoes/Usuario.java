package coleçoes;

public class Usuario {
    
    String nome;

    Usuario(String nome){
        this.nome = nome;
    }
    

    @Override
    public boolean equals (Object obj){
        if(this == obj)
            return true;
        if (obj == null)
            return false; 
        if(getClass()!= obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if(nome == null){
            if(other.nome != null)
            return false;
        }else if(!nome.equals(other.nome))
            return false;
        return true;
    }
            
}
