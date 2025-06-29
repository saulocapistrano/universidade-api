package br.universidade.domain.model.user;

import br.universidade.domain.vo.CPF;
import br.universidade.domain.vo.Email;
import br.universidade.domain.vo.FullName;

import java.util.UUID;

public class Student extends User {

    public Student(UUID id, FullName fullName, Email email, CPF cpf) {
        super(id, fullName, email, cpf);
    }

    @Override
    public UserType getType() {
        return UserType.STUDENT;
    }
}
