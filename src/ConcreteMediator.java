public class ConcreteMediator  implements Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void enviarMensaje(String mensaje, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.recibirMensaje(mensaje);
        } else if (colleague == colleagueB) {
            colleagueA.recibirMensaje(mensaje);
        }
    }
}