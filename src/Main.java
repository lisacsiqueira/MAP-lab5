//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import entities.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos subsistemas
        Administrativo administrativo = new Administrativo();
        Financeiro financeiro = new Financeiro();
        Almoxarifado almoxarifado = new Almoxarifado();

        // Testando o subsistema administrativo
        administrativo.agendarReuniao("Reunião de diretoria");
        administrativo.agendarReuniao("Reunião de equipe");
        administrativo.agendarEntrevista("Entrevista com candidato 1");
        administrativo.agendarEntrevista("Entrevista com candidato 2");

        System.out.println("Reuniões agendadas:");
        for (String reuniao : administrativo.getReunioesAgendadas()) {
            System.out.println("- " + reuniao);
        }

        System.out.println("\nEntrevistas agendadas:");
        for (String entrevista : administrativo.getEntrevistas()) {
            System.out.println("- " + entrevista);
        }

        // Testando o subsistema financeiro
        financeiro.atualizarBalancoContas("Balanço mensal", 50000.0);
        financeiro.atualizarBalancoContas("Reservas", 20000.0);
        financeiro.processarFolhaPagamento("Funcionário 1", 3000.0);
        financeiro.processarFolhaPagamento("Funcionário 2", 2500.0);

        System.out.println("\nBalanço de contas:");
        for (Map.Entry<String, Double> entry : financeiro.getBalancoContas().entrySet()) {
            System.out.println("- " + entry.getKey() + ": $" + entry.getValue());
        }

        System.out.println("\nFolha de pagamento:");
        for (Map.Entry<String, Double> entry : financeiro.getFolhaPagamento().entrySet()) {
            System.out.println("- " + entry.getKey() + ": $" + entry.getValue());
        }

        // Testando o subsistema de almoxarifado
        almoxarifado.atualizarEstoque("Canetas", 100);
        almoxarifado.atualizarEstoque("Papéis", 200);
        almoxarifado.registrarPedidoCompra("Toner", 5);

        System.out.println("\nEstoque atual:");
        for (Map.Entry<String, Integer> entry : almoxarifado.getEstoque().entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " unidades");
        }

        System.out.println("\nPedidos de compra:");
        for (Map.Entry<String, Integer> entry : almoxarifado.getPedidosCompra().entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}
