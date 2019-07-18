package com.ngangavictor.lipanampesa.stkpush;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.ngangavictor.lipanampesa.settings.SandBox;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import static com.ngangavictor.lipanampesa.okhttp.Network.getRequest;

public class StkPush {
    /*
    * Required Items
    *  1.Business Shortcode
    *  2.Timestamp
    *  3.Phone number
    *  4.password
    *  5.Transaction type
    *  6.Amount
    *  7.Party A
    *  8.Party B
    *  9.callBackUrl.
    *  10.Account reference
    *  11.Transaction Description
    */


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void stkpush(String businessShortCode, String password, String timestamp, String transactionType, String amount, String phoneNumber, String partyA, String partyB, String callBackURL, String accountReference, String transactionDesc) throws IOException,JSONException {

            JSONArray jsonArray=new JSONArray();
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("BusinessShortCode", businessShortCode);
            jsonObject.put("Password", password);
            jsonObject.put("Timestamp", timestamp);
            jsonObject.put("TransactionType", transactionType);
            jsonObject.put("Amount",amount);
            jsonObject.put("PhoneNumber", phoneNumber);
            jsonObject.put("PartyA", partyA);
            jsonObject.put("PartyB", partyB);
            jsonObject.put("CallBackURL", callBackURL);
            jsonObject.put("AccountReference", accountReference);
            jsonObject.put("TransactionDesc", transactionDesc);

            jsonArray.put(jsonObject);
            String requestJson=jsonArray.toString().replaceAll("[\\[\\]]","");

            getRequest(requestJson, SandBox.getStk_push_url());

    }






}
