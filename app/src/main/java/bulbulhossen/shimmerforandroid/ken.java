package bulbulhossen.shimmerforandroid;

        import android.app.Activity;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import com.flaviofaria.kenburnsview.KenBurnsView;


public class ken extends Activity {


    private KenBurnsView mImg;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kenburnsview);
        mImg = (KenBurnsView) findViewById(R.id.bulbul);

    }

}
