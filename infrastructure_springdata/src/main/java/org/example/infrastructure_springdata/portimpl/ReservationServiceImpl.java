package org.example.infrastructure_springdata.portimpl;

import org.example.dto.ReservationDTO;
import org.example.port.ReservationPort;
import org.example.infrastructure_springdata.entity.ReservationEntity;
import org.example.infrastructure_springdata.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl extends BaseServiceImpl<ReservationEntity, ReservationDTO, Long> implements ReservationPort {

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        super(reservationRepository);
    }

    @Override
    public List<ReservationDTO> getAll() {
        return super.getAll();
    }

    @Override
    public ReservationDTO getById(Long aLong) {
        return super.getById(aLong);
    }

    @Override
    public ReservationDTO save(ReservationDTO reservationDTO) {
        return super.save(reservationDTO);
    }

    @Override
    public ReservationDTO update(Long aLong, ReservationDTO reservationDTO) {
        return super.update(aLong, reservationDTO);
    }

    @Override
    public void delete(Long aLong) {
        super.delete(aLong);
    }

    @Override
    protected ReservationDTO convertToDTO(ReservationEntity reservationEntity) {
        return new ReservationDTO(reservationEntity.getId(), reservationEntity.getEventId(), reservationEntity.getUserName(), reservationEntity.getNumberOfTickets());
    }

    @Override
    protected ReservationEntity convertToEntity(ReservationDTO reservationDTO) {
        return ReservationEntity.builder()
                .eventId(reservationDTO.getEventId())
                .userName(reservationDTO.getUserName())
                .numberOfTickets(reservationDTO.getNumberOfTickets())
                .build();
    }

    @Override
    protected void setId(ReservationEntity reservationEntity, Long id) {
        reservationEntity.setId(id);
    }
}