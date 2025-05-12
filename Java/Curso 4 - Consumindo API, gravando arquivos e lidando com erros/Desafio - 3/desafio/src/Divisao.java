public class Divisao {
    public static void main(String[] args) throws Exception {
        try{
            int total = 10/0;
            System.out.println(total);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
