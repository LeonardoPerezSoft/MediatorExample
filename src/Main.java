import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escribe un mensaje para enviar (o escribe 'exit' para salir):");
            String mensaje = scanner.nextLine();


            if (mensaje.equals("exit")) {
                break;
            }


            if (mensaje.startsWith("A:")) {
                mensaje = mensaje.substring(2);
                colleagueA.enviarMensaje(mensaje);
            }

            else if (mensaje.startsWith("B:")) {
                mensaje = mensaje.substring(2);
                colleagueB.enviarMensaje(mensaje);
            }

            else {
                colleagueA.enviarMensaje(mensaje);
                colleagueB.enviarMensaje(mensaje);
            }
        }

        System.out.println("Saliendo del programa.");
    }

}