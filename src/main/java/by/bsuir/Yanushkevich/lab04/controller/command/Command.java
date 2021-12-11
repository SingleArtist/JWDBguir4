package by.bsuir.Yanushkevich.lab04.controller.command;

import by.bsuir.Yanushkevich.lab04.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
