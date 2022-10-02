package shared;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // arguman alan bir constractor için 
public class GenericResponse {

	private String message;
}
