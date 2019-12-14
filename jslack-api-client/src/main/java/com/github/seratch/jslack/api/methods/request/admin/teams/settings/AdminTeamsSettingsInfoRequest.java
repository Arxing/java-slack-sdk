package com.github.seratch.jslack.api.methods.request.admin.teams.settings;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

/**
 * https://api.slack.com/methods/admin.teams.settings.info
 */
@Data
@Builder
public class AdminTeamsSettingsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id.
     */
    private String teamId;

}
