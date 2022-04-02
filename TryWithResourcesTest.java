package exeção;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        try (Leitor1 le1 = new Leitor1();
             Leitor2 le2 = new Leitor2();) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
