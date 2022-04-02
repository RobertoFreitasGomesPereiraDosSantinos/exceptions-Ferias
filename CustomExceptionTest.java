package exeção;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } finally {
            System.out.println("execução do try finalizada");
        }
    }
    private static void login() throws LoginInvalidoException {
        String usu_D = "rapeto";
        String usu = "rapeto";
        String pas_D = "1123";
        String pas = "1121";
        if (!usu.equals(usu_D) || !pas.equals(pas_D)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("ta logado parsa");
        }
    }
}
