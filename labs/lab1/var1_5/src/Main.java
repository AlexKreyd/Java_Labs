public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int product = 1;

        for (int i = 0; i < args.length; i++){
            try {
                int n = Integer.parseInt(args[i]);
                sum += n;
                product *= n;
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
        System.out.printf("Сумма = %d, прозведение = %d", sum, product);
    }
}