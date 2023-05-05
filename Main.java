import src.Banck;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        // chamada do objeto Banck
        Banck use = new Banck();
        Scanner scanner = new Scanner(System.in);


        // utilizando os metodos
        // Interface
        use.setNome("Marcos Monteiro");
        use.setAgencia(4432);
        use.setConta("90587-02");
        int exite = 0;


        System.out.println("*******************");
        System.out.println("\n\nOla, seja muito bem-vindo ao Banco pac-man \n\nNome: " + use.getNome() + "\n\nAgencia: " + use.getAgencia() + "\n\nConta: " + use.getConta());
        System.out.println("\n\n *******************");

        
        
        while(exite < 4){
            
            System.out.println("\n\nMenu \n\n1 - Ver Saldo\n2 - Depositar\n3 - Sacar\n4 - Sair");
            int menu = scanner.nextInt();

            switch(menu){
                case 1:
                    System.out.println("Seu saldo e: " + use.getSaldo());
                    break;
                case 2:
                    System.out.println("Qual o valor que deseja depositar?");
                    double depesitar = scanner.nextDouble();
                    use.depositar(depesitar);
                    break;
                case 3:
                    System.out.println("Qual valor deseja sacar?");
                    double sacar = scanner.nextDouble();
                    use.sacar(sacar);
                    break;
                case 4:
                    exite = 4;
                    break;
                default:
                throw new RuntimeException("Dados invalidos!\n\n\nFavor usar somete as opções da lista");
            }
        }
    }
}