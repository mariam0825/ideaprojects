package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;

public interface TicketRepository {
    Ticket save(Ticket driver);

    long count();

    Ticket findById(int id);

    void del(int id);

    Ticket existById(int id);

    void deleteAll(int id);
}
