package android.sairam.instagramcloneap;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MgTnDHxzMx79905uvaDWwS4I55iftDWuOGGpx8d8")
                // if defined
                .clientKey("EImYIfc8K9DUGXDn0Ld4eZARC8N0Q29f0p2REtvw")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }

}
