package package1.com;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.xml.ws.Response;

@RestController
public class Program4 {
	
	@GetMapping("/chandu/api")
	public String give()
	{
		String myurl="https://api.bigdatacloud.net/data/reverse-geocode-client";
		var request=HttpRequest.newBuilder().GET().uri(URI.create(myurl)).build();
			var client=HttpClient.newBuilder().build();
		
			try {
				var response=client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			return response.body();
			}catch(Exception e) {
				System.out.println(e);
				return "error occur:" +e.getMessage();
			}
			
	}

}
