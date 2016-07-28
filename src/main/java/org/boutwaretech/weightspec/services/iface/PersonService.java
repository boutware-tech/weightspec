package org.boutwaretech.weightspec.services.iface;

import org.boutwaretech.weightspec.domain.Person;

public interface PersonService<P extends Person> {

    Iterable<P> listAllPersons();
    
    P getPerson(String personId);
}
