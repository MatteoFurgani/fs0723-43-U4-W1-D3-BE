package entities.es3;

public class Cliente {
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String codiceCliente, String nomeCognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }
}
