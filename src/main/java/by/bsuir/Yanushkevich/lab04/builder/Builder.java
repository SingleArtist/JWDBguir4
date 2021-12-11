package by.bsuir.Yanushkevich.lab04.builder;

import by.bsuir.Yanushkevich.lab04.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
