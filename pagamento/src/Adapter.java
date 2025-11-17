public class Adapter implements PPay {

    private MPay mpay;

    public Adapter(MPay mpay) {
        this.mpay = mpay;
    }

    public String getCustCardNo() {
        return mpay.getCreditCardNo();
    }

    public String getCardOwnerName() {
        return mpay.getCustomerName();
    }

    public String getCardExpMonthDate() {
        return mpay.getCardExpMonth() + "/" + mpay.getCardExpYear();
    }

    public Integer getCVVNo() {
        return mpay.getCardCVVNo().intValue();
    }

    public Double getTotalAmount() {
        return mpay.getAmount();
    }

    public void setCustCardNo(String custCardNo) {
        mpay.setCreditCardNo(custCardNo);
    }

    public void setCardOwnerName(String cardOwnerName) {
        mpay.setCustomerName(cardOwnerName);
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        String[] p = cardExpMonthDate.split("/");
        mpay.setCardExpMonth(p[0]);
        mpay.setCardExpYear(p[1]);
    }

    public void setCVVNo(Integer cVVNo) {
        mpay.setCardCVVNo(cVVNo.shortValue());
    }

    public void setTotalAmount(Double totalAmount) {
        mpay.setAmount(totalAmount);
    }
}
