package tatastrive.application.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        editText=findViewById( R.id.editText );
        ratingBar=findViewById( R.id.ratingBar );
        ratingBar.setOnRatingBarChangeListener( new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String s1=String.valueOf(editText.getText());
                float f=ratingBar.getRating();
                Toast.makeText( MainActivity.this, "Movie Name"+s1+"Rating:"+f, Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
