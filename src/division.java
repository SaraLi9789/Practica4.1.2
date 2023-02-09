
@Test
public void division() {
int esperado=2;
int a = 8;
int b = 4;
int division;

try {
division = OperadorAritmetico.division(a, b);
assertEquals(esperado, division);
} catch (Exception e) {
fail();
}
}
}