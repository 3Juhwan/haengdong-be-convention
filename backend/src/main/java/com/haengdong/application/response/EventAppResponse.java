package com.haengdong.application.response;

import com.haengdong.domain.event.Event;
import com.haengdong.domain.member.Member;
import java.time.LocalDateTime;

public record EventAppResponse(
        Long id,
        Member host,
        String title,
        String description,
        String location,
        Integer maxParticipantsCount,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime
) {

    public static EventAppResponse of(Event event) {
        return new EventAppResponse(
                event.getId(),
                event.getHost(),
                event.getTitle(),
                event.getDescription(),
                event.getLocation(),
                event.getMaxParticipantsCount(),
                event.getStartDateTime(),
                event.getEndDateTime()
        );
    }
}
