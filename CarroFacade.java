public class CarroFacade {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta portas;
    private Farol farol;
    private Radio radio;

    // Construtor
    public CarroFacade(Motor motor, CintoDeSeguranca cinto, Porta portas, Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.portas = portas;
        this.farol = farol;
        this.radio = radio;
    }

    // Método para iniciar a corrida
    public void iniciarCorrida(String estacaoPreferida) {
        System.out.println("Preparando para iniciar a corrida...");

        motor.ligar();
        portas.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);

        System.out.println("Corrida iniciada!");
    }

    // Método para finalizar a corrida
    public void finalizarCorrida() {
        System.out.println("Finalizando a corrida...");

        motor.desligar();
        portas.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();

        System.out.println("Corrida finalizada.");
    }
}
