package mate.academy.rickandmorty.dto.api;

import java.util.List;
import lombok.Data;

@Data
public class ApiResponseDto {
    private ApiInfoDto info;
    private List<ApiCharacterDto> results;
}
