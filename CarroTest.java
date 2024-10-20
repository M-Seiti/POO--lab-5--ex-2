public class CarroTest {
    public static void main(String[] args) {
        // Criando os objetos dos componentes do carro
        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta portas = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        // Criando a fachada do carro
        CarroFacade carro = new CarroFacade(motor, cinto, portas, farol, radio);

        // Iniciar a corrida
        carro.iniciarCorrida("Rádio Rock FM");

        // Finalizar a corrida
        carro.finalizarCorrida();
    }
}
