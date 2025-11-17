public class Main {

    public static void testPPay(PPay pp) {
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }

    public static void main(String[] args) {
        MpayImpl antigo = new MpayImpl();
        antigo.setCustomerName("Maria Silva");
        antigo.setCreditCardNo("5555-4444-3333-2222");
        antigo.setCardExpMonth("06");
        antigo.setCardExpYear("2030");
        antigo.setCardCVVNo((short) 123);
        antigo.setAmount(250.75);

        PPay adaptado = new Adapter(antigo);

        System.out.println("=== Testando Pagamento com Adapter ===");
        testPPay(adaptado);
    }
}
