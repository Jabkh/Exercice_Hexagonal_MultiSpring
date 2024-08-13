package org.example.service;

import org.example.dto.ReservationDTO;
import org.example.port.ReservationPort;

import java.util.List;


public class ReservationService extends BaseService<ReservationDTO, Long> {

    private final ReservationPort reservationPort;

    public ReservationService(ReservationPort reservationPort) {
        this.reservationPort = reservationPort;
    }

    @Override
    public List<ReservationDTO> getAll() {
        return reservationPort.getAll();
    }

    @Override
    public ReservationDTO getById(Long id) {
        return reservationPort.getById(id);
    }

    @Override
    public ReservationDTO save(ReservationDTO reservationDTO) {
        return reservationPort.save(reservationDTO);
    }

    @Override
    public ReservationDTO update(Long id, ReservationDTO reservationDTO) {
        return reservationPort.update(id, reservationDTO);
    }

    @Override
    public void delete(Long id) {
        reservationPort.delete(id);
    }
}