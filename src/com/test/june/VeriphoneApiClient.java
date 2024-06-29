package com.test.june;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class VeriphoneApiClient {
	private static final String API_KEY = "A1192A0D48984FDB8C7C7B87C46E8141";
    private static final String VERIPHONE_API_URL = "https://api.veriphone.io/v2/verify?key=" + API_KEY;

    public static boolean verifyMobileNumber(String mobileNumber) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(VERIPHONE_API_URL + "&phone=" + mobileNumber)
                    .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                JSONObject jsonResponse = new JSONObject(responseBody);
                return jsonResponse.getBoolean("phone_valid");
            } else {
                System.err.println("Error calling Veriphone API: " + response.code());
                return false;
            }
        } catch (Exception e) {
            System.err.println("Exception while calling Veriphone API: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String mobileNumber = "+1234567890"; // Replace with the actual mobile number
        boolean isValid = verifyMobileNumber(mobileNumber);
        System.out.println("Mobile number validity: " + isValid);
    }
}
