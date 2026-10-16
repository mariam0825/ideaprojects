package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {
    private VehicleRepositoryImpl vehicleRepository;
    private Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicleRepository = new TicketRepositoryImpl();
        vehicle = new Vehicle();

    }

    @Test
    public void testThatTicketCanBeSaved() {
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        assertNotNull(savedVehicle);
        assertEquals(1, savedVehicle.getType());
    }

    @Test
    public void testThatTicketCountIsOneAfterSaving() {
        vehicleRepository.save(vehicle);
        assertEquals(1, vehicleRepository.count());
    }

    @Test
    public void testThatTicketCanBeFoundById() {
        ticketRepository.save(ticket);
        Ticket foundTicket = ticketRepository.findById(1);
        assertNotNull(foundTicket);
        assertEquals(1, foundTicket.getId());
    }

    @Test
    public void testThatDifferentTicketsHaveDifferentIds() {
        Ticket firstTicket = new Ticket();
        Ticket secondTicket = new Ticket();
        ticketRepository.save(firstTicket);
        ticketRepository.save(secondTicket);
        assertEquals(1, firstTicket.getId());
        assertEquals(2, secondTicket.getId());
    }

    @Test
    public void testThatTicketCanBeDeletedById() {
        ticketRepository.save(ticket);
        ticketRepository.del(1);
        assertEquals(1, ticketRepository.count());
    }

    @Test
    public void testThatAllTicketsCanBeDeleted() {
        ticketRepository.save(ticket);
        ticketRepository.save(new Ticket());
        ticketRepository.deleteAll(2);
        assertEquals(2, ticketRepository.count());
    }

}