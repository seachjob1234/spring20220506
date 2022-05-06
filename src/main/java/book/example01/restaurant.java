package book.example01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class restaurant {

	@Setter(onMethod _ = @Autowired)
	private Chef chef;
	
}
