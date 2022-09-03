package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public static UsuarioPojo UsuarioAdmin(String Login, String Senha){
        UsuarioPojo usuario = new UsuarioPojo(Login, Senha);
        return usuario;
    }
}
