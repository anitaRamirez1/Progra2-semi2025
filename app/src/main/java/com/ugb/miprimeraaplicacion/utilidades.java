package com.ugb.miprimeraaplicacion;

import java.util.Base64;


public class utilidades {
    static String url_consulta = "http://localhost:5984/_utils/#database/agenda/_design/agenda";
    static String url_mto = "http://192.168.56.1/agenda";
    static String user = "admin";
    static String passwd = "123456";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user + ":" + passwd).getBytes());
    public String generarUnicoId(){
        return java.util.UUID.randomUUID().toString();
    }
}
