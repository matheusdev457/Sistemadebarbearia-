import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

  System.out.println("OLÁ, digite seu nome:");
       
         String nome = scanner.nextLine();
  System.out.println("olá, " + nome);
         System.out.println("Gostaria de agendar um horáio em nossa barbearia , " + nome +"? (sim/não)");
          
         String resposta = scanner.nextLine();
         
         if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Qual horario o senhor gostaria ?");
                String horario = scanner.nextLine();

        System.out.println("o corte é 35,00");
System.out.println("Seu horário está marcado para " + horario + "!" );
      
         System.out.println("deixe sua avaliação de 0 a 5 para o nosso atendimento: ");
                   int avaliação = scanner.nextInt();
        System.out.println("Obrigado pela sua avaliação " + nome + "!");      
         } else {
System.out.println("Tudo bem " + nome + " Até a próxima!");
          scanner.close();

         }
    }
}
 