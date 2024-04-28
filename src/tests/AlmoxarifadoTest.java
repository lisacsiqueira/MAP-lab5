package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import entities.Almoxarifado;

public class AlmoxarifadoTest {

    private Almoxarifado almoxarifado;

    @Before
    public void setUp() {
        almoxarifado = new Almoxarifado();
    }

    @Test
    public void testAtualizarEstoque() {
        almoxarifado.atualizarEstoque("Canetas", 100);
        almoxarifado.atualizarEstoque("Lápis", 50);
        almoxarifado.atualizarEstoque("Borrachas", 20);

        Map<String, Integer> estoque = almoxarifado.getEstoque();

        assertNotNull(estoque);
        assertEquals(3, estoque.size());
        assertEquals(Integer.valueOf(100), estoque.get("Canetas"));
        assertEquals(Integer.valueOf(50), estoque.get("Lápis"));
        assertEquals(Integer.valueOf(20), estoque.get("Borrachas"));
    }

    @Test
    public void testRegistrarPedidoCompra() {
        almoxarifado.registrarPedidoCompra("Cadernos", 200);
        almoxarifado.registrarPedidoCompra("Tesouras", 30);

        Map<String, Integer> pedidosCompra = almoxarifado.getPedidosCompra();

        assertNotNull(pedidosCompra);
        assertEquals(2, pedidosCompra.size());
        assertEquals(Integer.valueOf(200), pedidosCompra.get("Cadernos"));
        assertEquals(Integer.valueOf(30), pedidosCompra.get("Tesouras"));
    }
}
