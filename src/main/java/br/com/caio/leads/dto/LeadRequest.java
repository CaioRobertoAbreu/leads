package br.com.caio.leads.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CPF;

@Builder
@Getter
public class LeadRequest {

    @NotEmpty(message = "Informe um lead id")
    private String leadId;

    @NotEmpty(message = "Informe um nome")
    private String nome;

    @NotEmpty(message = "Informe um cpf")
    @CPF
    private String cpf;

    @NotEmpty(message = "Informe um email")
    @Email
    private String email;

    @NotEmpty(message = "Informe um telefone")
    private String telefone;

}
