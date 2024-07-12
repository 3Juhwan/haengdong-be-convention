package com.haengdong.application;

import com.haengdong.application.request.EventSaveAppRequest;
import com.haengdong.application.request.EventUpdateAppRequest;
import com.haengdong.application.response.EventAppResponse;
import com.haengdong.domain.event.Event;
import com.haengdong.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventAppResponse saveEvent(EventSaveAppRequest request) {
        Event event = request.toEvent();
        Event savedEvent = eventRepository.save(event);

        return EventAppResponse.of(savedEvent);
    }

    public EventAppResponse updateEvent(EventUpdateAppRequest request) {
        Event event = request.toEvent();
        Event savedEvent = eventRepository.save(event);

        return EventAppResponse.of(savedEvent);
    }
}
