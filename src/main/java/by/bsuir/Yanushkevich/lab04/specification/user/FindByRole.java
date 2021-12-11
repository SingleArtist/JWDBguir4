package by.bsuir.Yanushkevich.lab04.specification.user;

import by.bsuir.Yanushkevich.lab04.entity.Role;
import by.bsuir.Yanushkevich.lab04.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindByRole implements Specification {

    private final Role role;

    public FindByRole(Role role) {
        this.role = role;
    }

    @Override
    public String toSql() {
        return "WHERE role = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(role);
    }
}
