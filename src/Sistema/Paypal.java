package Sistema;

//bibliotecas
import java.time.LocalDateTime;

public class Paypal {
    private String emailPaypal;
    private String userPaypal;
    private Double valorPaypal;
    private LocalDateTime dataHoraPaypal;

    //constructors
    public Paypal(String emailPaypal, String userPaypal, Double valorPaypal, LocalDateTime dataHoraPaypal) {
        this.emailPaypal = emailPaypal;
        this.userPaypal = userPaypal;
        this.valorPaypal = valorPaypal;
        this.dataHoraPaypal = dataHoraPaypal;
    }

    //getters and setters
    public String getEmailPaypal() {
        return emailPaypal;
    }

    public void setEmailPaypal(String EmailPaypal) {
        this.emailPaypal = EmailPaypal;
    }

    public String getUserPaypal() {
        return userPaypal;
    }

    public void setUSerPaypal(String UserPaypal) {
        this.userPaypal = userPaypal;
    }

    public Double getValorPaypal() {
        return valorPaypal;
    }

    public void setValorPaypal(Double ValorPaypal) {
        this.valorPaypal = valorPaypal;
    }

    public LocalDateTime getDDataHoraPaypal() {
        return dataHoraPaypal;
    }

    public void setDataHoraPaypal(LocalDateTime dataHoraPaypal) {
        this.dataHoraPaypal = dataHoraPaypal;
    }

    @Override
    public String toString()
    {}
}


