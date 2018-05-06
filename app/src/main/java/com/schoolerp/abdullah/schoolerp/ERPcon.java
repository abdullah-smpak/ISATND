package com.schoolerp.abdullah.schoolerp;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by asp on 11/2/2017.
 */

public class
ERPcon {

    String  ip="203.130.21.202";
    String classs = "net.sourceforge.jtds.jdbc.Driver";
    String  dta="Safina Group";
    String un = "aptech";
    String password = "aptech";


    public Connection CONN() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;
        try {

            Class.forName(classs);
                /*ConnURL = "jdbc:jtds:sqlserver://" + ip + ";"
                        + "databaseName=" + db + ";user=" + un + ";password="
                        + password + ";";*/

            ConnURL = "jdbc:jtds:sqlserver://"+ip+":1433/"+dta+";user=admin1;password=Busi123ness;";

            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }

        return conn;
    }



}
