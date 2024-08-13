package org.example.service;

import org.example.port.EventPort;
import org.example.dto.EventDTO;

import java.util.List;


public class EventService extends BaseService<EventDTO, Long> {

    private final EventPort eventPort;

    public EventService(EventPort eventPort) {
        this.eventPort = eventPort;
    }

    @Override
    public List<EventDTO> getAll() {
        return eventPort.getAll();
    }

    @Override
    public EventDTO getById(Long id) {
        return eventPort.getById(id);
    }

    @Override
    public EventDTO save(EventDTO eventDTO) {
        return eventPort.save(eventDTO);
    }

    @Override
    public EventDTO update(Long id, EventDTO eventDTO) {
        return eventPort.update(id, eventDTO);
    }

    @Override
    public void delete(Long id) {
        eventPort.delete(id);
    }
}