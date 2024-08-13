package org.example.config;

import org.example.infrastructure_springdata.portimpl.EventServiceImpl;
import org.example.infrastructure_springdata.portimpl.ReservationServiceImpl;
import org.example.infrastructure_springdata.repository.EventRepository;
import org.example.infrastructure_springdata.repository.ReservationRepository;
import org.example.service.BaseService;
import org.example.service.EventService;
import org.example.service.ReservationService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class RestAppInitializer implements ApplicationContextInitializer {

    private final ConfigurableApplicationContext infraContext;

    public RestAppInitializer(ConfigurableApplicationContext infraContext) {
        this.infraContext = infraContext;
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableBeanFactory registry = applicationContext.getBeanFactory();
        registry.registerSingleton("EventService", new EventService(new EventServiceImpl(infraContext.getBean(EventRepository.class))));
        registry.registerSingleton("ReservationService", new ReservationService(new ReservationServiceImpl(infraContext.getBean(ReservationRepository.class))));
    }
}