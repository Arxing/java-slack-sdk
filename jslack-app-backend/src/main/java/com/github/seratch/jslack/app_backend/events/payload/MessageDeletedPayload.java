package com.github.seratch.jslack.app_backend.events.payload;

import com.github.seratch.jslack.api.model.event.MessageDeletedEvent;
import lombok.Data;

import java.util.List;

@Data
public class MessageDeletedPayload implements EventsApiPayload<MessageDeletedEvent> {

    private String token;
    private String enterpriseId;
    private String teamId;
    private String apiAppId;
    private String type;
    private List<String> authedUsers;
    private List<String> authedTeams;
    private String eventId;
    private Integer eventTime;

    private MessageDeletedEvent event;
}
