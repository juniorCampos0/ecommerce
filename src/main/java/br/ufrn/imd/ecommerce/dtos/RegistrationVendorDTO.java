package br.ufrn.imd.ecommerce.dtos;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class RegistrationVendorDTO {

    private final String name;

    private final String email;

    private final String password;

    private final String imgLink;

    private final String cnpj;

    private final Long postalCode;

    private final String street;

    private final Long number;

    private final String complement;

}
