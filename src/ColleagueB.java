public class ColleagueB  extends Colleague {
    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("ColleagueB ha recibido el mensaje: " + mensaje);
    }
}