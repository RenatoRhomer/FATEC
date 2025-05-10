package login;

public class TestaConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexao c = new conexao();
        c.abrirConexao();
        
        try{
            Thread.sleep(4000);
            c.fecharConexao();
        }catch (InterruptedException ex){
            System.out.println("Houve algum problema no teste de conexão. " + ex.getMessage());
        }
    }
}
