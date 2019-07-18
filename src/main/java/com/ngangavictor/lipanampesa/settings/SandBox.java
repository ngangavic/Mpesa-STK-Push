package com.ngangavictor.lipanampesa.settings;

public class SandBox {

    public static String access_token_url;
    public static String consumerKey;
    public static String consumerSecret;
    public static String businessShortCode;
    public static String passKey;
    public static String stk_push_url;
    public static String c2bSimulation_url;

//    public static final String access_token_url = "https://sandbox.safaricom.co.ke/oauth/v1/generate?grant_type=client_credentials";
//    public static final String consumerKey="hIxOVauUcaEKboAg6kn9misGEq8KSHbS";
//    public static final String consumerSecret="pVI6h0pdMwYytcti";
//    public static final String businessShortCode = "174379";
//    public static final String passKey="bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919";
//    public static final  String stk_push_url="https://sandbox.safaricom.co.ke/mpesa/stkpush/v1/processrequest";


    public static String getAccess_token_url() {
        return access_token_url;
    }

    public static void setAccess_token_url(String access_token_url) {
        SandBox.access_token_url = access_token_url;
    }

    public static String getConsumerKey() {
        return consumerKey;
    }

    public static void setConsumerKey(String consumerKey) {
        SandBox.consumerKey = consumerKey;
    }

    public static String getConsumerSecret() {
        return consumerSecret;
    }

    public static void setConsumerSecret(String consumerSecret) {
        SandBox.consumerSecret = consumerSecret;
    }

    public static String getBusinessShortCode() {
        return businessShortCode;
    }

    public static void setBusinessShortCode(String businessShortCode) {
        SandBox.businessShortCode = businessShortCode;
    }

    public static String getPassKey() {
        return passKey;
    }

    public static void setPassKey(String passKey) {
        SandBox.passKey = passKey;
    }

    public static String getStk_push_url() {
        return stk_push_url;
    }

    public static void setStk_push_url(String stk_push_url) {
        SandBox.stk_push_url = stk_push_url;
    }

    public static String getC2bSimulation_url() {
        return c2bSimulation_url;
    }

    public static void setC2bSimulation_url(String c2bSimulation_url) {
        SandBox.c2bSimulation_url = c2bSimulation_url;
    }
}
