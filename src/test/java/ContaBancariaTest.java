import br.unipar.ContaCorrente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testDepositoContaCorrente(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000d);
    }
}
