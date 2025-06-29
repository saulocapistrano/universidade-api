package br.universidade.domain.vo;

public record FullName(String firstName, String lastName) {
    public FullName {
        if (firstName == null || lastName == null) throw new IllegalArgumentException("Nome inválido");
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
