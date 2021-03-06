import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_prinipio_saco_un_1_voy_a_casilla_1(){
        //Arrange
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");
        sut.agregar("Maria");
        sut.agregar("Juan");
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posicion de María es 1";

        //Act

        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void problema1Testeo(){
        Game game = new Game();
        game.agregar("Maria");
        boolean esJugable = game.esJugable();
        if (!esJugable) {
            System.out.println("Deben ser minimo 2");
            System.out.println("--Terminando programa--");
            System.exit(1);
        }
    }
    
}
