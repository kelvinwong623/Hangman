package leafstudios.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button playButton;
    private Button hiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playButton);
        hiButton = (Button) findViewById(R.id.hiButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGame();
            }
        });
    }

    public void playGame(){
        Intent intent = new Intent(this, gameplay.class);
        startActivity(intent);
    }
}
