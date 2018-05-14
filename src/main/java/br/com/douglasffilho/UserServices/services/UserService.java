package br.com.douglasffilho.UserServices.services;

import br.com.douglasffilho.UserServices.entities.User;
import org.hibernate.service.spi.ServiceException;

import java.util.List;

public interface UserService {
    public User save(User user) throws ServiceException;

    public List<User> list() throws ServiceException;

    public User findByName(String name) throws ServiceException;
}