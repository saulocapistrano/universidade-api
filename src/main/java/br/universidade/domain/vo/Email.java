package br.universidade.domain.vo;

import java.util.regex.Pattern;

public record Email(String value) {

    private static final Pattern EMAIL_REGEX = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

    public Email {
        if (!EMAIL_REGEX.matcher(value).matches()) {
            throw new IllegalArgumentException("Email inválido: " + value);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
