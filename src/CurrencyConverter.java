import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverter {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/1b7be27a50966773cc54033a/latest/USD";
    private static final String[] CURRENCIES = {"USD", "EUR", "GBP", "JPY", "AUD", "CAD"};

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(API_URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            JsonObject jsonObject = JsonParser.parseString(response.body().string()).getAsJsonObject();
            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha a moeda de origem:");
            for (int i = 0; i < CURRENCIES.length; i++) {
                System.out.println((i + 1) + ". " + CURRENCIES[i]);
            }
            int fromChoice = scanner.nextInt() - 1;
            String fromCurrency = CURRENCIES[fromChoice];

            System.out.println("Escolha a moeda de destino:");
            for (int i = 0; i < CURRENCIES.length; i++) {
                System.out.println((i + 1) + ". " + CURRENCIES[i]);
            }
            int toChoice = scanner.nextInt() - 1;
            String toCurrency = CURRENCIES[toChoice];

            System.out.print("Digite o valor a ser convertido: ");
            double amount = scanner.nextDouble();

            double fromRate = rates.get(fromCurrency).getAsDouble();
            double toRate = rates.get(toCurrency).getAsDouble();

            double convertedAmount = (amount / fromRate) * toRate;

            System.out.printf("\n%.2f %s é equivalente a %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
        }
    }
}
