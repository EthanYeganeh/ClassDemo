package algonquin.cst2335.classdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView text = findViewById(R.id.editTextText2);
        btn.setOnClickListener(v -> {
            text.setText("ُText View has changed because of your action");
            btn.setText("You Clicked me!!!");
        });
    }
}