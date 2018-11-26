package main;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class MsgTest {

    public static void main(String args[]) {
         String ACCOUNT_SID = "AC6d2a6bc31413d24caff8375fc80aaad6";
         String AUTH_TOKEN = "4c89086e90084422fd6f68bec75efd48";
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber("+14056123926"),
                    new com.twilio.type.PhoneNumber("+15803079633"),
                    "Hello Piyush. I am sending a message from your random phone number. This is Piyush from the future. Hello Piyush. I am sending a message from your random phone number. This is Piyush from the future. Hello Piyush. I am sending a message from your random phone number. This is Piyush from the future.")
                    .create();

            System.out.println(message.getSid());
        }

}
