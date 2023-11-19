package tr.com.huseyinaydin.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot, k8s, Kubernetes.
 *
 */

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/selamlar")
	public String displayMessage(){
		return "Merhabalar Spring Boot uygulamasını güzelce Kubernetes ile Deploy ettiniz.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
