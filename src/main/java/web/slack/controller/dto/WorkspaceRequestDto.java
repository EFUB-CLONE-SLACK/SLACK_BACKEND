<<<<<<< Updated upstream
package web.slack.controller.dto;public class WorkspaceRequestDto {
=======
package web.slack.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WorkspaceRequestDto {

    private String name;

    @Builder
    public WorkspaceRequestDto(String name){
        this.name = name;
    }

>>>>>>> Stashed changes
}
