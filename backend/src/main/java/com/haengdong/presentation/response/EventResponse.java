package com.haengdong.presentation.response;

import com.haengdong.application.response.EventAppResponse;
import com.haengdong.domain.member.Member;
import java.time.LocalDateTime;

public record EventResponse(
        Long id,
        Member host,
        String title,
        String description,
        String location,
        Integer maxParticipantsCount,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime
) {

    public static EventResponse of(EventAppResponse eventAppResponse) {
        return new EventResponse(
                eventAppResponse.id(),
                eventAppResponse.host(),
                eventAppResponse.title(),
                eventAppResponse.description(),
                eventAppResponse.location(),
                eventAppResponse.maxParticipantsCount(),
                eventAppResponse.startDateTime(),
                eventAppResponse.endDateTime()
        );
    }
}
