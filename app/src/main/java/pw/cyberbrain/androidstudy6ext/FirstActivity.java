package pw.cyberbrain.androidstudy6ext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // Example explicit intent
        Button mNextButton = findViewById(R.id.nextButton);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(mIntent);
            }
        });

        // 3 Example implicit intents
        ImageButton mSocialVkontakte = findViewById(R.id.socialButtonVkontakte);
        mSocialVkontakte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com"));
                startActivity(mIntent);
            }
        });

        ImageButton mSocialFacebook = findViewById(R.id.socialButtonFacebook);
        mSocialFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fb.com"));
                startActivity(mIntent);
            }
        });

        ImageButton mSocialGoogleplus = findViewById(R.id.socialButtonGoogleplus);
        mSocialGoogleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com"));
                startActivity(mIntent);
            }
        });
    }
}
