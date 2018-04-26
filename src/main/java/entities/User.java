package entities;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
public class User {

    String email;
    String password;
}
