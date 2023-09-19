package pablo.maruottolo.a02_ejemplorecogerinformacion.modelos;

public class Usuarios {
    //atributos
    private String email;
    private String password;

    //constructores

    public Usuarios() {
    }
    public Usuarios(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuarios : " + "email='" + email + '\'' + ", password='" + password ;
    }
}
