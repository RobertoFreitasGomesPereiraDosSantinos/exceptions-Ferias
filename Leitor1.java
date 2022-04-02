package exeção;

public class Leitor1 implements AutoCloseable{

    public void close() throws Exception {
        System.out.println("fechando o primeiro leitor");
    }
    
}
