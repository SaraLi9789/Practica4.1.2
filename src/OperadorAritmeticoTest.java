
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class OperadorAritmeticoTest {
@Test
public void suma() {
int esperado=8;
int a = 5;
int b = 3;
int suma = OperadorAritmetico.suma(a, b);
assertEquals(esperado, suma);
}
}
