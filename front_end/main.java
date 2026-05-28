// “O FocusWork é um sistema para ajudar universitários que trabalham a organizar tarefas, horários e estudos.”
import java.util.Scanner;

public class Main {
    
    public static void main (string[] args) {
        Scanner scanner= new Scanner(System.in);

        usuario usuario = new usuario();
        
        System.out.print("Digite seu nome: ");
        usuario.nome = scanner.nextline();

        System.out.print("Horas Dormidas:");
        usuario.horasDormidas =scanner.nextInt();

        System.out.println("\nUsuario cadastrado!");
        System.out.println("Nome: " + usuario.nome);
        System.out.println("Horas dormidas: "= usuario.horasDormidas);
        
        scanner.close();
    }
}

