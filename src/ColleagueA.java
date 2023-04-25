public class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("ColleagueA ha recibido el mensaje: " + mensaje);
    }
}

