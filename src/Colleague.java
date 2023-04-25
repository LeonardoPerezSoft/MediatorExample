abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void enviarMensaje(String mensaje);

    public void recibirMensaje(String mensaje) {
        System.out.println("[" + getClass().getSimpleName() + "] ha recibido el mensaje: " + mensaje);
    }
}