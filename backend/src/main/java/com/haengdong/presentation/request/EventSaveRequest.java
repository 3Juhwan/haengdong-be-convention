package com.haengdong.presentation.request;

import com.haengdong.application.request.EventSaveAppRequest;
import com.haengdong.domain.member.Member;
import java.time.LocalDateTime;

public record EventSaveRequest(
        Member host,
        String title,
        String description,
        String location,
        Integer maxParticipantsCount,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime
) {

    public EventSaveAppRequest toAppRequest() {
        return new EventSaveAppRequest(
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
