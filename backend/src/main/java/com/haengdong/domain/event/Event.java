package com.haengdong.domain.event;

import com.haengdong.domain.member.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member host;

    private String title;

    private String description;

    private String location;

    private Integer maxParticipantsCount;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    @Builder
    public Event(
            Member host,
            String title,
            String description,
            String location,
            Integer maxParticipantsCount,
            LocalDateTime startDateTime,
            LocalDateTime endDateTime
    ) {
        this.host = host;
        this.title = title;
        this.description = description;
        this.location = location;
        this.maxParticipantsCount = maxParticipantsCount;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
}
