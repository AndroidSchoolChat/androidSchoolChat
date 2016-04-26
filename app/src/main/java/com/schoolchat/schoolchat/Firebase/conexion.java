package com.schoolchat.schoolchat.Firebase;

public class conexion {
    //Pasamos la url de nuestra aplicacion en firebase
    public static final String FIREBASE_SCHOOLCHAT="https://schoolchatandroid.firebaseio.com";
    public static final String CHILD_USERS="usuarios";
    public static final String CHILD_GROUPS="grupos";
    public static final String CHILD_CHAT="chat";
    public static final String CHILD_CONNECT="conexion";
    //estos seran los campos que se guardaran con cada usuario en la base de datos
    public static final String KEY_EMAIL="email";
    public static final String NOMBRE="nombre";
    public static final String USER_EMAIL="userEmail";
    public static final String ESTADO_ONLINE="online";
    public static final String ESTADO_OFFLINE="offline";
    public static final String FECHA="creado_en";
}