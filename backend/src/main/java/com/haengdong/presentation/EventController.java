package com.haengdong.presentation;

import com.haengdong.application.EventService;
import com.haengdong.application.response.EventAppResponse;
import com.haengdong.presentation.request.EventSaveRequest;
import com.haengdong.presentation.response.EventResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EventController {

    private final EventService eventService;

    @PostMapping("/api/meeting")
    public ResponseEntity<EventResponse> saveEvent(EventSaveRequest request) {
        EventAppResponse eventAppResponse = eventService.saveEvent(request.toAppRequest());

        return ResponseEntity.ok(EventResponse.of(eventAppResponse));
    }

    @PutMapping("/api/meeting")
    public ResponseEntity<EventResponse> updateEvent(EventSaveRequest request) {
        EventAppResponse eventAppResponse = eventService.saveEvent(request.toAppRequest());

        return ResponseEntity.ok(EventResponse.of(eventAppResponse));
    }
}
