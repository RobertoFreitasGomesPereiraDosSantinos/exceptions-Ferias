package exeção;

public class Leitor2 implements AutoCloseable{

    public void close() throws Exception {
        System.out.println("fechando o segundo leitor");        
    }
    
}
