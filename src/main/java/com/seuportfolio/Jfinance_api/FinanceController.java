package com.seuportfolio.Jfinance_api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // Diz ao Spring: "Essa classe controla URLs da web"
@RequestMapping("/api") // Todas as URLs começarão com /api
public class FinanceController {
    // Simulando um banco de dados na memória (Lista simples)
    private List<Transacao> transacoes = new ArrayList<>();

    // URL: GET http://localhost:8080/api/transacoes
    // Função: Listar tudo
    @GetMapping("/transacoes")
    public List<Transacao> listar() {
        return transacoes; // O Spring transforma essa Lista em JSON automaticamente!
    }

    // URL: POST http://localhost:8080/api/transacoes
    // Função: Adicionar nova transação
    @PostMapping("/transacoes")
    public String adicionar(@RequestBody Transacao novaTransacao) {
        transacoes.add(novaTransacao);
        return "Transação recebida com sucesso!";
    }

    // URL: GET http://localhost:8080/api/saldo
    // Função: Calcular saldo
    @GetMapping("/saldo")
    public double verSaldo() {
        double receitas = transacoes.stream()
                .filter(t -> t.tipo().equalsIgnoreCase("RECEITA"))
                .mapToDouble(Transacao::valor)
                .sum();

        double despesas = transacoes.stream()
                .filter(t -> t.tipo().equalsIgnoreCase("DESPESA"))
                .mapToDouble(Transacao::valor)
                .sum();

        return receitas - despesas;
    }
}
