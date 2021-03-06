package m05EntornosdeDesarrolloActividad2;
import static org.junit.Assert.assertFalse;
/*
 * Maria Isabel Calzadilla
 * UF2 M05
 * Test TDD
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Creacion de cuenta corriente
 */
class JavaProjectTest {

	
	static Cuenta cuenta; 
	
	@Test       // testeo inicial para verificar si se ha iniciado la cuneta en cero
	void testProvaCuentaCero() {   // test crear cuenta con saldo cero
		Cuenta cuenta = new Cuenta();
		assertEquals(0, cuenta.saldoInicial); //m�etodo que tiene como parametro inicial el resultado esperado "0", y el m�etodo a verificar de dicho valor					
	}
	
	
	@Test  // verifica si sumas 100 al saldo lo acepta
	void testProvaSaldo100() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingresaSaldoa100(100);
		assertEquals(100, cuenta.getIngresoSaldoa100());
	}
	
	@Test  // verifica saldo a 3000
	void testProvaSaldo3000() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingresaSaldoa3000(3000);
		assertEquals(3000, cuenta.getIngresaSaldoa3000());
	}
	
	@Test
	void testProvasaldo3100() { // verifica saldo a 3100
		Cuenta cuenta = new Cuenta();
		cuenta.setIngresaSaldoa3100(3000, 100); // el valor del double x
		assertEquals(3100, cuenta.getIngresaSalda3100());
	}
	
	
	
	/*
	//@Test
	//void testProvaSaldoNegativo() {
		
		//Cuenta cuenta = new Cuenta();
		//cuenta.ingresaSaldo = (-700);
		//assertEquals(0, cuenta.getSaldoNegativo());
	//}
	
	@Test
	void testSaldoNegativo() {
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldoNegativo(-8);
		assertTrue(true);
	}
	*/
	
	/// revisar el porque el asserttrue no funciona para retornar el valor de un metodo a otro
	@Test
	void testNegativoesCero() {
		Cuenta cuenta = new Cuenta();
		cuenta.saldoNegativoesCero(-100);
		assertEquals(0, cuenta.getSaldoNegativoesCero());
	}
	
	@Test  // el test equipara por aproximacion los valores
	void testCuentaDecimales() {
		Cuenta cuenta = new Cuenta();
		cuenta.setCuentaDecimales(234.89678);
		assertEquals(234.90, cuenta.getCuentaDecimales());	
	}
	
	@Test // test condicional de maxima cantidad
	void testCantidadMaximaAingresar() {
		Cuenta cuenta = new Cuenta();
		cuenta.setCantidadMaxima(6000.00);
		assertEquals(6000.00, cuenta.getCantidadMaxima());
	}
	
	@Test 
	void testInicioRetiradas() {
		Cuenta cuenta = new Cuenta();
		cuenta.setRetiraSaldo(100, 500);
		assertEquals(400, cuenta.getRetiraSaldo());
	}
	
	@Test
	void testRetiroMayorqueSaldo() {
		Cuenta cuenta = new Cuenta();
		cuenta.setRetiroMayorqueSaldo(800, 500);
		assertEquals(300, cuenta.getRetiroMayorqueSaldo());
	}
	
	@Test
	void testRetiroCantidadNegativa() {
		Cuenta cuenta = new Cuenta();
		cuenta.setRetiroCantidadNegativa(500, -100);
		assertEquals(500, cuenta.getRetiroCantidadNegativa());
	}

	@Test ///////////////////////////////CHECK
	void testRetiroMaximoDosDecimales() {
		Cuenta cuenta = new Cuenta();
		cuenta.setRetiroMaxDosDecimales(500, 100.80);
		assertEquals(400, cuenta.getRetiroMaxDosDecimales());
	}
	
	@Test
	void testRetiroMaximoenCuenta() {
		Cuenta cuenta = new Cuenta();
		cuenta.setRetiroMaxEnCuenta(7000, 6000.01);
		assertEquals(7000, cuenta.getRetiroMaxEnCuenta());
	}
	
	@Test // transferenca entre cuentas y nueva cuenta secundaria
	void testTransferenciaEntreCuentas() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.setTransfiereCuentas(500, 100, 50);
		cuenta2.setTransfiereCuentas(500, 100, 50);
		assertEquals(400, cuenta.getSaldoCuenta1());
		assertEquals(150, cuenta2.getSaldoCuenta2());
	}
	
	@Test   // transferencias condicionadas al saldo, negativo o no y disponibilidad del mismo
	void testTransferenciaSaldosNegativos() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.setSaldoNegativo(500, -100, 50);
		cuenta2.setSaldoNegativo(500, -100, 50);
		assertEquals(500, cuenta.getSaldoNegativo());
		assertEquals(50, cuenta2.getSaldoNegativoCuenta2());
	}
	
	@Test // transferencia limite diario
	void  testTransferenciaLimites() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.setTransferenciaLimite(3500, 3000, 50);
		assertEquals(500, cuenta.getTransferenciaLimite());
		cuenta2.setTransferenciaLimite(3500, 3000, 50);
		assertEquals(3050, cuenta2.getTransferenciaLimiteCuenta2());
	}
	
	@Test
	void testLimiteMaximoTransferenciasinDecimales() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.setTransferenciaLimite(3500, 3000.01, 50);
		assertEquals(3500, cuenta.getTransferenciaLimite());
		cuenta2.setTransferenciaLimite(500, 3000.01, 50);
		assertEquals(50, cuenta2.getTransferenciaLimiteCuenta2());
	}
	
	@Test
	void testLimiteMaximoVariasTransferencias() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.setTransferenciasVariasLimiteDiario(3500, 2000, 50, 1200);
		assertEquals(1500, cuenta.getTransferenciasVariasLimite());
		cuenta2.setTransferenciasVariasLimiteDiario(3500, 2000, 50, 1200);
		assertEquals(2050, cuenta2.getTransferenciasVariasCuenta2());
	}
}


	
	
	