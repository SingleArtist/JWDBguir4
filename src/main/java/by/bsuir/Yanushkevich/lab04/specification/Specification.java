package by.bsuir.Yanushkevich.lab04.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
