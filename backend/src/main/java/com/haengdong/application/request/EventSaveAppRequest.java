package com.haengdong.application.request;

import com.haengdong.domain.event.Event;
import com.haengdong.domain.member.Member;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public record EventSaveAppRequest(

        @NotEmpty
        Member host,

        @NotEmpty
        String title,

        @NotEmpty
        @Size(min = 1, max = 1000)
        String description,

        String location,

        Integer maxParticipantsCount,

        LocalDateTime startDateTime,

        LocalDateTime endDateTime
) {

    public Event toEvent() {
        return new Event(
                host,
                title,
                description,
                location,
                maxParticipantsCount,
                startDateTime,
                endDateTime
        );
    }
}
