package pojo;

public class UsuarioPojo {
    private String usuarioLogin;
    private String usuarioSenha;

    public UsuarioPojo (String usuarioLogin, String usuarioSenha){
        this.usuarioLogin = usuarioLogin;
        this.usuarioSenha = usuarioSenha;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }
}
