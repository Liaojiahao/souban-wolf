package com.souban.wolf.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by Apple on 11/9/16.
 */
public class MyX509TrustManager implements X509TrustManager {
    @Override
    public void checkClientTrusted(X509Certificate[] arg0, String arg1)
            throws CertificateException {
// TODO Auto-generated method stub
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arg0, String arg1)
            throws CertificateException {
// TODO Auto-generated method stub
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
// TODO Auto-generated method stub
        return null;
    }
}
