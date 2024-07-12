package com.haengdong.application.request;

import com.haengdong.domain.event.Event;
import com.haengdong.domain.member.Member;
import java.time.LocalDateTime;

public record EventUpdateAppRequest(
        Member host,
        String title,
        String description,
        String location,
        Integer maxParticipantsCount,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime
) {

    public Event toEvent() {
        return new Event(host, title, description, location, maxParticipantsCount, startDateTime, endDateTime);
    }
}
