public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");
        API api = new API();
        api.buscaCep();
    }
}