public class Senha {
    public static void main(String[] args) {
        int senha = 1234567;

        try{
            if(senha != 12345678){
                throw new SenhaInvalidaException("Senha invalida");
            }
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
