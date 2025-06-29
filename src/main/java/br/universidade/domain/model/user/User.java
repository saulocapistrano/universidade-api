package br.universidade.domain.model.user;
import br.universidade.domain.vo.*;

import java.util.UUID;
    public abstract class User {

        protected UUID id;
        protected FullName fullName;
        protected Email email;
        protected CPF cpf;

        protected User(UUID id, FullName fullName, Email email, CPF cpf) {
            this.id = id;
            this.fullName = fullName;
            this.email = email;
            this.cpf = cpf;
        }

        public UUID getId() { return id; }
        public FullName getFullName() { return fullName; }
        public Email getEmail() { return email; }
        public CPF getCpf() { return cpf; }

        public abstract UserType getType();
}