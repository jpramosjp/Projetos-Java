import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Cerveja cv = new Cerveja("Bavaria", "Bavaria", 2.65, 13.5, new Date(2020 - 12 - 10));
        Computador pc = new Computador("Qbex", "Qbex High Definition", 1700.90, "1 terabyte", "i7 9 geracao", "8GB RAM");
        Televisao tv = new Televisao("Samsung", "Crystal Hud", 3000.0, "4k", 5.0, "65 Polegadas");
        
        Pedido cePedido = new Pedido(cv, 7, cv);
        Pedido pcPedido = new Pedido(pc, 2, pc);
        Pedido tvpedido = new Pedido(tv, 5, tv);
        
        Carrinho carrinhoo = new Carrinho();

        carrinhoo.addPedidos(pcPedido);
        carrinhoo.addPedidos(tvpedido);
        carrinhoo.addPedidos(cePedido);

        System.out.println(carrinhoo.listarPedidos());
        System.out.println(carrinhoo.somarPedidos() + " itens");
        System.out.println("R$ " + carrinhoo.precoTotal());
        Pagamento cartao= new PagamentoCartao();
        System.out.println(carrinhoo.efetuarPagamento(cartao));
        System.out.println(carrinhoo.listarPedidos());
    }
}
