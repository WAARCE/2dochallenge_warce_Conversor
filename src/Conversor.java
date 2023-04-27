import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class Conversor {

	public void SolesaDolar(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=USD&from=PEN" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " dólares");

		}

	}

	public void SolesaLibras(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=GBP&from=PEN" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " libras esterlinas");
		}
	}

	public void SolesaEuro(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=EUR&from=PEN" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " euros");
		}
	}

	public void DolaraSoles(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=PEN&from=USD" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " soles peruanos");
		}
	}

	public void LibrasaSoles(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=PEN&from=GBP" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " soles peruanos");
		}
	}

	public void EuroaSoles(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=PEN&from=EUR" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " soles peruanos");
		}
	}

	public void BolivianoaSoles(double valor) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(
						"https://api.apilayer.com/exchangerates_data/convert?to=PEN&from=BOB" + "&amount=" + valor))
				.header("apikey", "9xWNApiywuoeXBhRACGzLwSxTU7wHykP").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		// CONVERT RESPONSE STRING TO JSON ARRAY
		JSONObject jo = new JSONObject(response.body());
		// ITERATE THROUGH AND RETRIEVE CLUB FIELDS
		for (int i = 0; i < 1; i++) {

			BigDecimal number = jo.getBigDecimal("result");
			number = number.setScale(2, BigDecimal.ROUND_HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes " + number + " soles peruanos");
		}
	}

}
